package a1_practice;

public class pp21 {

	public static void main(String[] args) {		

		
//		로또 번호를 담아둘 길이가 6인 정수 타입의 배열 변수 생성
		int[] lotto = new int[6];
		
//		1~45 까지의 번호중 하나를 뽑는다
		int index = 0;
		while (true) {
			int number = (int)(Math.random()*45)+1;
//		math 라는 클래스의 random() 메서드를 실행하는것인데 0부터 1미만의 랜덤 실수를 구하는 기능이며
//		이랜덤수에 45를 곱하면 0부터 45미만의 소수점이 있는 실수가 나오게된다.
//		이를 앞에서 INT로 형변환을 해주었기때문에 소수점이 사라진 0부터 44의 숫자가 나오게 되고 이에 1을 더하여 1 부터 45의 수를 넣을수 있게 된다.
		
			
//		만약 뽑은 번호가 배열에 있다면 다시 뽑고, 
						
//			boolean 의 변수 insert를 이용하여 번호 중복여부를 확인하고 중복이면 false 로 설정 이에 break 를 걸어 변수에 추가되지 않도록 한다.
			boolean insert = true;	
			
//			인덱스를 0부터 index변수 까지 하나씩 반복하며 위에서 구한 1-45사이의 랜덤수와 중복된 번호가 있는지 확인한다
//			중복된 번호가 있다면 insert false를 이용 break
			for (int i = 0; i <= index; i++) {
				if (lotto[i] == number) {
					insert = false;
					break;
				}
			}
			
//		없다면 배열에 넣는다.		
//			insert가 true일때 lotto[] 배열에 숫자를 대입하고 index에 index++ 로 1 더해준다
			if (insert == true) {
				lotto[index] = number;
				index++;
			}
			
			
//		6개의 번호를 다 뽑을때 까지 반복한다.		
//			insert true 로 index에 숫자를 대입하고 index++ 로 1을 더하다보면 index==6이 되는순간이 온다 이는 숫자 6개를 다 뽑았다는 의미
			if (index == 6) break;
		}

//		6개의 번호를 출력한다.
		for (int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i]);
		}

	}

}
