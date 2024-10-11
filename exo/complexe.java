package exo;
import java.math.*;
public class complexe {
	double[] nb = new double[2];
	public complexe(double a, double b) {
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
	public double module() {
		double k = rl()*rl()+im()*im();
		return Math.sqrt(k);
	}
	public static void addC(complexe a,complexe b) {
		complexe res = new complexe(a.rl()+b.rl(),a.im()+b.im());
		System.out.println("l'addition de ("+a+")+("+b+")=("+res+")");
	}
	public static void sous(complexe a,complexe b) {
		complexe res = new complexe(a.rl()-b.rl(),a.im()-b.im());
		System.out.println("la soustraction de ("+a+")-("+b+")=("+res+")");
	}
	
}
