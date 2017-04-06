package findmin.java;

public class minnumber1 {

	public static void main(String[] args) {
		int a=10,b=20,c=30;
		int minNumber=findminNumber(a,b,c);
		System.out.println(minNumber);

	}
	private static int findminNumber(int a,int b,int c){
		if(a<b){
			if(a<c){
				return a;
			}
			else{
				return c;
			}
		}
		else{
			if(b<c){
				return b;
				
				
			}
			else{
				return c;
			}
		}
		
		
	}
}
