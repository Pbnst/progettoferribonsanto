package com.progetto.progetto.FIlter;
import com.progetto.progetto.Model.Job;
import com.progetto.progetto.Utils.Filter;
import com.progetto.progetto.Utils.FiltroArrayDiStringa;

/** classe che implementa il filtro per verificare se il lavoro sia in di tipo part time
 * 
 * @author pietrobonsanto
 * @author filippoferri
 *@see filter
 *@see FiltroArrayDiStringa
 */
public class FilterPart extends FiltroArrayDiStringa implements Filter{
	

	 /** Costruttore della classe, che richiama il costruttore della super classe
	 * 
	 * @param parametri
	 */
	public FilterPart(Object parametri) {
		super(parametri);
	}

	/**
	 * Override del metodo filter, dell'interfaccia Filter che restituisce true se
	 *  è presente la condizione, false altrimenti
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