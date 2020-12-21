package inheritanceEx;

import java.util.ArrayList;
import java.util.Scanner;

public class PolymophismTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int number;
		
		ArrayList<Human>humanLIST = new ArrayList<Human>();
		ArrayList<Eagle>eagleLIST = new ArrayList<Eagle>();
		ArrayList<Fish>fishLIST = new ArrayList<Fish>();
		ArrayList<Lion>lionLIST = new ArrayList<Lion>();
		
		Scanner sc = new Scanner(System.in);
		MenuOpen mn = new MenuOpen();
		Operating human_op = new Operating();
		Operating eagle_op = new Operating();
		Operating fish_op = new Operating();
		Operating lion_op = new Operating();

		do {
			
			mn.OperateMenu();
			number = sc.nextInt();
			
			if (number == 0)
			{ 
				break;
			}
			
			switch (number) {
				case 1: {
					
					Human new_Human = human_op.HumanOperating();
					humanLIST.add(new_Human);
					break;
				}
				case 2:{

					Eagle new_Eagle = eagle_op.EagleOperating();
					eagleLIST.add(new_Eagle);
					break;
				}
				case 3:{

					Fish new_Fish = fish_op.FishOperating();
					fishLIST.add(new_Fish);
					break;
				}
				case 4:{

					Lion new_Lion = lion_op.LionOperating();
					lionLIST.add(new_Lion);
					break;
				}
				
			
			}
		}while(true);

	}
}
