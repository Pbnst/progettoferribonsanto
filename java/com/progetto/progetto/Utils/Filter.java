package com.progetto.progetto.Utils;
import com.progetto.progetto.Model.Job;
/** interfaccia per i filtri 
 * 
 * @author pietrobonsanto
 *
 */
public interface Filter {
	/** se il job rispetta le richieste del filtro il valore bool di risposta sarà true
	 *
	 *@param job
	 *@return risultato 
	 */

	public boolean filter(Job job);
	
	
}
