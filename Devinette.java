import java.util.Random;
import java.util.Scanner;

class Devinette{
	public static void main (String [] args){
		Random r=new Random();
        int valeur = 0 + r.nextInt(20-0);  //Permet de générer un nombre aléatoire entre 0 et 20.
		System.out.println("Devinez un entier entre 0 et 20");
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		while (x!=valeur){
			if (x<valeur) {System.out.println("Le nombre cible est plus grand");}
			else {System.out.println("Le nombre cible est plus petit");}
			System.out.println("Entrez un entier entre 0 et 20");
			x=s.nextInt();
		}
		System.out.println("Vous avez trouve !");
	}
}
