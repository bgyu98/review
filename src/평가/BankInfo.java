package 평가;

import java.util.Scanner;

//ah == account holder (예금주) 변수
//ban == bank account number (계좌번호) 변수
//bal == balance (잔액) 변수

public class BankInfo {
	String ah = "자바맨";
	String ban = "123-456";
	int bal = 1000;

	@Override
	public String toString() {
		return "예금주:" + ah + ", 계좌번호:" + ban + ", 잔액:" + bal + "원";
	}

	public static void main(String[] args) {

		BankInfo bi = new BankInfo();
		Scanner sc = new Scanner(System.in);
		System.out.println("입금하시려면 1번, 출금하시려면 2번, 종료하시려면 3번을 눌러주세요.");
		int num = sc.nextInt();
		int num2 = 0;
		
			switch (num) {
			case 1:
				System.out.println("입금할 금액>>");
				int inMoney = sc.nextInt();
				bi.bal += inMoney;
				System.out.println("입금 : " + inMoney);

			case 2:
				System.out.println("출금할 금액>>");
				int outMoney = sc.nextInt();
				bi.bal -= outMoney;
				if(bi.bal > 0) {
					System.out.println(bi.bal + "원");
				}else {
					System.out.println("잔액이 부족합니다.");
				}


		}
		sc.close();
		System.out.println(bi.toString());



	}
}
