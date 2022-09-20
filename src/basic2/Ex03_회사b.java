package basic2;

import java.util.Scanner;

public class Ex03_회사b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("몇까지?");
		int num = sc.nextInt();
		int count = 0;
		
		for(int i = 1; i <= num; i++) {
			int su = i;
			boolean su369 = false;
			
			while(su!=0) {
				int na = su % 10;
				
				if(na == 3 || na == 6 || na == 9) {
					su369 = true;
				}
				su = su/10;
			}
			if(su369) {
				System.out.print("짝-");
				count+=1;
			}else {
				System.out.print(i + "-");
			}
		}
		System.out.println("\n몇 번 까지? : " + num);
		System.out.println("손뼉을 친 횟수 : " + count);

	}

}
