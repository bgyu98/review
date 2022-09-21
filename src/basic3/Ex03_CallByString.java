package basic3;

public class Ex03_CallByString {

	public static void main(String[] args) {

		String a = new String("안녕");
		String b = new String("하이");

		add(a, b);
		System.out.println("1.A = " + a + " B = " + b); // 3, 안녕 하이

	}

	static void add(String a, String b) {
		a+=b; // 1 안녕하이
		System.out.println("2.A = " + a + " B = " + b); // 2, 안녕 하이 하이
	}

}
