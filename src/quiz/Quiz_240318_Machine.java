package quiz;



interface Remocon { 
	public void on();
	public void off();
}

class Machine	{
	
	protected String name;
	
	//	기본 생성자 생략
	
	// getter, setter
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static void machineWork(Remocon remocon, Machine machine) {
		remocon.on();
		remocon.off();
	}
}


class TV1 extends Machine{
	public TV1(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return super.getName();
	}
	
	@Override
	public void setName(String name) {
		super.setName(name);
	}
	
	public void show() {
		System.out.println("방송 중입니다.");
	}
}

class AC extends Machine{
	public AC(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return super.getName();
	}
	
	@Override
	public void setName(String name) {
		super.setName(name);
	}
	
	private void show() {
		System.out.println("냉방중입니다.");
	}
}

class CP extends Machine{
	public CP(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return super.getName();
	}
	
	@Override
	public void setName(String name) {
		super.setName(name);
	}
	
	private void show() {
		System.out.println("실행중입니다.");
	}
}
public class Quiz_240318_Machine {

	public static void main(String[] args) {
		Machine tv = new TV1("TV");
		Machine computer = new CP("컴퓨터");
		Machine aircon = new AC("에어컨");
		
		
//		Machine computer = new Machine();
//		computer.setName("컴퓨터");
		
		Machine.machineWork(new Remocon() {
			
			@Override
			public void on() {
				System.out.println(tv.getName() + " 를 켭니다.");
			}
			
			@Override
			public void off() {
				System.out.println(tv.getName() + " 를 끕니다.");
			}
		}
		, tv);
		
		Machine.machineWork(new Remocon() {
			
			@Override
			public void on() {
				System.out.println(computer.getName() + "를 켭니다.");
			}
			
			@Override
			public void off() {
				System.out.println(computer.getName() + "를 끕니다.");
			}
		}
		, computer);
		
		Machine.machineWork(new Remocon() {
			
			@Override
			public void on() {
				System.out.println(aircon.getName() + "를 켭니다.");
			}
			
			@Override
			public void off() {
				System.out.println(aircon.getName() + "를 끕니다.");
			}
		}
		, aircon);

		
	}
}
