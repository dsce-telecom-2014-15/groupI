import java.util.Scanner;

public class ArrayelementsAdder {

	public static void main(String[] args) {
		int[]a = new int[50];
		int i,sum=0;
		
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("enyer the size of Array(max50)");
		int size=scan.nextInt();
		
		for(i=0;i<size;i++)
		{
			a[i]=scan.nextInt();
			sum=sum+a[i];
		}
			System.out.println("Sum of Array elements is :" + sum);
					
		}
		

	}


