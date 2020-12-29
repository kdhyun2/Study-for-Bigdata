package AccountEx;

public class Account {
	
	// =====================================================
	final int MIN_Balance = 0;
	final int MAX_Balance = 1000000;

	int balance;
	// ================constructor==========================
	public Account() {
		
	}
	// =================get/set===============================
	public int getBalance() {
		return balance;
	}
	// ================main method============================
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	// �Ա� �ż��� 
	public void i_money(int balance) {
		
		// ���� �ܰ��� �Աݽ� MAX_Balance 100���� �ʰ��� 100���� ������ �Ա��� ���� �ܾ� ��ȯ 
		if (this.balance + balance > MAX_Balance)
		{
			System.out.println("�Ա� �ѵ� �ʰ�" +(this.balance + balance - MAX_Balance)+"��ȯ");
			this.balance = 1000000;
		}
		// �� ���ǿ� �������� �ʰ� ���� �Է½� �ݾ׿� �߰� 
		else
		{
			this.balance += balance;
		}
	}
	
	// ��� �ż��� 
	public void o_money(int balance) {
		
		// ���� �ܰ� ���� ���� �ݾ��� ��� ��û�Ǹ� ���� ����� �ܾ� ����
		if(this.balance + balance < MIN_Balance)
		{
			System.out.println("��� �ѵ� �ʰ� �ܾ��� �����մϴ�.");
		}
		// �����ǿ� �������� �ʰ� ���� �Է½� �ݾ׿��� ���� (���� �������� ������ ���� ������ ���� �׳� ���ϱ�� ó��)
		else
		{
			this.balance += balance;
		}
		
	}
	
	// �ܾ� ��� �ż��� 
	public void AccountInfo() {
		System.out.println("���� �� �ܾ� :"+this.balance);
		
	}
}
	
	
	
