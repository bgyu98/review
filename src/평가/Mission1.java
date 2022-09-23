package 평가;

import java.util.Calendar;

public class Mission1 {
	public static void main(String[] args) {
		int year = 1999;	//내가 태어난 년도		// 가
		int age;	//나이를 저장할 변수
		
		Calendar today = Calendar.getInstance();	//today 객체 생성 후 calendar에서 getinsatnce 저장
		int nowyear = today.get(Calendar.YEAR);	//시스템상 년도 구하기
		
		System.out.print("나이 : ");
		System.out.println(age = nowyear - year + 1);	//나이 출력
		System.out.println("age :" + age);
		System.out.println("year : " + year);
		
	}
}
