package basic2;

public class Ex05_로또 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
				}
			}
		}


		//버블 정렬
		for (int i = lotto.length - 1; i>0 ; i--) {
			for (int j = 0; j < i; j++) {
				if (lotto[j] > lotto[j + 1]) {
					int temp = lotto[j];
					lotto[j] = lotto[j + 1];
					lotto[j + 1] = temp;

				}
			}
		}
		for(int i = 0; i<lotto.length; i ++) {
			System.out.print(lotto[i] + " ");
		}
	}
}

/*
 * Math.random() : 0.0 ~ 소수점수 ~ 1.0
 * 
 * ex) 0.1234 0.00123 0.5673 0.9999
 * 
 * Math.random() * 10
 * 
 * ex) 0.1234 * 10 = 1.234 0.00123 * 10 = 0.0123 0.5673 * 10 = 5.673 0.9999 * 10
 * = 9.999
 * 
 * (int)(Math.random() * 10)
 * 
 * ex) 0.1234 * 10 = 1.234 => 1 0.00123 * 10 = 0.0123 => 0 0.5673 * 10 = 5.673
 * => 5 0.9999 * 10 = 9.999 => 9
 * 
 */
