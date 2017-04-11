
public class account {
 static int balance=1000,amount;
 public int withdraw (int amount){
	 balance=balance-amount;
	 return balance;
	 
 }
  public int credit(int amount){
	  balance=balance+amount;
	  return balance;
  }
}
