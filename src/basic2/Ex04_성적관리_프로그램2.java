package basic2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex04_성적관리_프로그램2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);	//input = 스캐너변수

		System.out.print("입력할 학생수를 입력하세요.");
		int student_number = input.nextInt();	// student_number에 스캐너변수 입력
		input.nextLine(); //엔터키 없애기
		String students[] = new String[student_number]; // students배열 생성 후 배열 안에 입력된 변수 저장

		System.out.printf("\n%d명의 국어, 영어, 수학 점수를 받아 결과 출력하기\n",student_number);

		//점수 입력
		for(int i = 0; i < students.length; i++) {
			System.out.print(i+1+"번 째 학생의 성적을 입력 -> ");
			students[i] = input.nextLine();	//students 배열에 성적 입력
		}//for
		System.out.println();

		//학생 총점, 과목총점 구하기
		int kor_total = 0;
		int eng_total = 0;
		int mat_total = 0;
		for(int i = 0; i < students.length; i++) {
			StringTokenizer st = new StringTokenizer(students[i],"/");
			int total = 0;
			int count = 0;
			while(st.hasMoreTokens()) {
				int grade = Integer.parseInt(st.nextToken());
				total += grade;
				if(count == 0) kor_total += grade;
				if(count == 1) eng_total += grade;
				if(count == 2) mat_total += grade;
				count++;
			}//while
			//출력
			System.out.println(i+1+"번 째 학생의 총점 "+total +" 이고 평균은 "+total/count+" 입니다");
		}//for

		System.out.println("\n------------------------------------------------------------");
		System.out.println("국어과목 총점 "+kor_total+" 이고 평균은 "+kor_total/student_number+" 입니다");
		System.out.println("영어과목 총점 "+eng_total+" 이고 평균은 "+eng_total/student_number+" 입니다");
		System.out.println("수학과목 총점 "+mat_total+" 이고 평균은 "+mat_total/student_number+" 입니다");

		input.close();
	}


}

