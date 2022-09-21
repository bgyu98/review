package basic3;

public class Ex09_AsumTest {

	public static void main(String[] args) {
		
		int sum = sumFunc(100);
		System.out.println("합 : " + sum);

	}

	static int sumFunc(int a) {
		if(a == 1) return 1;
		
		return a + sumFunc(a-1);
	}
}
