package inheritanceEx;

public class Human extends Animal {

	String s_type; //�Ǻ� ��
	
	public Human(String name, String gender, String s_type) {
		super(name, gender);
		this.s_type = s_type;
	}
	
	public void move() {
		System.out.println("�ȴٸ��� �����Դϴ�..");
	}
	
	public void displayinfo()
	{
		System.out.println("���� :("+this.name+","+this.gender+","+s_type+")");
	}
	
	public void speak() {
		System.out.println("blah blah blah");
		
	}


}
