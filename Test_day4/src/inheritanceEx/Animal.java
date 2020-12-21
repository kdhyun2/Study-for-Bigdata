package inheritanceEx;

public class Animal {
	
	String name;
	String gender;
	
	public Animal(String name, String gender)
	{
		this.name = name;
		this.gender = gender;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	
	
	public void move() {
		System.out.println("움직입니다..");
	}
	
	public void eat(String food)
	{
		System.out.println(this.name+"(이)가"+food+"를 먹습니다..");
		
	}
	
	public void displayinfo() {
		System.out.println("정보 :("+this.name+","+this.gender+")");
	
	}

	

}
