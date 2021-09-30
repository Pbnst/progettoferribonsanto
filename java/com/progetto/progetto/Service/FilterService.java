package com.progetto.progetto.Service;

import java.util.ArrayList;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.progetto.progetto.Exception.*;
import com.progetto.progetto.Model.*;
import com.progetto.progetto.Utils.*;


public class FilterService {
private final static String path = "com.progetto.progetto.Filter.";
private static ArrayList<Job> listalavori = JSONParser.parsaJson(JSONDownloader.JSONDownloadato());

/**
 * Permette di istanziare un oggetto Filter indicando i paramatri di filtraggio
 * desiderati.
 * 
 * @param column   campo da filtrare
 * @param operator tipo di filtraggio desiderato
 * @param param    parametro ingresso necessario al filro selezionato
 * @return un oggetto che rappresenta filtro desiderato
 * @throws Exception
 * @throws UnexistingFilterException il filtro richiesto non esiste
 * @throws WrongARgumentException   il parametro d'ingresso al filtro non e'
 *                                    valido per il filro selezionato.
 * @throws Exception                  errori interni
 */

public static Filter instanceFilter(String column, String operator, Object param) throws Exception {

	Filter filtro;
	String filterName = new String("Filter" + column + operator);
	String ClassFilterName = path.concat(filterName);

	try {

		Class<?> cls = Class.forName(ClassFilterName); // seleziona la classe

		Constructor<?> ct = cls.getDeclaredConstructor(Object.class); // seleziona il costruttore

		filtro = (Filter) ct.newInstance(param); // istanzia oggetto filtro
	}

	// entra qui se il nome filtro non e' corretto
	catch (ClassNotFoundException e) {
		throw new UnexistingFilterException(
				"Il filtro nel campo: '" + column + "' con l'operatore: '" + operator + "' non esiste");
	}

	// entra qui se il costruttore chiamato da newInstance lancia un eccezione
	catch (InvocationTargetException e) {
		// genera una nuova eccezione
		throw new WrongArgumentException(e.getTargetException().getMessage() + " Atteso in: '" + column + "'");
	}

	catch (LinkageError | NoSuchMethodException | SecurityException | InstantiationException
			| IllegalAccessException e) {

		e.printStackTrace();
		throw new Exception("try later");
	}

	return filtro;

	

}


/**
 * Questo metodo scorre i job (contenuti in un'Array) e restitusce un nuovo

 * ArrayList composto da soli record che risultano positivi al filtro.
 * 
 * @param filtro        desiderato
 * @param previousArray ArrayList di jobs da filtrare
 * @return ArrayList di jobs filtrati
 */

public static ArrayList<Job> FilterAND(Filter filtro, ArrayList<Job> previousArray) {

	ArrayList<Job> filteredArray = new ArrayList<Job>();

	for (Job job : previousArray) {

		if (filtro.filter(job))
			filteredArray.add(job);
	}

	return filteredArray;
}


/**
 * Questo metodo restitusce un ArrayList di job che contiene i tweet
 * precedenti con in aggiunta quelli che rispettano il filtro
 * 
 * @param filtro        desiderato
 * @param previousArray ArrayList di job iniziale
 * @return ArrayList di job filtrati
 */

public static ArrayList<Job> FilterOR(Filter filtro, ArrayList<Job> previousArray) {

	ArrayList<Job> filteredArray = new ArrayList<Job>();

	for (Job job : listalavori) {

		if (filtro.filter(job))
			filteredArray.add(job);
	}

	previousArray.removeAll(filteredArray);
	previousArray.addAll(filteredArray);
	return previousArray;
}
}





















