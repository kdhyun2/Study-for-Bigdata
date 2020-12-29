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
			System.out.println("입금 :1 \t 출금 :2 \t 잔액 확인 :3 \t 취소 : 0");
			number = sc.nextInt();
			
			if (number == 0)
			{
				break;
			}
			
			switch(number) 
			{
			
				case 1:
				{	
					System.out.println("입금 금액을 입력해 주세요 ");
					int money = sc.nextInt();
					account.i_money(money);
					break;
				}
				case 2:
				{	
					System.out.println("출금 금액을 입력해 주세요 ");
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
