package basic1;

public class Ex03_for문제5 {

	public static void main(String[] args) {
		// 
		for(int i = 0; i < 26; i++) {
		for(int j = 0; j < i; j++)
		System.out.print(" ");
			for(char ch = (char) ('A' + i); ch <= 'Z'; ch++) {
				System.out.print(ch);
			}System.out.println();
		}
	}

}
