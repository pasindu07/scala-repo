object Q3 extends App{

    val obj1 = Point(7,9);

    println("Distance: "+obj1.distance());

}

case class Point(num1:Int,num2:Int){
    val x:Int = num1;
    val y:Int = num2;

    def distance():Int={
        
        if(this.x>this.y)
            this.x-this.y;
        else
            this.y-this.x;
    } 
}