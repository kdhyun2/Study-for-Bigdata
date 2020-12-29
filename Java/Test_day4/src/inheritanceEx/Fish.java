package inheritanceEx;

public class Fish extends Animal{

	public Fish(String name, String gender) {
		super(name, gender);
		
	}
	public void move() {
		System.out.println("지느러미를 움직입니다..");
	}
	
	public void swim() {
		System.out.println("물속을 수영합니다..");
	}
}
