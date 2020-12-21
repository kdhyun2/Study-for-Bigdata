package Day4;
import java.util.ArrayList;

public class ArrayListEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> stLst = new ArrayList<String>();
		stLst.add("spring");
		stLst.add("summer");
		stLst.add("autumn");
		stLst.add("winter");
		
		for(int i =0 ; i<stLst.size() ; i++)
		{
			String str = stLst.get(i);
			System.out.println(str);
		}
		
		System.out.println("=========for each===================");
		
		for(String s : stLst)
		{
			System.out.println(s);
		}
		
	}

}
