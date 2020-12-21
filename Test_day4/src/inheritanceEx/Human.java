package inheritanceEx;

public class Human extends Animal {

	String s_type; //피부 색
	
	public Human(String name, String gender, String s_type) {
		super(name, gender);
		this.s_type = s_type;
	}
	
	public void move() {
		System.out.println("팔다리를 움직입니다..");
	}
	
	public void displayinfo()
	{
		System.out.println("정보 :("+this.name+","+this.gender+","+s_type+")");
	}
	
	public void speak() {
		System.out.println("blah blah blah");
		
	}


}
