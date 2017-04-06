

public class SumOfArray {

	public static void main(String[] args) {
		int[][] a = new int[4][4];
		int i, j;
		int[][] b = new int[4][4];
		int[][] sum = new int[4][4];
		
		
		for (i = 0; i < 4; i++) {

			for (j = 0; j < 4; j++) {
				a[i][j] = i;
				b[i][j] = j;
			
				sum[i][j] = a[i][j] + b[i][j];
				System.out.print(sum[i][j] + "");
			}
			System.out.println();

		}
	}

}
