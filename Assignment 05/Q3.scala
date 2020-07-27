
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