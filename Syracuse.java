import java.util.Scanner;

class Syracuse{
	public static void main (String [] args){
		System.out.println("Veuillez entrer un entier positif");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		while (n!=1){
			if (n%2==0){n=n/2;}
			else {n=(n*3)+1;}
			System.out.println(n);
		}
	}
}
