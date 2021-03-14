package opg1;

public class oppgave1 {

	public static int SumN(int n) {
		if(n>1) {
			return n+SumN(n-1);
		}
		else if(n==1){
			return 1;
		}else {
			return 0;
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
	
	public static void main(String[] args) {
		System.out.println("Summen av alle tall til 100: "+SumN(100));
		System.out.println();
		System.out.print("10 første tallene i rekken: ");
		for(int i=2;i<12;i++) {
			System.out.print(an(i)+", ");
		}


	}
}
