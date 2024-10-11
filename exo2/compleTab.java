package exo2;

import exo.complexe;

public class compleTab extends Complexe {
	double[] nb = new double[2];
	public compleTab(double a, double b) {
		nb[0]=a;
		nb[1]=b;
	}
	public String toString(){
		return nb[0]+"+"+nb[1]+"i";
	}
	public double rl() {
		return nb[0];
	}
	public double im() {
		return nb[1];
	}
	@Override
	public Complexe Constr(double r, double i) {
		return new compleTab(r,i);
	}
}
