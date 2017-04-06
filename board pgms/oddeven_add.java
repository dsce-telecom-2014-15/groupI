
public class oddeven_add {

	public static void main(String[] args) {
		int a[][] = new int[5][5],i,j,rem,sum1=0,sum2=0;

	for(i=1;i<5;i++){
	for(j=1;j<5;j++){
			
		   a[i][j]=i;
		   rem=a[i][j]%2;
    if(rem==0){
			sum1=sum1+a[i][j];
			//System.out.println("even num :" +a[i][j]);
		}
	else{
			sum2=sum2+a[i][j];
			//System.out.println("odd num :" + a[i][j] +"  ");
		}
		}
		}
	System.out.println("even num sum :" + sum1);
	System.out.println("odd num :" +sum2);
	}
}

