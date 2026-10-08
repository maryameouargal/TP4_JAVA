package ens.tp2.ex2;

public class Complexe {

	private int real;
	private int imag;

	public Complexe(int real, int imag) {
		this.real = real;
		this.imag = imag;
	}

	public Complexe plus(Complexe c2) {
		int nub1;
		int nub2;
		nub1 = this.real + c2.real;
		nub2 = this.imag + c2.imag;
		return  new Complexe(nub1,nub2);
	}
	public Complexe moins (Complexe c2) {
		int nub1;
		int nub2;
		nub1 = this.real - c2.real;
		nub2 = this.imag - c2.imag;
		return  new Complexe(nub1,nub2);
	}

	@Override
	public String toString() {
		return "Complexe [real=" + real + ", imaginaire=" + imag + "i]";
	}

}
