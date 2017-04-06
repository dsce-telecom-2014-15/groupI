import java.util.Scanner;

public class evenodd {

	public static void main(String[] args) {
		int arr[][] = new int[5][5],rem;
		  int row, col, i, j;
	     
	       
		Scanner scan = new Scanner(System.in);
		   
	       System.out.print("Enter Number of Row for Array (max 5) : ");
	       row = scan.nextInt();
	       System.out.print("Enter Number of Column for Array (max 5) : ");
	       col = scan.nextInt();
		   
	       System.out.print("Enter " +(row*col)+ " Array Elements : ");
	       for(i=0; i<row; i++)
	       {
	           for(j=0; j<col; j++)
	           {
	               arr[i][j] = scan.nextInt();
	           }
	       }
	       for(i=0;i<row;i++){
	    	   for(j=0;j<col;j++){
	       
	       rem=arr[i][j]%2;
      		if(rem==0){
      			System.out.println(arr[i][j]);
      		}
      		else{
      			System.out.println("odd num :" + arr[i][j] +"  ");
      		}
          }
	}
}}
	  
		   
	       /*System.out.print("The Array is :\n");
	       for(i=0; i<row; i++)
	       {
	           for(j=0; j<col; j++)
	           {
	               System.out.print(arr[i][j]+ "  ");
	           }
	           System.out.println();
	       }
	   
		
		for(i=0;i<row;i++){
			for(j=0;j<col;j++)
			{ arr[i][j] = scan.nextInt();
		rem=a[i][j]%2;
		if(rem==0){
			System.out.println(a[i][j]);
		}
		else{
			System.out.println("odd num :" + a[i][j] +"  ");
		}
		}
			System.out.println();
	}

}}*/
