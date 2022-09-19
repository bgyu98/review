package basic1;

public class Ex03_for문제4 {

	public static void main(String[] args) {
		// 
		for(int i = 25; i >= 0; i--) {
			for(char ch = 'Z'; ch >= 'A'+i; ch--) {
				System.out.print(ch);
			}System.out.println();
		}

	}

}
