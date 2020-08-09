object Q2 extends App{
    val obj1 = Point(4,6);
    val obj2 = obj1.move(2,1);

    println(obj2);

}

case class Point(num1:Int,num2:Int){
    def x:Int = num1;
    def y:Int = num2;

    def move(dx:Int,dy:Int)= Point(this.x+dx,this.y+dy);
}