object Q3 extends App{

def addition(input:Int):Int=input match{

    case 0 => 0;
    case _ => input + addition(input-1);    
}

println(addition(5));


}