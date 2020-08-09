object Q4 extends App{

    val obj1 = Point(5,6);
    val obj2 = obj1.invert();

    println(obj2);

}

case class Point(num1:Int,num2:Int){
    def x:Int = num1;
    def y:Int = num2;

    def invert() = Point(this.y,this.x);
}