import java.util.Scanner;

public class MinMaxElementInArray {

	public static void main(String[] args) {
		int i,small,size,large;
	    int a[]=new int[50];
	    Scanner scan=new Scanner(System.in);
	    System.out.println("enter the size of the array(max 50)");
	    size=scan.nextInt();
	    
	    System.out.println("enter array elements");
	    for(i=0;i<size;i++){
	    	a[i]=scan.nextInt();
	    }
	    
	    for(i=0;i<size;i++){
	    	System.out.println("a[i] :" + a[i]+" ");
	    }
	    
	    System.out.println("Enter 1 to find min number , 2 to find max number ");
	    int number=scan.nextInt();
	    if(number==1)
	    {
	    small=a[0];
	    for(i=0;i<size;i++){
	    if(small>a[i]){
	    	small=a[i];
	    }
	    }
	    System.out.println("smallest element is"+ small);

	}
	
	else{
		 large=a[0];
	    for(i=0;i<size;i++){
	    if(large<a[i]){
	    	large=a[i];
	}
    }
	    System.out.println("largest element is   " +  large);   
	}
	}}
