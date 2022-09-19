package basic1;

import java.time.Year;
import java.util.Calendar;

/*
 * 제어문 : 프로그램 흐름을 변경하기 위해
 * 
 * 		1) if
 * 		2) switch
 * 		3) for
 * 		4) while / do~while
 * 
 * 		5) break / continue
 */

public class Ex02_control {

	public static void main(String[] args) {
		
		String id = null;	//주민번호
		int nyun = 0;	//지금의 년대를 저장할 변수
		char sung = id.charAt(7);	//sung의 7번째 자릿수에 있는 문자를 뽑아옴
		// sung 변수에 문자가 1이면 남자 출력
		// 그렇지 않으면 여자
		
		if(sung == '1' || sung == '3' || sung == '9') {
			System.out.println("남자");
		}else if (sung == '2' || sung == '4' || sung == '0') {
			System.out.println("여자");
		}else
			System.out.println("잘못된 입력");
		
		if(sung == '1' | sung == '2') {	//1,2면 1900년대생
			nyun = 1900;
		}else if(sung == '3' | sung == '4') {	//3,4면 2000년대생
			nyun = 2000;
		}else
		
		System.out.println("===출생===");
		char chull = id.charAt(8);
		
		System.out.println(chull);
		// chull 변수가 0 이라면 '서울'
		// chull 변수가 1 이라면 '인천/부산'
		// chull 변수가 2 이라면 '경기'
		// ~
		// chull 변수가 9 이라면 '제주'
		
		switch (chull) {	//문자, 정수, 문자열
		case '0':
			System.out.println("서울 출신");
			break;
		case '1':
			System.out.println("인천/부산 출신");
			break;
		case '2':
			System.out.println("경기 출신"); 
			break;
		case 9:
			System.out.println("제주 출신"); 
			break;
		default:
			System.out.println("잘못된 입력");
			break;
		}
		
		String nai = id.substring(0, 2);	//nai = 주민번호 0부터1자리 까지 문자를 뽑아옴
		System.out.println("===년생===");
		System.out.println("문자열 : " + nai);
//		int sunai = (int)nai;
		
		int sunai = Integer.parseInt(nai);	//sunai = nai의 문자열을 숫자로 바꿈
		System.out.println("숫자 : " + sunai);
		
		System.out.println("===나이===");
		int age = 0;
		
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		
		age = year/*2022*/ - (nyun/*1900*/ + sunai/*99*/) + 1;		//(2022 - 1999) + 1
		System.out.println(age);
		
	}
	
}
