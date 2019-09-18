import java.util.Scanner;

class NombrePremier {
	public static void main (String [] args){
		System.out.println("Veuillez entrer un entier");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		boolean estPremier=true;
		for (int i=2; i<n; i++){
			if (n%i==0){estPremier=false;}
		}
		System.out.println(estPremier);
	}
}
