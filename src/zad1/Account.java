package zad1;

class Account{
	double balance;
	static double inrate;
	public Account (double balance) {
		this.balance = balance;
	}
	public void deposit(double add) {
		if(add > 0) {
		balance += add;
		}
	}
	public void withdraw(double sub) {
		if(balance-sub < 0) {
			System.out.println("Podana kwota jest za duza");
		} else balance -= sub;
	}
	
	public static void setInterestRate(double rate) {
		inrate = rate;
	}
	public void addInterest() {
		balance = balance*(100+inrate)/100;
	}
	
	public void transfer(Account p,double money) {
		if(money<balance) { // wykonuje sie tylko gdy jest dostepna gotowka
			withdraw(money);
			p.deposit(money);
		}
	}
	public Account() {}
}