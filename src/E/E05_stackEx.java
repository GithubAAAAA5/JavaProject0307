package E;
import java.util.Stack;

public class E05_stackEx {

	public static void main(String[] args) {
		// Stack
		Stack<Integer> st = new Stack<Integer>();
		st.add(1);
		st.push(2);
		st.add(3);
		st.push(4);
		
		System.out.println(st.toString());
		System.out.println(st.get(0));		// list 에서 가져옴
		System.out.println(st.search(1));	// vector 에서 가져옴
		System.out.println();
		
		while(!st.isEmpty()) {
			System.out.println(st.pop());
			
		}
		
	}

}
