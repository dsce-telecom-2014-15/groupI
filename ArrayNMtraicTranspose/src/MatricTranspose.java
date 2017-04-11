import java.util.Scanner;

public class MatricTranspose {

	public static void main(String[] args) {
		  int i, j;
	       int arr[][] = new int[3][3];
	       int arrm[][] = new int[3][3];
	       Scanner scan = new Scanner(System.in);
		   
	       System.out.print("Enter 3*3 Array Elements : ");
	       for(i=0; i<3; i++)
	       {
	           for(j=0; j<3; j++)
	           {
	               arr[i][j] = scan.nextInt();
	           }
	       }
		   
	       System.out.print("Transposing Array...\n");
	       for(i=0; i<3; i++)
	       {
	           for(j=0; j<3; j++)
	           {
	               arrm[i][j] = arr[j][i];
	           }
	       }
		   
	       System.out.print("Transpose of the Matrix is :\n");
	       for(i=0; i<3; i++)
	       {
	           for(j=0; j<3; j++)
	           {
	               System.out.print(arrm[i][j]+ " ");
	           }
	           System.out.println();
	       }
	   }
	

	}


