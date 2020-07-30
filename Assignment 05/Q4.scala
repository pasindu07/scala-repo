
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
 
    println("Accounts with negative balances");
    for(x <- negAcc(bank)){
        println(x.nic);
    }

    // val sumOfAllAccounts = (list:List[Account])=>list.reduce((x.accBalance,y.accBalance)=>x.accBalance+y.accBalance);

    // println("Sum of All the Accouts: "+ sumOfAllAccounts);

    // def sumOfAllAccounts(list:List[Account]):Double={
    //     return list.reduce((x.accBalance,y.accBalance)=>x.accBalance+y.accBalance);
    // }

    // sumOfAllAccounts(bank);

    def sumofAllAcc(list:List[Account]):Double={
        var sum = 0.0;
        printf("%s","Sum of the all accounts: ");
        for(x<-list){
            sum = sum + x.accBalance;
        }
        return sum;
    }

    println(sumofAllAcc(bank));

    //TODO: Checking the answers of the functions
    val postiveAcc = (list:List[Account])=> list.filter(x=>x.accBalance>=0);
    
    val intrestAddPositiveAcc = (list:List[Account])=> list.map(x=>x.accBalance*1.0005);
    val intrestAddNegativeAcc = (list:List[Account])=> list.map(x=>x.accBalance*0.999);

    def sumofAllAccWithInt(list1:List[Double],list2:List[Double]):Double={

        var sum = 0.0;

        for(x<-list1){
            sum = sum + x;
        }
        for(x<-list2){
            sum = sum + x;
        }
        return sum;
    }
    printf("%s","Sum of the all accounts with interest: ");
    println(sumofAllAccWithInt(intrestAddPositiveAcc(postiveAcc(bank)),intrestAddNegativeAcc(negAcc(bank))));
}


class Account(id:String,num:Int,bal:Double){
    val nic:String = id;
    val accNumber:Int = num;
    var accBalance:Double = bal;

}

