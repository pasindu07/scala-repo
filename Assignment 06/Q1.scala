object Q1 extends App{

    val obj1 = Point(8,5);

    println("Sum: "obj1.add());

}

case class Point(num1:Int,num2:Int){
    val x:Int = num1;
    val y:Int = num2;

    def add() = this.x+this.y;
}