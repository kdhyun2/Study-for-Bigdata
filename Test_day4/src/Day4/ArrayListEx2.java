package Day4;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i<4; i++)
		{
			System.out.print("이름을 입력하세요 >> ");
			String s = scanner.nextLine();
			a.add(s);
		}
		
		for(String name : a)
		{
			System.out.print(name+ " ");
		}
		
		int longestindex = 0;
		for(int i =0 ; i<a.size();i++) {
			if(a.get(longestindex).length() < a.get(i).length())
			{
				longestindex = i;
			}
			
		}
		System.out.println("\n가장 긴 이름은? :"+a.get(longestindex));
		scanner.close();
	}

}
