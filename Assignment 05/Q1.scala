object Q1 extends App{
    
    val x = new Rational(3,1); //making an object
    println(x.neg);

}

class Rational(num1:Int,num2:Int){
        def numer = num1;
        def denom = num2;

        def neg = new Rational(-this.numer,this.denom);

        override def toString = numer + "/" + denom;
    }
