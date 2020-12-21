package ArrayListBook;
import java.util.Scanner;

public class BookArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String title;
		String author;
		
		Scanner scanner = new Scanner(System.in);
		
		Book [] bookshelf = new Book[5];
		
		for(int i =0 ; i<5 ; i++)
		{
			System.out.print("Title >>");
			title = scanner.nextLine();
			System.out.print("Author >>");
			author = scanner.nextLine();
			
			bookshelf[i] = new Book();
	
		}
		
		for(int i = 0 ; i<bookshelf.length;i++)
		{
			bookshelf[i].showBookInfo();
		}
	}

}
