package inherit;

public class mainTest {

	public static void main(String[] args) {

	/*	System.out.println("==엄마==");
		Mom u = new Mom();
		u.job();
		u.gene();
		
		System.out.println("\n==딸==");
		Dauther d = new Dauther();
		d.job();
		d.gene();
		d.study();
		*/
		
//		Dauther d = new Mom();		//오류** 없는 메모리 참조
		
		// * 부모 변수에 자식객체 생성이 가능
	/*	Mom u = new Dauther();
		u.gene();
		u.job(); 	*/
//		u.study();
		
		// * 형변환 : (casting)
		//	1> 기본형끼리
		// 	2> 참조형에서 상속관계있는 경우만 가능
		
		//		String s = new String("~~");
		//		StringBuffer sb = (StringBuffer)s; --> x
		
//		Mom u = new Mom();
//		Dauther d = (Dauther)u;
		
		Daughter d = new Daughter();
		Mom u = (Mom)d;
		Daughter d2 = (Daughter)u;
		
	}

}
