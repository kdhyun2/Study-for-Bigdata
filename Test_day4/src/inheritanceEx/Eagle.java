package inheritanceEx;

public class Eagle extends Animal {

	public Eagle(String name, String gender) {
		super(name, gender);
	
	}
	
	public void move() {
		System.out.println("날개를 움직입니다..");
	}
	
	public void fly(String why) {
		System.out.println(why+"를(을)하기 위해 하늘을 날아 다닙니다.");
	}
	
	
}
