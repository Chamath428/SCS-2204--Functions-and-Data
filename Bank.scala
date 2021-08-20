import java.time.temporal.TemporalAmount

object Bank extends App{
  val acc1=new Account("Chamath",10000,1);
  val acc2=new Account("Shantha",50000,1);
//  acc1.transfer(acc2,2000);
//  println(acc1.balance)
//  println()
//  println(acc2.balance)

  val bank:List[Account]=List(new Account("Chamath",-1000,1),
                              new Account("Madusha",20000,2),
                              new Account("nimalka",100000,3));

  def minus_balance(acc:List[Account])={
    println("--Minus balance Account Numbers--");
    for (x <- acc)if (x.balance<0)println(x.accnum);
  }
  def sum(acc:List[Account])={
    println("--Balance if all accounts--");
    var sub=0.0;
    for (x <- acc)if (x.balance>0)sub=sub+x.balance;
    println(sub);
  }
  def interest(acc:List[Account])={
    var i=0;
    for (x <- acc) {
      if (x.balance > 0){
        bank(i).balance=bank(i).balance+bank(i).balance*0.05
      }else bank(i).balance=bank(i).balance-bank(i).balance*0.01
      i=i+1;
    }
  }
  minus_balance(bank);
  sum(bank);
  interest(bank);
  sum(bank);
}

class Account (name:String,balanc:Double,accnm:Int){
  var balance = balanc;
  var accnum=accnm;
  def p(): Unit ={
    println(this.balance);
  }

  def transfer(a2:Account,amount: Int): Unit ={
     this.balance=this.balance-amount;
     a2.balance=a2.balance+amount;
  }
}
