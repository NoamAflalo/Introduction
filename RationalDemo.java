public class RationalDemo {
  public static void main(String[] args) {
    Rational r = new Rational(0) ;
    // Geometric progression
    for (int i=0, j=1; i<15; i++, j*=2) {
      r = r.add( new Rational(1,j));
      System.out.println(r);
      System.out.println(r.toDouble());
    }
    // pi approximation
    r = new Rational(0);
    for (int i=1; i<25; i+=2){
      r = r.add( new Rational(i).inv().mult( new Rational(((i+1)%4 == 0 ? -1 : 1 ))));
      System.out.println(r.toDouble() * 4);
    }
    // Simplification test
    r = new Rational(1);
    for (int i=1; i<10; i++) {
      r = r.div( new Rational(i+2, i+3));
      System.out.println(r);
    }
  }
}
