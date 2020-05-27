object Q5 extends App{

    def even_add(input:Int):Int = {
        if(input == 2)
            return 2;
        else if(input%2==0)
            input+even_add(input-2);
        else
            even_add(input-1);
    }

    print("Number:");val input = scala.io.StdIn.readInt();
    println(even_add(input));


}