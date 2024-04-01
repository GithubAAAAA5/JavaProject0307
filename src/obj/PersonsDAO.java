package obj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonsDAO {

	// DAO 클래스 (Data Access Object Class)
	// - 데이터베이스에 접속하여 데이터의 CRUD 등의 작업을 하는 클래스
	// - 일반적으로 다른 프로그램 로직 위에서 동작하기도 하지만, 별도의 DAO 클래스를 만들어 사용하기도 한다.
	// -->>> 유지보수 및 코드의 모둘화를 위해서
	
//	보통은 한개의 테이블 마다 한개의 DAO 를 작성한다.
//	DAO 클래스는 각 테이블에 저장한다.
//	때문에 DAO를 구현하면 테이블의 컬럼과 매핑되는 값을 가지고 있는 클래스를 항상 작성해한다.
//	이 클래스를 VO클래스라 한다.
	
	// 멤버 변수 = 필드 속성
	// Connection 객체를 생성하기 위한 값
	private String url = "jdbc:mysql://localhost:3306/testdb?serveImezone=Asia/Seoul";
	private String user = "root";
	private String password = "root1234";
	
	// 데이터 접속을 위한 객체
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	
	//생성자
	public PersonsDAO() {
		
		try {
			// 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Connection 객체 생성
			conn = DriverManager.getConnection(url, user, password);
			System.out.println(" connection 객체 생성! ");
			
			
		} catch (ClassNotFoundException ce) {
			System.out.println(" 드라이버 로드 실행");
			System.out.println(ce.getMessage());
			
		} catch (SQLException	sqle) {
			System.out.println("SQL연동 샐패");
			System.out.println(sqle.getMessage());
		}
	}
	
	
	// CRUD 메서드
	
	// 1. 데이터 입력 메서드
	public int insert(PersonsVO vo) {
		int result = 0;
		
		String sql = "insert into Persons (lastn, firstn, age, city)" 
								+ "values('"+vo.getLastname()+"','"+vo.getFirstname()+"',"+vo.getAge()+" ,'"+vo.getCity()+"')";
								
		try {
			//Statement 객체 생성
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			System.out.println("SQL 연동 에러");
			System.out.println(e.getMessage());
			
		} finally {
			
			try {
				if(stmt != null) stmt.close();
				
			} catch (Exception e2) {}
		}
		
		return result;
	}
	
	// 2. 정보 출력 메서드
	// 전체 테이블 정보 출력
	public List<PersonsVO> allPersons() {
		List<PersonsVO> list = new ArrayList<>();
		
		String sql = "select*from Persons";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int id = rs.getInt("id");
				String lastName = rs.getString("lastn");
				String firstName = rs.getString("firstn");
				int age = rs.getInt("age");
				String city = rs.getString("city");
				
				PersonsVO vo = new PersonsVO(id, firstName, lastName, age, city);
				list.add(vo);
			}
			
		} catch (SQLException e) {
			System.out.println("SQL 연동 실패");
			System.out.println(e.getMessage());
			
		} finally {
			
			try {
				if(stmt != null) stmt.close();
				if(rs != null) rs.close();
				
			} catch (Exception e2) {

				
			
			}
		}
		
		return list;
	}
	
	// id 입력값을 통한 정보 출력
	public PersonsVO selectOne(int id) { 
		PersonsVO vo = null;
		
		String sql = "select*from persons where id = " + id;
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			if (rs.next()) {
				vo = new PersonsVO();
				vo.setId(rs.getInt("id"));
				vo.setLastname(rs.getString("lastn"));
				vo.setFirstname(rs.getString("firstn"));
				vo.setAge(rs.getInt("age"));
				vo.setCity(rs.getString("city"));
				
			} else {
				System.out.println(" 찾으시는 DB가 존재하지 않습니다. ");
			}
			
		} catch (SQLException e) {
			System.out.println("SQL 연동 실패");
			System.out.println(e.getMessage());

		} finally {
			
			try {
				if (stmt != null) stmt.close();
				if (rs != null) rs.close();
			} catch (Exception e2) {}
		}
		
		return vo;
	}
	
	
	// 3. 정보 수정 메서드
								// PersonsVO -> 전체값
	public int updatePersons(PersonsVO vo) {
		int result = 0;
		
		String sql = "update persons set "
					+ "firstn = '" +vo.getFirstname() 
					+ "', lastn = '" + vo.getLastname() 
					+ "', age = " + vo.getAge() 
					+ ", city = '" + vo.getCity() 
					+ "' where id = " + vo.getId();
		
		try {
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			System.out.println("SQL 연동 실패");
			System.out.println(e.getMessage());
			
		} finally {
			
			try {
				if(stmt != null) stmt.close();
			} catch (Exception e2) {}
		}
		
		
		return result;
	}
	
	
	// 4. 정보 삭제 메서드
	
	public int deletePersons(int id) {
		int result = 0;
		
		String sql = "delete from persons where id = " + id;
		
		try {
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			
		} catch (Exception e) {					//Exception 이 SQLException 의 상위이기 떄문에 다 처리해준다.
			System.out.println("SQL 연동 실패");
			System.out.println(e.getMessage());
			
		} finally {
		
			try {
				if(stmt != null) stmt.close();
			
			} catch (Exception e) {}
		}
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
