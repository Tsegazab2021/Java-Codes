package day6;

public class Main {

	public static void main(String[] args) {
		
		BankAcct h = new BankAcct("Hagos", "Gebru", 10001,5000 );
		BankAcct j = new BankAcct("Jams", "Bond", 10002, 3000);
		h.debit(3000);
		h.credit(1000);
		
		j.debit(4000);
		
		
		System.out.println(h);
		
		System.out.println(j);
		
		BankAcctModified account1 = new BankAcctModified("James", "John", 3000);
		
		BankAcctModified account2 = new BankAcctModified("Hagos", "Gebru", 4000);
		
		BankAcctModified account3 = new BankAcctModified("Hagos", "Gebru1", 5000);
		
		System.out.println("accounts auto Increment : " + account1 );
		
		System.out.println("accounts auto Increment : " + account2  );
		
		System.out.println(" accounts autoIncrement : " + account3 );
		
	}
	
	

}
