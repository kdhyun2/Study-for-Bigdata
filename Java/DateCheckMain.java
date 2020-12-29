package Test_day3;
import java.util.Scanner;

public class DateCheckMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		int month;
		int day;
		//String yesorno;
		
		Scanner scanner = new Scanner(System.in);
		/*
		while(true)
		{
		*/
			//년, 월, 일 입력부 
			System.out.println("년도를 입력해 주세요 .. ");
			year = scanner.nextInt();
			System.out.println("월을 입력해 주세요");
			month = scanner.nextInt();
			System.out.println("일을 입력해 주세요");
			day = scanner.nextInt();
			/*
			//입력 완료 Yes or No
			System.out.println("입력을 완료하시겠습니까? (Y/N)");
			yesorno = scanner.nextLine();
			if(yesorno == "Y"|| yesorno == "y")
			{
				break;
			}
			else if(yesorno == "N"||yesorno =="n")
			{
				continue;
			}

		}
		*/
		
		DateCheck day1 = new DateCheck();
		day1.setYear(2000);
		day1.setMonth(12);
		day1.setDay(30);
		
		DateCheck day2 = new DateCheck();
		day2.setYear(2000);
		day2.setMonth(2);
		day2.setDay(30);
		
		
		day1.IsValidDate();
		day1.showdate();
		day1.CheckOK();
		day2.IsValidDate();
		day2.showdate();
		day2.CheckOK();
		

	}

}
