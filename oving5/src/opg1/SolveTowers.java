package opg1;

public class SolveTowers {
	/**
	 * Creates a TowersOfHanoi puzzle and solves it.
	 */
	 public static void main(String[] args){
		TowersOfHanoi towers = new TowersOfHanoi(32);
		long tidfor = System.nanoTime();
	 	towers.solve();
	 	long tidetter = System.nanoTime();
	 	long hundredel=(tidetter-tidfor)/1000000;
	 	long sek=hundredel/1000;
		System.out.print(sek+".");
		System.out.print(hundredel-(sek*1000)+" sekunder");
	 }
	
}
