object Q4 extends App{

    val x = new Account("77453V",1111,500);
    val y = new Account("77454V",1112,100);

    var bank:List[Account] = List(x,y);

    x.tranfer(y,200);
    println(bank)
}


class Account(id:String,num:Int,bal:Double){
    val nic:String = id;
    val accNumber:Int = num;
    var accBalance:Double = bal;

     
    def withdraw(amt:Double) = this.accBalance= this.accBalance-amt;
    def deposit(amt:Double) = this.accBalance= this.accBalance+amt;

    def tranfer(payee:Account,amount:Double)={

        payee.deposit(amount);
        this.withdraw(amount);
        // println(accBalance,payee.accBalance);
    }

    override def toString = s"Balance of accout $accNumber is $accBalance";
}