package amugurna;

public class Book extends Main_Test{
	
	private String writer;
	private String publisher;
	
	public Book() {
		this("000","제목없음","무명","출판사");
		System.out.println("Book 기본생성자");
	}
	
	public Book(String num, String name, String writer, String publisher) {
//	super.num = num;
//	super.name = name;
	super(num,name);
	this.writer=writer;
	this.publisher = publisher;
	System.out.println("Book 인자 생성자");
	}
	
	public void output() {
//		System.out.println("책제목 : "+ name + "	저자: " + writer +"\t 출판사 : "+ publisher + "	책 번호 : " +num);
//		System.out.println("===============================================================================\n");
		System.out.println("번호 : " + num);
		System.out.println("책이름 : " + name);
		System.out.println("저자 : " + writer);
		System.out.println("출판사 : " + publisher);
	}
}
