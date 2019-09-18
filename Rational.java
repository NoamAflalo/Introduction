import java.util.Scanner;

class Rational{
  private final int num; //The numerator
  private final int den; //The denominator
  int gcd(int a,int b){
      if (b==0){
        return a;}
      return gcd(b,a%b);
  }
    public Rational(int num){this(num,1);}
    public Rational(int numerator, int denominator){
      if (denominator==0){System.out.println("Denominateur nul");}
       int pgcd=gcd(numerator,denominator);
       num=numerator/pgcd;
       den=denominator/pgcd; //Le constructeur joue également le rôle du simplify.

  }


    public Rational mult(Rational m){
      return new Rational(this.num * m.num, this.den * m.den);
    }

    public Rational add(Rational m){
      return new Rational(this.num * m.den + m.num * this.den,this.den * m.den);
    }

    public Rational sub(Rational m){
      return new Rational(this.num * m.den - m.num * this.den,this.den * m.den);
    }

    public Rational inv(){
      return new Rational(den,num);
    }

  public Rational div(Rational m){
      return this.mult(m.inv());
  }

  public String toString(){
            if (this.den==1){return String.format("%d",this.num);}
            return String.format("%d/%d",this.num,this.den);
  }

  public double toDouble(){
      return (double)num/(double)den;

  }


}
