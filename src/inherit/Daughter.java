package inherit;

public class Daughter extends Mom {
	
	public Daughter() {
		System.out.println("딸 생성");
	}

	public void study() {
		System.out.println("딸은 공부중");
	}
	public void job() {
		System.out.println("직업 없음");
	}
	public void gene() {
		System.out.println("딸은 딸");
	}
}
