package basic1;

public class Ex03_for응용 {

	public static void main(String[] args) {

		for(int r=0, a=1; r<26; r++, a++) {
			for(char ch='A'; ch<='Z'; ch++) {
			System.out.print(ch);
			}System.out.println( " "+a);
		}
	}

}
