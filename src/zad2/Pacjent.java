package zad2;

class Pacjent{
	String p, ill, cure;
	public Pacjent() {}
	public Pacjent(String p){
		this.p=p;
	}
	public String nazwisko() {
		return p;
	}
	
	public String choroba() {
		return ill;
	}
	public String leczenie() {
		return cure;
	}
	
}
