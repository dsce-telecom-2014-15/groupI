import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		 int a=0, b=1, c=0, size;
	        Scanner scan = new Scanner(System.in);
			
	        System.out.print("Upto How Many Term ");
	        size= scan.nextInt();
	        
	        System.out.print("Fibonacci Series : " + a + "  " + b + "  ");
	        c = a + b;
	        
	        size = size - 2;
			
	        while(size>0)
	        {
	            System.out.print(c + "  ");
	            a = b;
	            b = c;
	            c = a + b;
	            size--;
	        }
			

	}

}
