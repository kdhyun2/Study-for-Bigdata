package AccountEx;
import java.util.Scanner;

public class AccountEx {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Account account = new Account();
		int number;

		do 
		{
			System.out.println("�Ա� :1 \t ��� :2 \t �ܾ� Ȯ�� :3 \t ��� : 0");
			number = sc.nextInt();
			
			if (number == 0)
			{
				break;
			}
			
			switch(number) 
			{
			
				case 1:
				{	
					System.out.println("�Ա� �ݾ��� �Է��� �ּ��� ");
					int money = sc.nextInt();
					account.i_money(money);
					break;
				}
				case 2:
				{	
					System.out.println("��� �ݾ��� �Է��� �ּ��� ");
					int money = sc.nextInt();
					account.o_money(-money);
					break;
				}
				case 3:
				{	
					account.AccountInfo();
					break;
				}
			}

		}while(true);

	}

}
