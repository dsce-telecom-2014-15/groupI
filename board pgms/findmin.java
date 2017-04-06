package findmin.java;

public class findmin {

	public static void main(String[] args) {
		int a=10,b=20,c=30;
		int maxNumber=findmaxNumber(a,b,c);
		System.out.println(maxNumber);
	}

	private static int findmaxNumber(int a, int b, int c) {
		if(a>b){
			if(a>c){
				return a;
			}
			else{
				return c;
			}
			}
		
			else{
				if(b>c){
					return b;
				}
				else{
					return c;
				}
			}
	}
}	
	
	


