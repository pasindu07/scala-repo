object Q1 extends App{

    def GCD(num1:Int,num2:Int):Int=num2 match{
        case 0 => num1;
        case x if x>num1 => GCD(x,num1);
        case _ => GCD(num2,num1%num2);
    }

    def prime(num1:Int,n:Int=2):Boolean=n match{
        case x if x==num1 => true;
        case x if GCD(num1,x)>1 => false;
        case x => prime(num1,x+1);
    }

print("Number:");val input = scala.io.StdIn.readInt();
if(prime(input)) println("Prime Number");
else println("Not A Prime Number");

}