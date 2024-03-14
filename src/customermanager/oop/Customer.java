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
	
	// equals() 를 Override 하여 비교할수 있게 만들어라.
	
	@Override
	public boolean equals(Object obj) {
		// 동일 객체 확인
		if(this == obj) {
			return true;
		}
		
		// null값 확인
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Customer other = (Customer)obj;
		if(name == null) {
			if (other.name != null) {
				return false;
				}
			}else if (!name.equals(other.name)) 
				return false;
			if (!gender.equals(other.gender)) 
				return false;
			if (!email.equals(other.email)) 
				return false;
			if (!(birthYear == other.birthYear)) 
				return false;
			
			return true;
			
		
	}

}

