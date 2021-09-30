package com.progetto.progetto.Utils;

import java.util.ArrayList;
import com.progetto.progetto.Exception.WrongArgumentException;
/**superclasse per i filtri sulle stringhe
 * 
 * @author pietrobonsanto
 *
 */
public class FiltroArrayDiStringa {
	protected ArrayList<String> param = new ArrayList<String>();

	/**
	 * Costruttore della classe
	 * 
	 * @param parametri , deve essere un Array di stringhe
	 */
	public FiltroArrayDiStringa(Object parametri) {
		if (parametri instanceof ArrayList<?>) { // controlla che parametri sia un Array

			for (Object obj : (ArrayList<?>) parametri) {
				if (obj instanceof String) { // controlla che obj sia una stringa
					param.add((String) obj); // se lo e' la aggiunge all'array
				} else {
					throw new WrongArgumentException("Must be a string type!!!"); // altrimenti lancia un
																							// messaggio di errore
				}
			}
		} else {
			throw new WrongArgumentException("Must be an array!!!"); // se parametri non e' un Array lancia un
																			// messaggio di errore
		}
	}

/**
 * Setter dei parametri
 * 
 * @param parametri sara'  un Array di stringhe contenente i parametri per il
 *                  filtraggio
 * @throw ArgomentoErratoException se gli viene passato un argomento non
 *        conforme al tipo
 */
public void SetParametriPerFiltro(Object parametri) {
	if (parametri instanceof ArrayList<?>) {
		for (Object obj : (ArrayList<?>) parametri) {
			if (obj instanceof String) { // controlla che obj sia una stringa
				param.add((String) obj); // se lo e' la aggiunge all'array
			} else {
				throw new WrongArgumentException("Must be a string!!!"); // altrimenti lancia un messaggio
																					// di errore
			}
		}
	} else {
		throw new WrongArgumentException("Must be an array!!!"); // se parametri non e' un Array lancia un
																		// messaggio di errore
	}
}

}











