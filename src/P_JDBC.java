import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class P_JDBC {

	public static void main(String[] args) {
		Connection conn = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection( 
					"jdbc:mysql://localhost:3306/testdb?serverTimeZone = Asia/Seoul", 
					"root", 
					"root1234");
			System.out.println(conn);
			System.out.println(" 데이터 베이스 접속 성공 ");
		
			Statement stmt = conn.createStatement();
			
			String sql4 = "insert into Persons (id)" + "values('20')";
		
			
			int result = stmt.executeUpdate(sql4);
			
			
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
