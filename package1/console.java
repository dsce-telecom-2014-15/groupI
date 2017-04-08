package package1;
import java.io.*;
import java.util.*;

public class console {

	public static void main(String[] args) {
		int x;
		double f;
	  String name;
		Scanner in=new Scanner(System.in);
		System.out.println("enter values");
		name=in.nextLine();		 
		x=in.nextInt();
		f=in.nextDouble();
		System.out.println("int="+x+"\ndouble="+f+"\nname="+name);
		
		

	}

}
