package basic3;

public class Ex03_CallByValue {

	public static void main(String[] args) {
		
		int a = 10, b = 20;
		add(a,b);
		System.out.println("A = " + a + " B = " + b);		//2, 10, 20
		
	}
	static void add(int a, int b) {
		a += b;
		System.out.println("A = " + a + " B = " + b);		//1, 30, 20
	}
}
