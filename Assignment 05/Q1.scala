class Q1 extends App{
    
    class Rational(x:Int,y:Int){
        def numer = x;
        def denom = y;

        def neg = new Rational(-this.numer,this.denom);
    }

    val x = new Rational(3,1);

    println(x.neg);

}