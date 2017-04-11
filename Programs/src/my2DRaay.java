import java.util.Scanner;

public class my2DRaay {

	public static void main(String[] args) {
		int arr1[][] = new int[5][5];
		int arr2[][] = new int[5][5];
		int sum[][]=new int[5][5];
		  int row1, col1,row2,col2, i, j;
	     
	       
		Scanner scan = new Scanner(System.in);
		   
	       System.out.print("Enter Number of Row1 for Array (max 5) : ");
	       row1 = scan.nextInt();
	       System.out.print("Enter Number of Column1 for Array (max 5) : ");
	       col1 = scan.nextInt();
		   

	       System.out.print("Enter Number of Row2 for Array (max 5) : ");
	       row2 = scan.nextInt();
	       System.out.print("Enter Number of Column2 for Array (max 5) : ");
	       col2 = scan.nextInt();
		   
	       if(row1==row2&col1==col2)
	       {
	       System.out.print("Enter " +(row1*col1)+ " Array1 Elements : ");
	       for(i=0; i<row1; i++)
	       {
	           for(j=0; j<col1; j++)
	           {
	               arr1[i][j] = scan.nextInt();
	               
	           }
	       }
	       System.out.print("Enter " +(row2*col2)+ " Array2 Elements : ");
	       for(i=0; i<row2; i++)
	       {
	           for(j=0; j<col2; j++)
	           {
	               arr2[i][j] = scan.nextInt();
	               
	           }
	       }
	       System.out.print("Addition of Array1 and Array2 :");
	       for(i=0; i<row1; i++)
	       {
	           for(j=0; j<col1; j++)
	           {
	        	   sum[i][j]=arr1[i][j]+arr2[i][j];
	               System.out.print(sum[i][j]+ " ");
	               
	           }
	           System.out.println();
	       }
	      }
	       else{
	    	   System.out.println("DIMENSION ERROR");
	       }
	

	}

}
