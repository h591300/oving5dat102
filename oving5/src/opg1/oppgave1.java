package opg1;

public class oppgave1 {

	public static int SumN(int n) {
		if(n!=0) {
			return n+SumN(n-1);
		}
		else {
		return n;
		}
	}
	
	public static int an(int n) {
		if(n>1){
			return 5*an(n-1)-6*an(n-2)+2;
		}
		else if(n==1) {
			return 5;
		}
		else {
			return 2; 
		}
	}
	public int lucas(int n) {
		return 0;
	}
	
	public static void main(String[] args) {
	
		System.out.println(SumN(100));
		System.out.println(an(10));
		
	}
}
