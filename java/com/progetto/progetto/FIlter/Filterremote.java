package com.progetto.progetto.FIlter;
import com.progetto.progetto.Model.Job;
import com.progetto.progetto.Utils.Filter;
import com.progetto.progetto.Utils.FiltroArrayDiStringa;

/** classe che implementa il filtro per verificare se il lavoro sia in remoto
 * 
 * @author pietrobonsanto
 *@see filter
 *@see FiltroArrayDiStringa
 */
public class Filterremote extends FiltroArrayDiStringa implements Filter{
	

	 /** Costruttore della classe, che richiama il costruttore della super classe
	 * 
	 * @param parametri
	 */
	public Filterremote(Object parametri) {
		super(parametri);
	}

	/**
	 * Override del metodo filter, dell'interfaccia Filter che restituisce true se
	 * l'utente e' presente, false altrimenti
	 * 
	 * @see Filter
	 */
	@Override
	public boolean filter(Job job) {
		for(String p : param) {
		if(job.getRemote().equals(p)) {
				return true;
			}
		}
	
		return false;
	}
}


