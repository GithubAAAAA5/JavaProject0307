import java.io.File;
import java.io.IOException;

public class F01_fileEx {
	
	static String env_path = "C:\\Program Files\\Amazon Corretto\\jdk17.0.10_7\\bin;C:\\Windows\\system32;C:\\Windows;C:\\Windows\\System32\\Wbem;C:\\Windows\\System32\\WindowsPowerShell\\v1.0\\;C:\\Windows\\System32\\OpenSSH\\;C:\\Program Files\\Bandizip\\;C:\\Program Files\\Docker\\Docker\\resources\\bin;C:\\Program Files\\Git\\cmd;C:\\Users\\tjoeun\\AppData\\Local\\Microsoft\\WindowsApps;";

	public static void main(String[] args) {
	
		// FIle 객체는 파일과 디렉터리 작업을 위해서 사용하는 객체
		
		File f = new File("D:/AWS JAVA CLASS/FileTest/a.txt");		// 뒤에 / 가 붙으면 디렉토리   /가 붙지않으면 파일
		File dir = new File("./");			// 현재 작업위치
		
		// 1. exists () : 파일 혹은 디렉터리 존재 유무를 확인할 수 있다.
		System.out.println("exists? : " + f.exists());
		System.out.println("exists? : " + dir.exists());
		
		// 2. isDirectory () : 디렉토리 여부 확인 (파일이면 false)
		System.out.println("isDirectory? : " + f.isDirectory());
		System.out.println("isDirectory? : " + dir.isDirectory());
		
		// 3. isAbsolute() : 해당 경로가 절대 경로인지 아닌지 확인한다. 	// 절대경로 -> c 나 d 부터 모든경로가 나와있는것
																// 상대경로 -> 현재 경로부터 위로 올라가는것
		System.out.println("isAbsolute? : " + f.isAbsolute());
		System.out.println("isAbsolute? ; " + dir.isAbsolute());
		
		// 4. canExecute, canRead, canWrite : 권환 확인
		System.out.println("canExecute? : " + f.canExecute());
		System.out.println("canRead? : " + f.canRead());
		System.out.println("canWrite? : " + f.canWrite());
		
		// 5. getAbsolutePath : 절대 경로 반환 (상대경로의 절대경로를 찾아준다)
		System.out.println("./의 실제 위치(절대 경로) : " + dir.getAbsolutePath());		// 깃 저장 로컬 위치
		
		// 6. 부모 폴더를 문자열로 반환
		System.out.println(f.getParent());			// 문자열		//나는 d awsjavaclass filetest에 속해있다.
		
		// 7. 부모 폴더를 File 객체로 반환
		File f_parent = f.getParentFile();			// 파일 객체
		System.out.println(f_parent);
		
		// 8. static 값들.
		System.out.println(File.separator);
		System.out.println(File.separatorChar);
		System.out.println(File.pathSeparator);
		System.out.println(File.pathSeparatorChar);
		
		// 환경 변수
		String[] path = env_path.split(File.pathSeparator);
		
		for (String p : path) {
			System.out.println(p);
		}
		
		// 파일에 대한 생성/수정/삭제 메서드
		
		File test = new File("D:\\AWS JAVA CLASS\\FileTest\\temp\\abc");
		// mkdir : 해당 경로에 폴더 생성한다. 단, 경로상 없는 폴더가 없어야 한다.
		// mkdirs : 존재하지 않는 부모 경로 폴더까지 모두 포함하여 폴더를 생성한다.
		if (!test.exists()) {		// 파일 폴더가 존재하지 않는 경우...
			test.mkdirs();			
			
		}
		
		// createNewFile() : 파일이 없으면 새로 생성
		test = new File("D:/AWS JAVA CLASS/FileTest/temp/a.txt");
		try {
			test.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("파일 생성 중 에러가 발생하였습니다.");
		}
		
		// delete : 파일 혹은 폴더를 삭제한다. 단, 폴더는 비어있지 않으면 삭제할 수 없다.
		test = new File("D:/AWS JAVA CLASS/FileTest/temp/abc");
		test.delete();
//		test = new File("D:/AWS JAVA CLASS/FileTest/temp/a.txt");
//		test.delete();
//		test = new File("D:/AWS JAVA CLASS/FileTest/temp");
//		test.delete();
		
		// renameTo : 파일이나 폴더의 이름 및 경로를 변경합니다.
		test = new File("D:/AWS JAVA CLASS/FileTest/temp");
		File dst = new File("D:/AWS JAVA CLASS/FileTest/temp2");
		test.renameTo(dst);
	}

}

