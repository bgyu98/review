package basic2;

public class Ex01_while개념 {

	public static void main(String[] args) {
		//0. for문
//		int sum = 0;
//		for(int i = 1; i <= 10; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
		//1. while
//		int sum = 0;
//		int i = 1;
//		while (i <= 10) {
//			sum+=i;
//			i++;
//			System.out.println(sum);
//		}
//		System.out.println(sum);
		
		//2. do~while
		int i = 1;
		int sum = 0;
		do {
			sum+=i;
			i++;
		}while (i <= 10);
			System.out.println(sum);
		
		
		

	}

}
