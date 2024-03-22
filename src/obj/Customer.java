package obj;

import java.io.Serializable;

public class Customer implements Serializable {

	private static final long serialVersionUID = -1L;			//객체를 구분하기 위한 고유값 -1
			
	private String name;
	private char gender;
	private String email;
	private int birthYear;
	private transient boolean isJoin;		//	transient 에 해당하는 내용은 저장 되어 지지 않는다.
	
	// 기본 생성자
	public Customer() {}


	// 필드 생성자
	public Customer(String name, char gender, String email, int birthYear) {
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.birthYear = birthYear;
	}

	// getter setter	
	public String getName() {
		return name;
	}


	public char getGender() {
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


	public void setGender(char gender) {
		this.gender = gender;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	
	
	
	public boolean isJoin() {
		return isJoin;
	}


	public void setJoin(boolean isJoin) {
		this.isJoin = isJoin;
	}


	// toString
	@Override
	public String toString() {
		
		return "Cusstomer [name = " + name + ", gender = " + gender + ", email = " + email + ", birthYear = " + birthYear + "]";
	}
}
