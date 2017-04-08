package package1;

public class MinElementFinder {

	public static void main(String[] args) {
		int i;
		int array[]={22,34,5,45,67,2,34,41,1,33};
		int smallest=array[0];
		for(i=1;i<array.length;i++)
		{
			if(array[i]<smallest)
			{
				smallest=array[i];
			}
		}
		System.out.println("smallest number is="+smallest);
	}

}
