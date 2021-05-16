package day6;

public class BankAcct {

	private String fName;
	private String lName;
	private long acctNo;
	private double balance;

	public BankAcct(String fName, String lName, long acctNo, double balance) {

		this.fName = fName;
		this.lName = lName;
		this.acctNo = acctNo;
		this.balance = balance;

	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public long getAcctNo() {
		return acctNo;
	}

	public void setAcctNo(long acctNo) {
		// acctNo = acctNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	// Creating methods
	public void debit(double amount) {
		if (balance - amount < 0) {

			System.out.println("Insufficient Balance");
		} else {
			balance = balance - amount;
		}

	}

	public void credit(double amount) {
		balance = balance + amount;
		System.out.println("Here is yur final balance: " + balance);

	}

	@Override
	public String toString() {
		return "BankAcct [fName=" + fName + ", lName=" + lName + ", AcctNo=" + acctNo + ", balance=" + balance + "]";
	}

}
