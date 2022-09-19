package basic1;

import java.util.Scanner;

public class Ex02_If_Test01 {
	public static void main(String[] args) {
		
		System.out.println("학번 입력 >> ");
		Scanner input = new Scanner(System.in);
		String id = input.next();

		
		String year = id.substring(0,4);		//년도
		String outputColl = null;				//단과대 출력
		char coll = id.charAt(4);				//단과대 번호
		String outputMajor = null;				//학과 출력
		String major = id.substring(5,7);		//학과 번호
	
		switch (coll) {
		case '1':
			outputColl = "공대";
			break;
		case '2':
			outputColl = "단과대";
			break;
		default:
			System.out.println("잘못 입력함");
			break;
		}
		
		if(coll == '1') {
			switch (major) {
			case "11":
				outputMajor = "컴퓨터학과";
				break;
			case "12":
				outputMajor = "소프트웨어학과";
				break;
			case "13":
				outputMajor = "모바일학과";
				break;
			case "22":
				outputMajor = "자바학과";
				break;
			case "33":
				outputMajor = "서버학과";
				break;
			default:
				System.out.println("잘못 입력함");
				break;
			}
		}if(coll == '2') {
			switch (major) {
			case "11":
				outputMajor = "사회학과";
				break;
			case "12":
				outputMajor = "경영학과";
				break;
			case "13":
				outputMajor = "경제학과";
				break;
			default:
				System.out.println("잘못 입력함");
				break;
		}
		
		/*
		if(coll == '1') {outputColl = "공대";}
		else if(coll == '2') {outputColl = "사회대";}
		
		if(coll == '1') {
			if(major.equals("11")) {outputMajor = "컴퓨터학과";}
			if(major.equals("12")) {outputMajor = "소프트웨어학과";}
			if(major.equals("13")) {outputMajor = "모바일학과";}
			if(major.equals("22")) {outputMajor = "자바학과";}
			if(major.equals("33")) {outputMajor = "서버학과";}
		} else if(coll == '2') {
			if(major.equals("11")) {outputMajor = "사회학과";}
			if(major.equals("12")) {outputMajor = "경영학과";}
			if(major.equals("13")) {outputMajor = "경제학과";}
		}else {
			System.out.println("학번을 잘못 입력하셨습니다");
			return; }
		*/
	

		System.out.println(id + " 는 " +year + "년도에 입학한 " + outputColl +" "+ outputMajor + " 학생입니다.");
		
	/*	if(num1 == '1') {
			switch (num2) {
			case "11":
				System.out.println(id + " 는 " +year + "년도에 입학한 " + num1_1 +" "+ num2_1 + " 학생입니다."); break;
			case "12":
				System.out.println(id + " 는 " +year + "년도에 입학한 " + num1_1 +" "+ num2_1 + " 학생입니다."); break;
			case "13":
				System.out.println(id + " 는 " +year + "년도에 입학한 " + num1_1 +" "+ num2_1 + " 학생입니다."); break;
			case "22":
				System.out.println(id + " 는 " +year + "년도에 입학한 " + num1_1 +" "+ num2_1 + " 학생입니다."); break;
			case "33":
				System.out.println(id + " 는 " +year + "년도에 입학한 " + num1_1 +" "+ num2_1 + " 학생입니다."); break;
			}
		}
		if(num1 == '2') {
			switch (num2) {
			case "11":
				System.out.println(id + " 는 " +year + "년도에 입학한 " + num1_1 +" "+ num2_1 + " 학생입니다."); break;
			case "12":
				System.out.println(id + " 는 " +year + "년도에 입학한 " + num1_1 +" "+ num2_1 + " 학생입니다."); break;
			case "13":
				System.out.println(id + " 는 " +year + "년도에 입학한 " + num1_1 +" "+ num2_1 + " 학생입니다."); break;
				}
			
		}
		*/
	}
}
}
