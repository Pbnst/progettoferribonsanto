package com.progetto.progetto.FIlter;

import com.progetto.progetto.Model.Job;
import com.progetto.progetto.Utils.Filter;
import com.progetto.progetto.Utils.FiltroArrayDiStringa;

/**classe che implementa filtro per verificare che una location non sia presente
 * 
 * @author pietrobonsanto
 *
 */



public class Filterlocationnin extends FiltroArrayDiStringa implements Filter {
	/**
	 * Costruttore della classe, che richiama il costruttore della super classe
	 * 
	 * @param parametri
	 */
	public Filterlocationnin(Object parametri) {
		super(parametri);

	}

	/**
	 * Override del metodo filter, dell'interfaccia Filter che restituisce true se
	 * la location NON e' presente, false altrimenti
	 * 
	 * @see Filter
	 */
	@Override
	public boolean filter(Job job) {
		for (String p : param) {
		if (!job.getLocation().equals(p)) {
		return true;
	} 
		}
		return false;
	}
	}




