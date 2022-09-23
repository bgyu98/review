package 평가;

public class Book2 {
	String bookName;		//책 제목 저장 변수
	String writer;			//저자 저장 변수
	String publisher;		//출판사 저장 변수
	
	public void print() {
		System.out.println("책 제목 : " + bookName);
		System.out.println("저자 : " + writer);
		System.out.println("출판사 : " + publisher);
	}
	
	public static void main(String[] args) {
		Book book = new Book();
		book.bookName = "개미";
		book.writer = "베르나르베르베르";
		book.publisher = "히히출판사";
		
		book.print();
	}
}
