package inheritanceEx;
import java.util.Scanner;

public class Operating {
	
	Scanner sc = new Scanner(System.in);
	
	public Operating() {
		
	}
	
	public Human HumanOperating() {
		
		String name;
		String gender;
		String skin;
		
		System.out.println("name >>");
		name = sc.next();
		System.out.println("gender >>");
		gender = sc.next();
		System.out.println("skin >>");
		skin = sc.next();
		
		Human khuman = new Human(name, gender, skin);
		return khuman;
	}
	
	public Eagle EagleOperating() {
		
		String name;
		String gender;
		
		System.out.println("name >>");
		name = sc.next();
		System.out.println("gender >>");
		gender = sc.next();
		
		Eagle keagle = new Eagle(name, gender);
		return keagle;
	}
	
	public Fish FishOperating() {
		
		String name;
		String gender;
		
		System.out.println("name >>");
		name = sc.next();
		System.out.println("gender >>");
		gender = sc.next();
		
		Fish kfish = new Fish(name, gender);
		return kfish;
	}
public Lion LionOperating() {
		
		String name;
		String gender;
		
		System.out.println("name >>");
		name = sc.next();
		System.out.println("gender >>");
		gender = sc.next();
		
		Lion klion = new Lion(name, gender);
		return klion;
	}


}
