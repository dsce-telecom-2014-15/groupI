import java.util.Scanner;

public class SmallestNumberArray {

	public static void main(String[] args) {
		 int i,s,size;
		    int a[]=new int[5];
		    Scanner scan=new Scanner(System.in);
		    System.out.println("enter the size of the array");
		    size=scan.nextInt();
		    System.out.println("enter array elements");
		    for(i=0;i<size;i++){
		    	a[i]=scan.nextInt();
		    }
		    for(i=0;i<size;i++){
		    	System.out.println("a[i] :" + a[i]+" ");
		    }
		    s=a[0];
		    for(i=0;i<size;i++){
		    if(s>a[i]){
		    	s=a[i];
		    }
		    }
		    System.out.println("smallest element is  "+ s);
		    
		    
		 }

	}


