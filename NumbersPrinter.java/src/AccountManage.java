import java.util.Scanner;

public class AccountManage {

	public static void main(String[] args) {
		int amount;
		account Account=new account();
		System.out.println("enter number 1 to withdraw and number 2 deposit");
		Scanner number=new Scanner(System.in);
		int digit =number.nextInt();
		if(digit==1){		
		System.out.println("enter the amount to withdraw");
		Scanner scan =new Scanner(System.in);
        amount = scan.nextInt();
        if(amount<Account.balance){
        int balance;
        balance = Account.withdraw(amount);
		System.out.println("available  balance :" + balance );
        }
        else{
        	System.out.println("amount entered is exceeding your current balance");
	}
		}
		else{
		System.out.println("enter the amount to deposit");
		Scanner scan1 =new Scanner(System.in);
        amount = scan1.nextInt();
        int balance;
        balance=Account.credit(amount);
        System.out.println("available new balance is " + balance);
}}
	
}