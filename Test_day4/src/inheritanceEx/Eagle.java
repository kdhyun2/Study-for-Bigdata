package inheritanceEx;

public class Eagle extends Animal {

	public Eagle(String name, String gender) {
		super(name, gender);
	
	}
	
	public void move() {
		System.out.println("������ �����Դϴ�..");
	}
	
	public void fly(String why) {
		System.out.println(why+"��(��)�ϱ� ���� �ϴ��� ���� �ٴմϴ�.");
	}
	
	
}
