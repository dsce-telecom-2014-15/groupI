package package1;
import java.util.*;
import java.io.*;
public class hellouser {

	public static void main(String[] args) {
		Scanner name= new Scanner(System.in);
		System.out.println("enter your name");
		String username=name.nextLine();
		System.out.println("hello\t"+username);
	}

}
