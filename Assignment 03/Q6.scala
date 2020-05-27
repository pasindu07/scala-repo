object Q6 extends App{

    def fib(input:Int):Int=input match{
        case 0 => 0;
        case 1 => 1;
        case _ => fib(input-1)+fib(input-2);
    }

    def fibSeq(input:Int):Any={
        if(input>0) fibSeq(input-1);
        printf("%d ",fib(input));
    }

    print("Number:");val input = scala.io.StdIn.readInt();
    fibSeq(input);
    println("");
    
}