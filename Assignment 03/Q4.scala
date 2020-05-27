object Q4 extends App{

    def even(in:Int):Boolean= in match{
        case 0 => true;
        case _ => odd(in-1);
    }

    def odd(in:Int):Boolean = !(even(in));

    print("Number:");val input = scala.io.StdIn.readInt();
    if(odd(input)) println("Odd Number");
    else println("Even Number");

}