import java.io.FileOutputStream;

public class F08_textWriteApplication {

	public static void main(String[] args) {

		String data1 = "홍길동,M,hong@naver.com,1589";
		String data2 = "강감찬,M,Kang@naver.com,879";
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("customer.txt");
			fos.write(data1.getBytes());
			fos.write('\n');						// 레코드 구분자를 추가한다.	data1 과 data2 사이를 구분
			fos.write(data2.getBytes());
			System.out.println("File saved");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(fos != null) try {fos.close();} catch (Exception e2) {}
		}

	}

}
