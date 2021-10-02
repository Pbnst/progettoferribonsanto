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
	static public int contaRemoto(ArrayList<Job> job) {
		int contaremoto=0;
		for (Job j : job) {
			if (j.getRemote()) {
				contaremoto++;
			}
		}
		return contaremoto;
	}

	/**metodo che veritfica l'assenza di location e quindi i job in remoto
	 *@param job array list 
	 *@return numero di job in remoto
	 * 
	 */
	 
	static public int contaSede(ArrayList<Job> job) {
		int contasede=0;
		for (Job j : job) {
			if (!j.getRemote()) {
				contasede++;
			}
		}
		return contasede;
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
		if (j.getEtype().equals("part time")) {
			contaptime++;
		}
	}
	return contaptime;
}
/**
 * Metodo che conta la frequenza per ogni citta'NON SERVE FILO CANCELLA
 *
 * @param job Array di job da controllare
 * @return un Array di frequenze
 * @see Frequenze
 */


/* static public ArrayList<Frequenze> freqLocUt(ArrayList<Job> job) {
	ArrayList<Frequenze> arrayfrequenze = new ArrayList<Frequenze>();
	
	
	for (Job j : job) {
		Frequenze f = new Frequenze();
		f.setnumvisite(0);
		f.setCitta(t.getLocation());
		if (arrayfrequenze.isEmpty()) {
			f.incrementanumvisite();
			arrayfrequenze.add(f);
		}
		
		else {

			
					
				
			}}}	
			


	return arrayfrequenze;*/ // non ci serve 


}

		
		
		
		
		
		
		
		

