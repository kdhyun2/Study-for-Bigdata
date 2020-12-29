package ArrayListBook;

public class ArrayDeepCopy {
	public static void main(String[] args) {
		
		Book[] bookShelf = new Book[5];
		Book[] copyShelf = new Book[5];
		

		bookShelf[0] = new Book("����", "�ڰ渮"); 
		bookShelf[1] = new Book("�¹���", "������"); 
		bookShelf[2] = new Book("��ŵ��� õ��", "��û��"); 
		bookShelf[3] = new Book("����", "�ڿϼ�"); 
		bookShelf[4] = new Book("���̾�", "�츣�� �켼");
		System.arraycopy(bookShelf,0 ,copyShelf,0,5);
		
		bookShelf[0].setTitle("����");
		bookShelf[0].setAuthor("�ڿϼ�");
		
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
