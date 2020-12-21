package inheritanceEx;

public class Lion extends Animal {

	public Lion(String name, String gender) {
		super(name, gender);
		
	}
	
	public void move() {
		System.out.println("다리와 꼬리를 움직입니다..");
	}
	
	public void hunt() {
		System.out.println("오늘밤 사냥을 나선다!!");
	}

}
