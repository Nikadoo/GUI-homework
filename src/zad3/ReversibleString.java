package zad3;

class ReversibleString implements Reversible{
	String r;
	public ReversibleString(String r) {
		this.r=r;
		 
	}
	public Reversible reverse() { //zamiana stringow
		StringBuffer rev = new StringBuffer(r); 
		rev.reverse();
		r=rev.toString();
		return this;
	}
	
	public String toString() { //wyswietla wartosc
		return r;
	}
	
}
