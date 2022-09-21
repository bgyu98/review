package basic3;

public class Ex01_함수2 {

	public static void main(String[] args) {
		
		
		int sum = add();
		//합을 여기서 출력
		System.out.println("합은 : " + sum);
		
		int sum2 = add2();
		System.out.println("합은 : " + sum2);
		
		String sum3 = add3();
		System.out.println(sum3);
	}
	static int add() {
		int a = 20, b = 20;
		int sum = a + b;
		return sum;
	}
	static int add2() {
		int a = 20, b = 30;
		int sum2 = a + b;
		return sum2;
	}
	static String add3() {
		String a = "어";
		String b = "려";
		String c = "워";
		String sum3 = a + b + c;
		return sum3;
	}

}
