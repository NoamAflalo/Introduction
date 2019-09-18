import java.util.Random;

class MonteCarlo{
	public static void main (String [] args){
		Random r=new Random();
		double inDisque=0;
		for (int i=1; i<1000000; i++){
			double x=(2*r.nextDouble())-1, y=(2*r.nextDouble())-1;
			double norme=x*x+y*y;
			if (norme<=1){inDisque+=1;}
		}
		double result=inDisque/1000000;
		System.out.println(result*4);
	}
}
