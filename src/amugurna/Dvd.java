package amugurna;

public class Dvd extends Main_Test{
	
	private String actor;
	private String pd;
	
	public Dvd() {	}

	public Dvd(String num, String name, String actor, String pd) {
	super.num = num;
	super.name = name;
	this.actor = actor;
	this.pd = pd;
	}
	
	public void output() {
//		System.out.println("배우 이름 : " + actor + "	 pd 이름 : " + pd + "	영화 제목 : " + name + "	영화 번호 : " + num);
//		System.out.println("===============================================================================\n");
		System.out.println("번호 : " + num);
		System.out.println("영화제목 : " + name);
		System.out.println("배우이름 : " + actor);
		System.out.println("감독이름 : " + pd);
	}
}
