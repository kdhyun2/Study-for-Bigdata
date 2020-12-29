package Test_day3;

public class DateCheck {
	
	private int day;
	private int month;
	private int year;

	/*
	public DateCheck(int year, int month, int day) {
		
		this.day = day;
		this.month = month;
		this.year = year;
	}*/
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	public static boolean switch_1;
	
	public void showdate()
	{
		System.out.println("입력하신 날짜는 :"+this.year+"년"+this.month+"월"+this.day+"일 입니다.");
	}
	public boolean IsValidDate() {
	
		if (this.year > 0)
		{
			if(this.month >0 && this.month <=12)
			{
				if(this.month == 2)
				{
					if(this.day >1 && this.day <29)
					{
						switch_1 = true;
					}
					else
						switch_1 = false;
				}
				else if(this.month == 4 ||this.month == 6 ||this.month == 9 || this.month == 11)
				{
					if(this.day >1 && this.day <31)
					{
						switch_1 = true;
					}
					else
						switch_1 = false;
				}
				else if(this.month==1||this.month==3||this.month==5||this.month==7||this.month==8||this.month==10||this.month==12)
				{
					if(this.day >1 && this.day <32)
					{
						switch_1 = true;
					}
					else
						switch_1 = false;
				}
			}
		}
		else
			switch_1 = false;
		
	return switch_1;
	}
	
	public void CheckOK() {
		
		if (switch_1 == true)
		{
			System.out.println("입력하신 날짜는 유효합니다.");
		}
		else
		
			System.out.println("입력하신 날짜는 유효하지 않습니다.");
		}
		
}
	
