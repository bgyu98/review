package 평가;

public class Book {
	String bookName;		//책 제목 저장 변수
	String writer;			//저자 저장 변수
	String publisher;		//출판사 저장 변수
	
	public void print() {
		System.out.println("책 제목 : " + bookName);
		System.out.println("저자 : " + writer);
		System.out.println("출판사 : " + publisher);
	}

}
