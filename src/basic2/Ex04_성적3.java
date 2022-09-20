package basic2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex04_성적3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int kor[] = new int[4];
		
		System.out.println(kor.length + "명의 국어/영어/수학 점수를 입력하세요(ex.10/20/30)");
		String inputData = input.nextLine();
		StringTokenizer st = new StringTokenizer(inputData, "/");
		for(int i = 0; st.hasMoreTokens(); i++) {
			String str = st.nextToken();
			kor[i] = Integer.parseInt(str);
		}
		
		//for(int i = 1; i<kor.length; i++) {
			//System.out.println(i + "번 학생의 국어점수를 입력 > ");
			//kor[i] = input.nextInt();
		//}
		
		for(int i = 0; i<kor.length; i++) {
		System.out.println(i + "번 학생의 점수 : " + kor[i]);
		}
	
		//위 학생들 점수의 총점과 평균을 출력
		int sum = 0;
		int count = 0;
		for(int i = 1; i<kor.length; i++) {
			sum+=kor[i];
			count++;
		}
		System.out.print("총점 : " + sum + "\t");
		System.out.println("평균 : " + sum/(double)count);
		
		
		
	}

}
