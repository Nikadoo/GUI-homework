package zad1;

class BankCustomer {
	String name;
	private Account acc;
	public BankCustomer (Person p) {
		name = p.p;
		acc = new Account();
	}
	
	public Account getAccount() {
		return acc;
	}
	
	public String toString() {
		return "Klient: " + name + " stan konta "+acc.balance;
	}
	public void show() {
		System.out.println(toString());
	}
}
	