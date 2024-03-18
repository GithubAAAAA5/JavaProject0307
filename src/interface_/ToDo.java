package interface_;

public class ToDo implements ToDo3, ToDo4 {		//ToDo3 에 ToDo1 ToDo2 가 상속되어있기때문에  전부 불러와진다
	

	@Override
	public void m1() {
		System.out.println("m1() 구현");
	}

	@Override
	public void m2() {
		System.out.println("m2() 구현");
	}

	@Override
	public void m4() {
		System.out.println("m4() 구현");
	}

	@Override
	public void m3() {
		System.out.println("m3() 구현");
	}

}
