package basic3;

public class Ex03_CallByRef {

	public static void main(String[] args) {
		
		StringBuffer a = new StringBuffer("안녕");
		StringBuffer b = new StringBuffer("하이");
		
		add(a,b);
		System.out.println("1.A = " + a + " B = " + b);		//3, 안녕 하이

	}

	static void add(StringBuffer a, StringBuffer b) {
		a.append(b);										//1 안녕하이
		System.out.println("2.A = " + a + " B = " + b);		//2, 안녕 하이 하이

		
	}
}

/*
 * 문자열 처리 클래스
 * 
 * - String
 * 
 * - StringBuffer / StringBuilder
 * 
 * 
 */
