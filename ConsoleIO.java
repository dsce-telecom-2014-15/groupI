import java.util.Scanner;

public class ConsoleIO {

	public static void main(String[] args) {
	Scanner str=new Scanner(System.in);
	System.out.println("enter the str");
	String n=str.nextLine();
	System.out.println("hello \n      " + n + "bye");
	
	Scanner b=new Scanner (System.in);
	System.out.println("enter value b");
	int ba=b.nextInt();
	System.out.println(ba);
	}
}
