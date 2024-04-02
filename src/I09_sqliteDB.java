import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class I09_sqliteDB {

	public static void main(String[] args) {
		//SQLite DB연결하기
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// 1. 드라이버 로드
			Class.forName("org.sqlite.JDBC");
			
			// 2. Connection 객체 생성
			String dbfile = "SQLiteDB.db";	// 실제 DB파일이 있는 경로
			String url = "jdbc:sqlite:"+dbfile;
			// url -> jdbc:sqlite:SQLiteDB.db
			//                   : 파일명
			
			conn = DriverManager.getConnection(url);
			System.out.println("DB 동작에 문제가 없습니다.");
			
			// 3. stmt 객체 생성
			stmt = conn.createStatement();
			String sql = "create table if not exists test_table("			//존재하지 않으면 실행
											+ "id integer primary key,"
											+ "lastName text(20) not null,"
											+ "firstName text(20),"
											+ "age numeric,"
											+ "city text(20) default 'Seoul')";
			int result = stmt.executeUpdate(sql);
			System.out.println("sql 처리 결과 : " + result);
//			System.out.println("sql 처리 결과 : " + (result!=0? "성공":"실패"));
			
			
			
			
			
		} catch (ClassNotFoundException ce) {
			System.out.println("드라이버 연동 실패");
			
		} catch (SQLException sqle) {
			System.out.println("SQL 연동 실패");
			System.out.println(sqle.getMessage());
			
		} finally {
			
			try {
				if (conn != null) conn.close();
				if (stmt != null) stmt.close();
				if (rs != null) rs.close();
				
			} catch (Exception e2) {}
		}
		
	}

}
