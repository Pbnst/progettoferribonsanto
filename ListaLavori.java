package com.example.progettooop.model;

import java.util.*;
import org.json.*;
//DA FARE MIRACCOMANDO
//import com.example.progettooop.utility.Filtri;
//import com.example.progettooop.utility.Filtriuti;
public class ListaLavori implements Filtri<Job, Object[]> {
	private ArrayList<Job> listalavori;
	private FiltriUti<Job> utils;
	
	/* costruttore della lista (oggetto)
	 */
	 

	public ListaLavori(ArrayList<Job> listalavori,FiltriUti<Job> utils) {
		this.listalavori=listalavori;
		this.utils=utils;
	}


/** costruttore oggetto
 * 
 */
ListaLavori(ArrayList<Job> listalavori) {
	this.listalavori=listalavori;
	this.utils=new FiltriUti<Job>();
	
}

/*metodo che restituisce contenuti della lista
 * 
 */
public ArrayList<Job> getListalavori(){
	return listalavori;
}


/**metodo che setta nuova lista di job
 * @param listalavori Oggetti job da immettere
 */

public void SetListalavori(ArrayList<Job> listalavori) {
	this.listalavori=listalavori;
	
}

/** metodo che restituisce le statistiche  sui lavori non in remoto
 *@param place è il luogo in cui si tiene il lavoro
 *@return ritorna il numero di lavori in presenza
 */

public int getFrequenzaplace(String place) {
	int jobplace=0;
	for (Job j: listalavori) {
		if(j.getplace()==place)
		{jobplace++;}
		
	}
return jobplace;

}
 /**metodo che calcola il numero di lavori in un luogo particolare
  * @return ritorna il numero di lavori trovati per quel particolare luogo
  * 
  */
 
public int getJoblocated() {
	int jobloc=0;
	for (Job j: listalavori) {
		if(j.getplace()!= null)
		{jobloc++;}
	}
	return jobloc;
}

/**metodo che calcola il numero di lavori  fulltime
 *@param fulltime indica che il lavoro in questione è fulltime 
 *@return  ritorna il numero di lavori fulltime
 *
 */

public int getJobfulltime(String fulltime) {
	int jobfull=0;
	for(Job j: listalavori) {
		if(j.getFulltime()!= fulltime)
		{jobfull++;}
		
	}
      return jobfull; 

}

/**metodo che applica i filtri alla lista
 *@return listalavori filtrata 
 */

@Override
public ArrayList<Job> campoFiltro(String nomeCampo, String operatoreLogico, Object...valore) {
	return (ArrayList<Job>) utils.select(this.getListalavori(), nomeCampo, operatoreLogico, valore);

}

/** metodo che inserisce il lavoro passato come argomento alla lista
 *@param j (job) da inserire
 * 
 */

public void inserisciJob(Job j) {
	listalavori.add(j);
	
	
}
 /**costruttore senza passaggio di parametri
  * 
  */

public ListaLavori() {
	listalavori= new Arraylist<Job>();
	
}

}











