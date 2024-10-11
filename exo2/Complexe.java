package exo2;

import exo.complexe;

public abstract class Complexe {
	public abstract double rl();
	public abstract double im();
	public double module() {
		double k = rl()*rl()+im()*im();
		return Math.sqrt(k);
	}
	public abstract Complexe Constr(double r,double i);
	public Complexe addC(Complexe a) {
		double re=this.rl()+a.rl();
		double im=this.im()+a.im();
		return Constr(re, im);
	}
	public Complexe sous(Complexe a) {
		double re=this.rl()-a.rl();
		double im=this.im()-a.im();
		return Constr(re, im);
	}
	public String toString() {
		return this.rl()+"+"+this.im()+"i";
	}
}
