package DailyLearning;

public class Question23 {

	private int account_id;
	private int balance;
	private String bankName;
	private String ifscCode;
	public int getAccount_id() {
		return account_id;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	private int deposit(int i) {
		return balance + i;
	}
	private int withdraw(int j) {
		return balance-j;
	}
	public static void main(String[]args) {
		Question23 q = new Question23();
		q.setAccount_id(1);
		q.setBankName("SBI");
		q.setIfscCode("89jdh28902");
		q.setBalance(1000);
		System.out.println(q.getAccount_id());
		System.out.println(q.getBalance());
		System.out.println(q.getBankName());
		System.out.println(q.getIfscCode());
	    System.out.println("After deposit total balance " +q.deposit(1000));
		System.out.println("After witdraw total balance " +q.withdraw(1200));
		
	}
}
