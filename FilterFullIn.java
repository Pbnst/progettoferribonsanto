package com.progetto.progetto.FIlter;
import com.progetto.progetto.Model.Job;
import com.progetto.progetto.Utils.Filter;
import com.progetto.progetto.Utils.FiltroArrayDiStringa;

/** classe che implementa il filtro per verificare se il lavoro sia di tipo full time
 * 
 * @author pietrobonsanto
 *@see filter
 *@see FiltroArrayDiStringa
 */
public class FilterFullIn extends FiltroArrayDiStringa implements Filter{
	

	 /** Costruttore della classe, che richiama il costruttore della super classe
	 * 
	 * @param parametri
	 */
	public FilterFullIn(Object parametri) {
		super(parametri);
	}

	/**
	 * Override del metodo filter, dell'interfaccia Filter che restituisce true se
	 * la condizione è vera, false altrimenti
	 * 
	 * @see Filter
	 */
	@Override
	public boolean filter(Job job) {
		for(String p : param) {
		if(job.getEtype().equals(p)) {
				return true;
			}
		}
	
		return false;
	}
}


