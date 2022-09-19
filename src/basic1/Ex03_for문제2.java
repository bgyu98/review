package basic1;

public class Ex03_for문제2 {

	public static void main(String[] args) {
		// 
		for(int i = 25; i >= 0; i--) {
			for(char ch = 'A'; ch <= 'A'+i; ch++) {
				System.out.print(ch);
			}System.out.println();
		}

	}

}
