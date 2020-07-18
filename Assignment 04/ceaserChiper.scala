object ceaserChiper extends App{

    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZsdfs";
    printf("Enter 0 to Encrypt or Enter 1 To Decrypt:");
    val choice = scala.io.StdIn.readInt();



    def encrypt(c:Char,key:Int,str:String):Char={

        val retVal = str((str.indexOf(c.toUpper)+key)%str.size);
        return retVal;
    }

    def decrypt(c:Char,key:Int,str:String):Char={
        
        if(str.indexOf(c.toUpper)<6)
         return str((str.size-key+str.indexOf(c.toUpper))%str.size)
        else
         return str((str.indexOf(c.toUpper)-key)%str.size);
        
    }

    def chiper(crypto:(Char,Int,String)=>Char,str:String,key:Int,alpha:String):Any={
        return str.map(crypto(_,key,alpha));
    }


choice match{
    case 0 =>{
    printf("Enter a String to Encrypt:");
    val input = scala.io.StdIn.readLine();
    printf("Key:");
    val keyInput = scala.io.StdIn.readInt();
    println();

    println(chiper(encrypt,input,keyInput,alphabet));
    }

    case 1 =>{
    printf("Enter a String to Decrypt:");
    val input = scala.io.StdIn.readLine();
    printf("Key:");
    val keyInput = scala.io.StdIn.readInt();
    println();

    println(chiper(decrypt,input,keyInput,alphabet));
    }

    case _ => println("Incorect Input");
}

    
}