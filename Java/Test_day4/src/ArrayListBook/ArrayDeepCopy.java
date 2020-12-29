package ArrayListBook;

public class ArrayDeepCopy {
	public static void main(String[] args) {
		
		Book[] bookShelf = new Book[5];
		Book[] copyShelf = new Book[5];
		

		bookShelf[0] = new Book("토지", "박경리"); 
		bookShelf[1] = new Book("태백산맥", "조정래"); 
		bookShelf[2] = new Book("당신들의 천국", "이청준"); 
		bookShelf[3] = new Book("나목", "박완서"); 
		bookShelf[4] = new Book("데미안", "헤르만 헤세");
		System.arraycopy(bookShelf,0 ,copyShelf,0,5);
		
		bookShelf[0].setTitle("나목");
		bookShelf[0].setAuthor("박완서");
		
		for(Book aBook:bookShelf)
		{
			aBook.showBookInfo();
		}
		System.out.println("==============");
		
		for(Book aBook:copyShelf) {
			aBook.showBookInfo();
		}
		
		
	}
	
}
