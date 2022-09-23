package basic4;

import java.util.Scanner;

class CalculatorExpr{
	private int num1 = 0;
	private int num2 = 0;
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	int getAddition = num1 + num2;
	int getSubtraction = num1 - num2;
	int getMultiplication = num1 * num2;
	double getDivision = num1 / num2;

	public int getGetAddition() {
		return getAddition;
	}
	public void setGetAddition(int getAddition) {
		this.getAddition = getAddition;
	}
	public int getGetSubtraction() {
		return getSubtraction;
	}
	public void setGetSubtraction(int getSubtraction) {
		this.getSubtraction = getSubtraction;
	}
	public int getGetMultiplication() {
		return getMultiplication;
	}
	public void setGetMultiplication(int getMultiplication) {
		this.getMultiplication = getMultiplication;
	}
	public double getGetDivision() {
		return getDivision;
	}
	public void setGetDivision(double getDivision) {
		this.getDivision = getDivision;
	}
	
}

public class CalculatorTest {

	public static void main(String[] args) {
		System.out.println("두 수를 입력하세요>>");
		Scanner sc = new Scanner(System.in);
		CalculatorExpr expr = new CalculatorExpr();
		//expr.
		//System.out.println(expr.getAddition);
	}

}
