object Q3 extends App{

    def priceCalc(num_of_copies:Int):Double={
        var unitPrice : Float  = 24.95f;
        var discount :Float = 0.4f;
        var more_books:Int = num_of_copies-50;

        return (unitPrice*num_of_copies)+3+(0.75*more_books);

    }

    println(priceCalc(60));

}