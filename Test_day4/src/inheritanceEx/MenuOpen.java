package inheritanceEx;

public class MenuOpen {
	
	public MenuOpen() {
		
	}
	
	public void OperateMenu() {
	System.out.println("---���� ���� �Ŵ�---");
	System.out.println("1. Human ����");
	System.out.println("2. Eagle ����");
	System.out.println("3. Fish ����");
	System.out.println("4. Lion ����");
	System.out.println("0. ���� ���α׷� ����");
	}
	
	public void GeneralMove() {
		System.out.println("---�⺻ ������ �Ŵ�---");
		System.out.println("1. Move");
		System.out.println("2. Eat");
		System.out.println("3. Display Info");
		System.out.println("4. Ư�� ���� �Ŵ��� �̵� ");
		System.out.println("0. ���� ���� �Ŵ��� �̵� ");
		}
	
	public void FishSpesial() {
		System.out.println("---����� Ư�� ���� �Ŵ�---");
		System.out.println("4. Swim");
		System.out.println("0. ���� ���� �Ŵ��� �̵� ");
		
	}
	
	public void LionSpesial() {
		System.out.println("---���� Ư�� ���� �Ŵ�---");
		System.out.println("4. Hunt");
		System.out.println("0. ���� ���� �Ŵ��� �̵� ");
	}
	
	public void HumanSpesial() {
		System.out.println("---�ΰ� Ư�� ���� �Ŵ�---");
		System.out.println("4. Speak");
		System.out.println("0. ���� ���� �Ŵ��� �̵� ");
	}
	
	public void EagleSpesial() {
		System.out.println("---�ΰ� Ư�� ���� �Ŵ�---");
		System.out.println("4. Fly");
		System.out.println("0. ���� ���� �Ŵ��� �̵� ");
	}
}
