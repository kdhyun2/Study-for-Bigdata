package inheritanceEx;

public class Fish extends Animal{

	public Fish(String name, String gender) {
		super(name, gender);
		
	}
	public void move() {
		System.out.println("�������̸� �����Դϴ�..");
	}
	
	public void swim() {
		System.out.println("������ �����մϴ�..");
	}
}
