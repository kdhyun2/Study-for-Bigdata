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
	
	// 입금 매서드 
	public void i_money(int balance) {
		
		// 현재 잔고에서 입금시 MAX_Balance 100만원 초과시 100만원 까지만 입금후 남은 잔액 반환 
		if (this.balance + balance > MAX_Balance)
		{
			System.out.println("입금 한도 초과" +(this.balance + balance - MAX_Balance)+"반환");
			this.balance = 1000000;
		}
		// 위 조건에 부합하지 않고 정상 입력시 금액에 추가 
		else
		{
			this.balance += balance;
		}
	}
	
	// 출금 매서드 
	public void o_money(int balance) {
		
		// 현재 잔고 보다 작은 금액이 출금 요청되면 오류 출력후 잔액 보전
		if(this.balance + balance < MIN_Balance)
		{
			System.out.println("출금 한도 초과 잔액이 부족합니다.");
		}
		// 위조건에 부합하지 않고 정상 입력시 금액에서 차감 (매인 변수에서 들어오는 값이 음수로 들어와 그냥 더하기로 처리)
		else
		{
			this.balance += balance;
		}
		
	}
	
	// 잔액 출력 매서드 
	public void AccountInfo() {
		System.out.println("계좌 내 잔액 :"+this.balance);
		
	}
}
	
	
	
