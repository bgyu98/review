package basic1;

//import java.lang.String;

public class Ex01_Var {	// extends Object {
	// * 멤버변수
	/*
	 * 자료형(data type) 
	 * 1.기본형
	 *  
	 * boolean 
	 * char 
	 * int/long 
	 * double
	 * 
	 * 2.참조형
		` 클래스
 		` 배열 
 			- > new 예약어를 통해 객체를 생성
	 * 
	 * (*) String
	 */
	
	String a;
	int b;
	public static void main(String[] args) {
		// * 지역변수
		
		String a;	//문자열 변수 a 선언
		int b;	//정수 변수 b 선언
		
		//변수 a에 "Hello"를 지정
		a = "Hello";
		// ****** 
		// a = new String("Hello");
		
		//변수 b에 200 대입
		b = 200;
		
		//변수 a와 b를 콘솔에 출력
		System.out.println(a +"\n"+ b);
		
	}

}
