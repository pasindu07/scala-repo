
object Q4 extends App{

    val x = new Account("77453V",1111,-500);
    val y = new Account("77454V",1112,100);
    val z = new Account("77455V",1113,320);
    val q = new Account("77456V",1114,-410);
    val r = new Account("77457V",1115,-120);
    val a = new Account("77458V",1116,-41);
    val h = new Account("77459V",1117,1410);

    var bank:List[Account] = List(x,y,z,q,r,a,h);


// val find=(n:String,b:List[Account])=> b.filter(x=>x.nic.equals(n))
    val negAcc = (list:List[Account])=> list.filter(x=>x.accBalance<0);
 
    // def printList(args: List[_]): Unit = {
    //     args.foreach(println(args(_)))
    // }

    for(x <- negAcc(bank)){
        println(x.nic);
    }
}


class Account(id:String,num:Int,bal:Double){
    val nic:String = id;
    val accNumber:Int = num;
    var accBalance:Double = bal;

}

