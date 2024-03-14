package customermanager.oop;

public class Customer {
	
	// 멤버 변수 ( 속성 )
	private String name;		//패키지 내에서는 볼 수 있지만 외부에서는 볼 수 없다.
	private String gender;
	private String email;
	private int birthYear;
	
	// Alt + Shift + S -> fron superclass
	
	public Customer() {	}	// 기본 생성자

	// Alt + Shift + s -> using field
	public Customer(String name, String gender, String email, int birthYear) {		// 필드 생성자
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.birthYear = birthYear;
	}


	// Getter, Setter
	 // Alt Shift S -> generate getter & setters
	
	
	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getEmail() {
		return email;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	
	//Alt Shift S -> Generate toString
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", gender=" + gender + ", email=" + email + ", birthYear=" + birthYear + "]";
	}
	
	
	

}
