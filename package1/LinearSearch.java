package package1;
import java.util.*;
public class LinearSearch {

	public static void main(String[] args) {
		int i,n,j=0;
		boolean f=false;
		int array[]={1,2,3,4,5,6,7,8,9};
		System.out.println("enter the number to be searched:");
		Scanner num=new Scanner(System.in);
		n=num.nextInt();
		for(i=0;i<array.length;i++)
		{if(array[i]==n)
		{
			j=i+1;
			f=true;
			break;
		}
		}
		if(f)
			System.out.println(n+"\tis found at position=\t"+j);
		else
			System.out.println(n+"\tnot found");
			
	}

}
