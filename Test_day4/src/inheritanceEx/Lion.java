package inheritanceEx;

public class Lion extends Animal {

	public Lion(String name, String gender) {
		super(name, gender);
		
	}
	
	public void move() {
		System.out.println("�ٸ��� ������ �����Դϴ�..");
	}
	
	public void hunt() {
		System.out.println("���ù� ����� ������!!");
	}

}
