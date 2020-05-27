object Q2 extends App{

    def GCD(num1:Int,num2:Int):Int= num2 match{
        case 0 => num1;
        case x if (x>num1) => GCD(x,num1);
        case _ => GCD(num2,num1%num2);
    }

    def prime(input:Int,n:Int=2):Boolean= n match{
        case x if x==input => true;
        case x if GCD(input,x)>1 => false;
        case x => prime(input,x+1);
    }

    def primeSeq(input:Int):Any = {

       if(prime(input)) printf("%d ",input);
       if(input>0) primeSeq(input-1);
       
    }

    print("Number:");val input = scala.io.StdIn.readInt();
    primeSeq(input);

}