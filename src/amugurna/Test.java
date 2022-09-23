package amugurna;

public class Test {

	public static void main(String[] args) {
		
//		Main_Test m = new Main();
		
		Book b = new Book("001", "사피엔스", "하라리", "코스모출판");
		b.output();
		System.out.println();
		
		Cd c = new Cd("002","노래이름","가수이름");
		c.output();
		System.out.println();
		
		Dvd d = new Dvd("003","영화제목","배우이름","감독이름");
		System.out.println();
		d.output();
		
	}

}
