import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;

public class I02_urlEx {

	/*
	 *  URL 객체를 생성
	 *   - URL url = new URL("전체주소");
	 *   - URL url = new URL("전체주소");
	 *   - URL url = new URL("호스트명", 포트번호, "경로/파일명");
	 *   
	 */
	public static void main(String[] args) {
		
		try {
			URL url = null;
			url = new URL("https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=url");
			
			System.out.println("authoryity : " + url.getAuthority());
			System.out.println("content : " + url.getContent());
			System.out.println("protocol : " + url.getProtocol());
			System.out.println("host : " + url.getHost());
			System.out.println("port : " + url.getPort());
			System.out.println("path : " + url.getPath());
			System.out.println("file : " + url.getFile());
			System.out.println("query : " + url.getQuery());
			
			// url을 통해서 정보 읽기
			int data = 0;
			try {
				Reader is = new InputStreamReader(url.openStream());
				while((data = is.read()) != -1) {
					System.out.print((char)data);
				}
				System.out.println();
			} catch (IOException e) {
				System.out.print(e.getMessage());
			}
			
			// URLConnection
			// 추상 클래스로 URL간의 연결을 담당하는 역할을 한다.
			// URLConnection 을 상속받아 구현한 클래스이다. HttpURLConnection
			
			url = null;
			String address = "https://www.egovframe.go.kr/home/sub.do?menuNo=9";
			
			try {
				url = new URL(address);			
			URLConnection conn = url.openConnection();		// openConnection 이  - url connection 를 반환
			
			System.out.println("conn.toString() : " + conn);
			System.out.println("getAllowUserInteracion() : 	" + conn.getAllowUserInteraction());
			System.out.println("getConnectTimeout() : " +conn.getConnectTimeout());
			System.out.println("getContent : " + conn.getContent());
			System.out.println("getContentEncoding" + conn.getContentEncoding());
			System.out.println("getContentlength : " + conn.getContentLength());
			System.out.println("getContentType : " + conn.getContentType());
			System.out.println("getDate : + " + conn.getDate());
			System.out.println("getDefaultAllowUserInteraction() : " 
					+ conn.getDefaultAllowUserInteraction());
			System.out.println("getDefaultUseCaches() : " + conn.getDefaultUseCaches());
			System.out.println("getDoInput() : " + conn.getDoInput()); 
			System.out.println("getDoOutput() : " + conn.getDoOutput());
			System.out.println("getExpiration() : " + conn.getExpiration());
			System.out.println("getHeaderFiels() " + conn.getHeaderFields());
			System.out.println("getIfModifiedSince() : " + conn.getIfModifiedSince());
			System.out.println("getLastModified() : "  + conn.getLastModified());
			System.out.println("getReadTimeout() : " + conn.getReadTimeout());
			System.out.println("getURL() : " + conn.getURL());
			System.out.println("getUseCaches() : " + conn.getUseCaches());
			
			BufferedReader br = null;
			String readline = "";
			
			try {
				url = new URL(address);
				br = new BufferedReader(
						new InputStreamReader(url.openStream()));
				
				while ((readline = br.readLine()) != null) {
					System.out.println(readline);
				}				
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try { if(br != null) br.close(); } catch (Exception e) {}
			}
			
		} catch (Exception e) {
		
		}
		
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}

}

}


















