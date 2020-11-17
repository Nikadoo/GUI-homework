package zad3;

class ReversibleDouble implements Reversible{
	Double r;
	public ReversibleDouble(int r) {
		this.r=(double)r;
	}
	
	public Reversible reverse() {
		r=1.0/r; // odwrócenie double
		return this;
	}
	public String toString() {
		String newdouble = String.valueOf(r);
		return newdouble;
	}
}
