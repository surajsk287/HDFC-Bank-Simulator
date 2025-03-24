class HDFC{
	private String name;
	private String account;
	private double balance=0;
	private double lastDeposit;
	private double lastWithdrawl;
	
	HDFC(){
		this.name="NA";
		this.account="NA";
		this.balance=0.0;
		this.lastDeposit=0.0;
		this.lastWithdrawl=0.0;
	}
	
	//setter
	public void setName(String name) {
		this.name=name;
	}
	public void setAccount(String accountNo) {
		this.account=accountNo;
	}
	public void setBalance(double bal) {
		this.balance=bal;
	}
	public void setLastDeposit(double lastD) {
		this.lastDeposit=lastD;
	}
	public void setLastWithdrawl(double lastW) {
		this.lastWithdrawl=lastW;
	}
	
	//getter
	
	public String getName() {
		return this.name;
	}
	public String getAccount() {
		return this.account;
	}

	public double getBalance() {
		return this.balance;
	}
	public double getLastDeposit() {
		return this.lastDeposit;
	}
	
	public double getLastWithdrawl() {
		return this.lastWithdrawl;
	}
	
	// deposit method
	
	public void deposit(double amount) {
		this.balance=this.balance+amount;
		this.lastDeposit=amount;
	}
	
	// withdraw method
	
	public void withdraw(double amount) {
	    if (amount > this.balance) {
	        System.out.println("Insufficient balance!");
	    } else {
	        this.balance -= amount;
	        this.lastWithdrawl = amount;
	    }
	}
	
	
	@Override
	public String toString() {
		return "Name : "+this.name+"\n"
				+"Account : "+this.account+"\n"
				+"Balance : "+this.balance+"\n"
				+"Last Deposite : "+this.lastDeposit+"\n"
				+"Last Withdrawl : "+this.lastWithdrawl+"\n";
	}

}
public class setAndGet extends HDFC {
	
	public static void main(String[] args) {
		HDFC sg=new HDFC();
		sg.setName("Suraj");
		sg.setAccount("35357769578435");
		sg.setBalance(100);
		sg.setLastDeposit(0);
		sg.setLastWithdrawl(0);
		
		System.out.println(sg.toString());
		
		sg.deposit(3000);
		System.out.println(sg.toString());
		
		sg.withdraw(500);
		System.out.println(sg.toString());

	}

}