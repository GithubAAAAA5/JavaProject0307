package quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import util.Closer;

public class Quiz_HashMapPhoneBook {
	
	// PhoneBook 을 위한 객체 멤버
	
	static PhoneBook book = new PhoneBook();
	static Scanner sc = new Scanner(System.in);


	public static void doNewGroup() {
		System.out.println(" Enter New Group Name > ");
		book.addGroup(sc.nextLine());
		book.save();
		System.out.println();
	}
	
	public static void doNewAddress() {
		System.out.println(" Enter Group Name > ");
		String groupName = sc.nextLine();
		
		
		System.out.println(" Enter Phone Number > ");
		String number = sc.nextLine();
		
		System.out.println(" Enter Name > ");
		String name = sc.nextLine();
		
		AddPhMessage addMsg = book.addPhoneNo(groupName, number, name);
		// addMsg 를 적절히 처리한다.
		if(addMsg.type == AddPhMessage.ADD_SUCCESS)
			book.save();
		else if (addMsg.type == AddPhMessage.NOT_EXISTING_GRUOP) {
			System.out.println(addMsg.msg);		// 더이상 진행하지 않습니다.
			return;
		} else if (addMsg.type == AddPhMessage.EXISTING_NUMBER) {
			// 수정 여부 선택 // 수정해서 다시 등록 하거나 등록하지 않는것중 선택
		}
	}
	
	public static void doFindPhone() {
		System.out.println(" Enter Phone Number > ");
		String number = sc.nextLine();
		book.searchByNumber(number);
	}
	
	public static void doFindName() {
		System.out.println(" Enter Name > ");
		String name = sc.nextLine();
		book.searchByName(name);
	}
	
	public static void main(String[] args) {
	      
	      
	      while (true) {
	         System.out.println("==== What to do ====");         
	         System.out.println("1. New Group");
	         System.out.println("2. Print");
	         System.out.println("3. New Address");
	         System.out.println("4. Find Phone");
	         System.out.println("5. Find Name");
	         System.out.println("6. Exit");
	         System.out.print("> ");
	         int behavior = sc.nextInt();
	         sc.nextLine();							// 버퍼 정리 하기 위해
	         
	         switch (behavior) {
	         case 1:
	            doNewGroup();
	            break;
	         case 2:
	            book.printAll();
	            break;
	         case 3:
	            doNewAddress();
	            break;
	         case 4: 
	        	 doFindPhone();
	        	 break;
	         case 5:
	        	 doFindName();
	        	 break;
	         case 6:
	        	 System.out.println("프로그램을 종료합니다.");
	        	 System.exit(0);
	         default:
	        	 System.out.println("메뉴 선택을 잘못했습니다.");
	            break;
	         }
	      }      
	   }
}
/*
 * PhoneBook 클래스...

// HashMap을 이용해 전화번호부를 구현해보세요   
// 1. '그룹/전화번호/이름'을 저장해야 한다
// 2. 그룹을 키값으로 넣으면 그 그룹에 해당하는 HashMap이 선택된다
// 3. 그룹의 HashMap에 전화번호를 키값으로 넣으면 이름이 나온다

// ### 메서드 ###
// 1. PhoneBook에 새로운 그룹을 추가하는 메서드
// 2. PhoneBook의 모든 목록을 한번에 출력해주는 메서드
// 3. 이미 존재하는 그룹에 전화번호를 추가하는 메서드 
   (그룹이 없으면 추가 못함)
// 4. 전화번호의 일부를 입력하면 입력한 부분과 일치하는 모든 사람의 목록을 출력하는 메서드
// 5. 이름을 입력하면 해당하는 사람의 전화번호를 모두 출력하는 메서드 (동명이인이 있는 경우 여러개 출력되야함)

// ※ 변경된 내용이 파일에 저장되어 프로그램을 다시 실행할때도 유지되도록 만들어보세요


PbConsole의 메인
public static void main(String[] args) {
      
      
      while (true) {
         System.out.println("==== What to do ====");         
         System.out.println("1. New Group");
         System.out.println("2. Print");
         System.out.println("3. New Address");
         System.out.println("4. Find Phone");
         System.out.println("5. Find Name");
         System.out.println("6. Exit");
         System.out.print("> ");
         int behavior = sc.nextInt();
         sc.nextLine();
         
         switch (behavior) {
         case 1:
            doNewGroup();
            break;
         case 2:
            book.printAll();
            break;
         case 3:
            doNewAddress();
         case 4:            
         case 5:
         case 6:
         default:
            break;
         }
      }      
   }
 * 
 * 
 */

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class PhoneBook {
// HashMap을 이용해 전화번호부를 구현해보세요   
// 1. '그룹/전화번호/이름'을 저장해야 한다
// 2. 그룹을 키값으로 넣으면 그 그룹에 해당하는 HashMap이 선택된다
// 3. 그룹의 HashMap에 전화번호를 키값으로 넣으면 이름이 나온다

	HashMap<String, HashMap < String, String >> PhoneBook;

	File saveFile = null;
	String savePath = "saveFile/PhoneBook.sav";

	public PhoneBook() {
		// 객체 생성시 파일에 저장된 내용을 불러오는 동작을 한다.
		// 파일이 존재하면, 내용을 불러오고 
		// 파일이 존재하지 않다면 디렉토리 및 생성을 한다.
		PhoneBook = new HashMap<String, HashMap<String,String>>();
		saveFile = new File(savePath);			// File 객체 생성 - 저장 파일에 대한 작업을 진행하기 위해 
		if(!saveFile.exists()) {		//만약 if 세이브파일이 savefile 없다면 !exists
			File dir = new File(saveFile.getParent());
			dir.mkdir();
		}
		load();							// 세이브파일이 있다면 load한다.
		// 객체 실행시 파일의 정보를 불러와서 정보를 완성한다.
	}
	
	
	// 메서드
	// 1. PhoneBook 에 새로운 그룹을 추가하는 메서드
	public void addGroup(String groupName) {
		if(!PhoneBook.containsKey(groupName)) {
			PhoneBook.put(groupName, new HashMap<String, String>());
			
		}
	}

	// 2. PhoneBook 의 모든 목록을 한번에 출력해주는 메서드
	public void printAll() {
		
		Set<String> groupNames = PhoneBook.keySet();
		
		for(String groupName : groupNames) {
			System.out.println(" * * * * * " + groupName + " * * * * * ");
			
			// 전화번호(key값) 이름(value값) 전화번호는 중복되면 안된다.
			HashMap<String, String> numberAndNames = PhoneBook.get(groupName);
			if ( numberAndNames.size() == 0) {
				System.out.println("비어 있음");
			} else {
				for (String number : numberAndNames.keySet()) {
					System.out.printf(" %s : %s\n " , numberAndNames.get(number), number);
				}
			}
		}
			
	}
	
	// 3. 이미 존재하는 그룹에 전화번호를 추가하는 메서드 ( 그룹이 없으면 추가하지 못한다. )  // 그룹이 있으면 추가해주고 그룹이 없다면 그룹이 없다는 메세지 출력, 이미 저장된 전화번호라면 
	// 저장된 전화번호라는 메세지 출력 ,   저장이 잘 이루어진 경우에 대한 메세지 출력
	public AddPhMessage addPhoneNo(String groupName, String number, String name) {
		if(!PhoneBook.containsKey(groupName)) {
			return new AddPhMessage("없는 그룹입니다." , AddPhMessage.NOT_EXISTING_GRUOP);	// 상수값을 이용해서 현재 상황을 전달
		} else {
			HashMap<String, String> numberAndNames = PhoneBook.get(groupName);	// 전화번호가 중복되는것이 있는지 체크해야 함.
			
			if(checkDuplecateNumber(number) ) {
				return new AddPhMessage("이미 등록된 번호입니다. 수정하시겠습니까?" , AddPhMessage.EXISTING_NUMBER);
			}
			
			numberAndNames.put(number, name);
			return new AddPhMessage("정상적으로 등록되었습니다." , AddPhMessage.ADD_SUCCESS);
		}
	}
	
	// 모든 전화번호를 HashSet으로 반환하는 메서드
	private Set<String> getAllNumber() {
		HashSet<String> allNumbers = new HashSet<>();
		
		for (HashMap<String, String> group : PhoneBook.values()) {
			allNumbers.addAll(group.keySet());
		}	
		return allNumbers;	// 그룹상관없이 모든 전화번호를 불러옴
	}	
	
	// 전화번호가 중복되는것이 있는지 체크하는 메서드		//위에서 불러온 전화번호를 대조 체크
	private boolean checkDuplecateNumber(String number) {
		return getAllNumber().contains(number);		// 
	}
	
	// 4. 전화번호의 일부를 입력하면 입력한 부분과 일치하는 모든 사람의 목록을 출력하는 메서드
	public void searchByNumber(String number) {
		System.out.println(" * * * * * " + number + " * * * * * ");
		for(HashMap<String, String> group : PhoneBook.values()) { 		// 각그룹에 있는 전화번호와 이름을 불러온다.
			for(String key : group.keySet()) {			// key 는 전화번호
				if(key.contains(number)) {				// 문자열에 입력한 내용중 일치하는 부분이 있다면 출력
					System.out.printf(" %s : %s\n " , group.get(key) , key);
				}
			}
		}
	}
	
	// 5. 이름을 입력하면 해당하는 사람의 전화번호를 모두 출력하는 메서드 ( 동명이인이 있는 경우 여러개의 저장목록이 출력되어야한다. )
	public void searchByName(String inputName) {
		System.out.println(" * * * * * " + inputName + " * * * * * ");
		for(HashMap<String, String> group : PhoneBook.values()) {		// 이름으로 검색하는데 같이 묶여와야함
			for(Entry<String, String> entry : group.entrySet()) {		// value 값과 key 값을 묶어서 한번에 사용하기 위해서 entryset을 사용한다.
				String number = entry.getKey();
				String name = entry.getValue();							// 이름을 확인하고 그 이름에 속해있는 이름과 전화번호를 출력한다.
				if(name.contains(inputName)) {
					System.out.printf(" %s : %s\n " , name, number);
				}	
			}
		}	
	}
	
	// 변경된 내용이 파일에 저장되어 프로그램을 다시 실행할때도 유지되도록 만들기 // 저장과 불러오기
	public void save() {
		FileWriter out = null;
		
		try {
			out = new FileWriter(saveFile);				// save하기전에 디렉토리가 이미 만들어져 있다. 고로 디렉토리가 존재하는지 확인할필요가없다. 덮어씌우기때문에 확인할필요가없다.
			// 전화번호부의 내용을 나름의 문자열로 구성해서 저장한다.
			for(String gruopName : PhoneBook.keySet()) {
				out.write(gruopName + " : ");
				for(Entry<String, String> entry : PhoneBook.get(gruopName).entrySet()) {
					out.write(String.format(" %s = %s " , entry.getKey(), entry.getValue()));
				}
				out.write('\n');//줄바꿈
				// groupName : number = name 
				// groupName : number = name 
				// 이런 식으로 저장이된다.
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(out != null) Closer.closer(out);
		}
	}
	public void load() {
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(saveFile));
			String line = null;
			while ((line = in.readLine()) != null) {
				String[] groupAndEntry = line.split(" : ");
				// 함수를 심플하게 만들어 사용하면 재사용성이 올라갈 수 있다.
				if(groupAndEntry.length == 1) {
					addGroup(groupAndEntry[0]);
				}else {
					addGroup(groupAndEntry[0]);
					String[] entry = groupAndEntry[1].split(" ");			// 각 그룹으로 나눠지게 된다. 각 그룹의 전화번호 이름
					
					for(String e : entry) {
						String[] phoneAndName = e.split(" = ");
						addPhoneNo(groupAndEntry[0], phoneAndName[0], phoneAndName[1]);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(in != null) Closer.closer(in);
		}
		
	}
}	

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class AddPhMessage {		// 전화번호 저장의 처리 결과를 나타내는 클래스
	
	String msg;
	int type;
	
	// 상수 처리
	final static int NOT_EXISTING_GRUOP = 0;		// 0 1 2 는 각각의 값을 지정해준것
	final static int EXISTING_NUMBER = 1;
	final static int ADD_SUCCESS = 2;
	
	public AddPhMessage(String msg, int type) {
		this.msg = msg;
		this.type = type;
	}
	
	@Override
		public String toString() {
			return msg;
		}
}



	

	   
	

