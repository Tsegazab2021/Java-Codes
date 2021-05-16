package day6;

public class BankAcctModified {

	private String fName;
	private String lName;
	private long acctNo;
	static long acctNoAutoIncrement = 10001;
	private double balance;

	public BankAcctModified(String fName, String lName, double balance) {

		this.fName = fName;
		this.lName = lName;
		this.acctNo = acctNoAutoIncrement++;
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

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAcctModified [fName=" + fName + ", lName=" + lName + ", acctNo=" + acctNo + ", balance=" + balance
				+ "]";
	}

}
