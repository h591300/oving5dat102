package opg2;
import opg2.DobbelKjedetListeS;
public class klientDN {

	public static void main(String[] args) {
		Integer a= 10;
		Integer b= 3;
		Integer c= 1;
		
		DobbelKjedetListeS<Integer> liste = new DobbelKjedetListeS(c,a);
		
		leggTil(b);
		
		fins(b);
		
		slett(b);
		
		visListe();
		
	}

}
