package inheritanceEx;

public class MenuOpen {
	
	public MenuOpen() {
		
	}
	
	public void OperateMenu() {
	System.out.println("---동물 생성 매뉴---");
	System.out.println("1. Human 생산");
	System.out.println("2. Eagle 생산");
	System.out.println("3. Fish 생산");
	System.out.println("4. Lion 생산");
	System.out.println("0. 생산 프로그램 종료");
	}
	
	public void GeneralMove() {
		System.out.println("---기본 움직임 매뉴---");
		System.out.println("1. Move");
		System.out.println("2. Eat");
		System.out.println("3. Display Info");
		System.out.println("4. 특성 동작 매뉴로 이동 ");
		System.out.println("0. 동물 생성 매뉴로 이동 ");
		}
	
	public void FishSpesial() {
		System.out.println("---물고기 특성 동작 매뉴---");
		System.out.println("4. Swim");
		System.out.println("0. 동물 생성 매뉴로 이동 ");
		
	}
	
	public void LionSpesial() {
		System.out.println("---사자 특성 동작 매뉴---");
		System.out.println("4. Hunt");
		System.out.println("0. 동물 생성 매뉴로 이동 ");
	}
	
	public void HumanSpesial() {
		System.out.println("---인간 특성 동작 매뉴---");
		System.out.println("4. Speak");
		System.out.println("0. 동물 생성 매뉴로 이동 ");
	}
	
	public void EagleSpesial() {
		System.out.println("---인간 특성 동작 매뉴---");
		System.out.println("4. Fly");
		System.out.println("0. 동물 생성 매뉴로 이동 ");
	}
}
