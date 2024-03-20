package obj.exception;

import java.io.IOException;
import java.sql.SQLException;

public class Child extends Parents {

//	@Override
////	public void doIt() throws SQLException {		// 부모가 throws 하지 않은 Exception은 throws 할 수 없다.
//		System.out.println("Child.doIt");			// 부모는 IOException 를 throws 했기때문에
//		try {										// SQLException 은 불가능
//			super.doIt();
//		} catch (IOException e) {
//			throw new SQLException(e.getMessage());
//		}
//	}

}
