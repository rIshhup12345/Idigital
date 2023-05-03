package DailyLearning;



public class BankAccount {
	
	 private String name;
	 private int number;
	 private int balance;
	 
	 public String getName() {
		 return name;
	 }
	 public void setname(String name) {
		 this.name = name;
	 }
	 
	 public int getNumber() {
		 return number;
	 }
	 public void setNumber(int number) {
		 this.number=number;
		 
	 }
	 public int getBalance() {
		 return balance;
	 }
	public void setBalance(int balance) {
		this.balance=balance;
	}
	
	
	public static void main(String args[]) {
		
	
		BankAccount obj = new BankAccount();
		obj.name="rishabh";
		obj.number=12345643;
	    obj.balance=10;
	 if(obj.getBalance()<200) {
			System.out.println("your balance is low");
		}	
		System.out.println(obj.name + " " +obj.number + " " + obj.balance);
		
	}

}
