package opg3;

public class binaersoeking {
	
	public static<T extends Comparable<T>> 
	boolean binaerSoek(T [] data, int min, int maks, T el){
		
		if(min > maks){ // basistilfelle, ingen element
			return false;
		}
		int midtpunkt = (min + maks) / 2;
		int resultat = el.compareTo(data[midtpunkt]);
		if(resultat == 0){ // basistilfelle, finner elementet
			return true;
		}  // kunne brukt elseif
		if(resultat < 0){
			return binaerSoek(data, min, midtpunkt -1, el);
		} else{
			return binaerSoek(data, midtpunkt + 1, maks, el);
			}
		}
		


}
