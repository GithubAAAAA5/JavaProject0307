package I;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * # JAVA에서 DB연동(JDBC - Java Database Connectivity)

연동 작업 순서!!
 
 1. Driver Loading : DB연동을 위해서 구현된 라이브러리를 호출
     => Class.forName("드라이버 이름")
 
 2. DriverManager를 통한 Connection 생성
     => DriverManager.getConnection() 메서드를 통해서 Connection 객체 생성
       * getConnection(String url, String user, String password)
         - url : DB연동을 위한 DB주소
         - user : DB 접속 사용자
         - password : DB 접속 사용자의 패스워드
 
 3. Connection 객체를 통해서 Statement 객체를 생성 
     => Statement 객체는 SQL을 실행하기 위한 객체. createStatement()로 생성
 
 4. SQL 작성 : DB에서 실행할 SQL을 작성
  
 5. SQL 실행 : Statement 객체 내의 메서드를 실행!
    - executeUpdate() : Insert, Update, Delete 쿼리 사용시 쓰는 메서드
          	반환 타입이 정수 : 0이면 실패, 1이면 성공
    
    - executeQuery() : select SQL쿼리를 사용할 경우에 쓰는 메서드
    		반환 타입이 ResultSet 객체로 전달 받음. 
    		ResultSet에 제공하는 메서드를 통해서 결과값을 읽어 올 수 있음. 
    		** ResultSet의 주요 메서드
    		1. next() : select 쿼리의 결과값 존재 여부를 확인하는 메서드. 반환 타입 boolean.
    		2. getString(String name) : name 컬럼의 문자 타입의 데이터 읽어오기 
    		3. getInt(String name) : name 컬럼의 정수 타입 데이터 읽어오기
    		4. getDouble(String name) : name 컬럼의 실수 타입 데이터 읽어오기
    		...
 */

public class I06_JDBC {
	
	public static void main(String[] args) {
		// JDBC 연동 테스트 
		
		// 데이터베이스 연결 객체 (Connection 객체)
		Connection conn = null;
		
		// checkedException : SQLException
		
		try {
			// 1. 드라이버 로드
			// MySQL 사용 드라이버
			// MySQL 6.xx 버전 이전 : com.mysql.jdbc.Driver
			// MySQL 6.xx 버전 이후 : com.mysql.cj.jdbc.Driver
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. Connection 객체 생성 - DriverManger
			// MySQL 6.xx미만인 경우 : jdbc:mysql://호스트이름:포트번호/DB이름
			// MySQL 6.xx이후인 경우 : jdbc:mysql://호스트이름:포트번호/DB이름?serverTime=UTC
			// 서울 UTC값 : Asia/Seoul
			conn = DriverManager.getConnection( 
					"jdbc:mysql://localhost:3306/testdb?serverTimeZone = Asia/Seoul", 
					"root", 
					"root1234");
			System.out.println(conn);
			System.out.println(" 데이터 베이스 접속 성공 ");
			
			// Insert, Update, Delete - executeUpdate()  -  반환 타입이 int
			// 3. Statement 객체 생성... createStatement()
			Statement stmt = conn.createStatement();
			
			// 4. SQL 작성 
			String sql1 = "insert into Persons (firstn, lastn, age, city)"
						+ "values('jdbcTest', 'testuser13', 24, 'Seoul')";
			String sql2 = "update persons set firstn = '순신' , lastn = '이' " + "where id = 14";
			
			String sql3 = "delete from persons where id = 14";
			// sql3 으로 14에 해당하는 내용을 delete 하였다. sql2로 다시 입력하니 오류가 발생. 14자리에 다시 넣는방법이 무엇일까?
			
			// 5. Statement 객체를 통해서 작성된 SQL 을 실행
			int result = stmt.executeUpdate(sql2);
			// 성공시 : 1
			// 실패시 : 0
			
			if(result != 0) {
				System.out.println(" SQL 성공 ");				
			} else {
				System.out.println(" SQL 실패 ");
			}
			
			
		} catch (ClassNotFoundException ce) {
			System.out.println(" 드라이버 로드 실패 ");
		} catch (SQLException sqle) {
			System.out.println(" SQL 연동 오류 ");
			System.out.println(sqle.getMessage());
		} finally {
			try {
				
			} catch (Exception e) {
				
			}
		}
		
		

	}

}









