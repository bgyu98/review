package amugurna;

public class Cd extends Main_Test{
	
	private String singer;
	
	
	public Cd() {}
	public Cd(String num, String name, String singer) {
	super.num = num;
	super.name = name;
	this.singer = singer;
	}
	public void output() {
//		System.out.println("가수 : " + singer + "		노래 제목 : " + name + " 	노래 번호 : " + num );
//		System.out.println("===============================================================================\n");
		System.out.println("번호 : " + num);
		System.out.println("노래제목 : " + name);
		System.out.println("가수 : " + singer);
	}
}
