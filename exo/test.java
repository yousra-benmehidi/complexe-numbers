package exo;

public class test {

	public static void main(String[] args) {
		complexe A = new complexe(5,6);
		complexe B = new complexe(3,2);
		complexe.addC(A, B);
		complexe.sous(A, B);
		//module
		System.out.println("|A|=|("+A+")|="+A.module());
		//plus grd
		if(A.module()>B.module())
			System.out.println("le nombre dans le module est le plus grand est A="+A);
		else
			System.out.println("le nombre dans le module est le plus grand est B="+B);
		
	}

}
