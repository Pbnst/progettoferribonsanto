package com.progetto.progetto.Utils;
import java.util.ArrayList;
import com.progetto.progetto.Model.*;

/**classe che restituisce le statistiche
 * 
 * @author pietrobonsanto
 *
 */
public class Statistiche {
	
	/**metodo che conta i job che hanno location diversa da null
	 * @param job ArrayList contenente job da controllare
	 * @return numero dei job con location
	 * 
	 */
	static public int contaLocation(ArrayList<Job> job) {
		int contatore_location=0;
		for (Job j : job) {
			if (!j.getLocation().equals("null ")) {
				contatore_location++;
			}
		}
		return contatore_location;
	}

	/**metodo che veritfica l'assenza di location e quindi i job in remoto
	 *@param job array list 
	 *@return numero di job in remoto
	 * 
	 */
	 
	
	static public int contaLocationnin(ArrayList<Job> job) {
		int contatoreremote=0;
		for (Job j : job) {
			if (j.getLocation().equals("null ")) {
				contatoreremote++;
			}
		}
		return contatoreremote;
	}
	
	

		
/**metodo che conta i job che hanno etype uguale a full time
 * @param job ArrayList contenente job da controllare
 * @return numero dei job in full time
 * 
 */
static public int contaftime(ArrayList<Job> job) {
	int contatoreftime=0;
	for (Job j : job) {
		if (j.getEtype().equals("full time")) {
			contatoreftime++;
		}
	}
	return contatoreftime;
}


/**METODO che conta il numero di lavori a contratto/part time
 * 
 * @param job
 * @return numero di lavori a contratto
 */
	
static public int contaptime(ArrayList<Job> job)	 {
	int contaptime=0;
	for (Job j : job) {
		if (j.getEtype().equals("contract")) {
			contaptime++;
		}
	}
	return contaptime;
}
 

}

		
		
		
		
		
		
		
		

