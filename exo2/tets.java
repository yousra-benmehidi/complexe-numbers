package exo2;

import exo.complexe;

public class tets {
	public static void main(String[] args) {
		Complexe A = new compleTab(5,6);
		Complexe B = new compleTab(3,2);
		System.out.println(A.addC(B));
		System.out.println(A.sous(B));
		System.out.println("|A|=|("+A+")|="+A.module());
		//plus grd
		if(A.module()>B.module())
			System.out.println("le nombre dans le module est le plus grand est A="+A);
		else
			System.out.println("le nombre dans le module est le plus grand est B="+B);
	}
}
