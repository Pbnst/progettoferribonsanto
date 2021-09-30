package com.progetto.progetto.Model;

public class ModelloStatistiche {
private int jobloc;
private int jobpres;
private int jobfull;
/**costruttore della classe senza parametri
 * 
 */

public ModelloStatistiche() {
	super();
	
}
/** getter che restituisce il numero di job con location diversa da null
 * 
 * @return
 * 
 */
public int getJobloc() {
	return jobloc;
}
 /**setter che permette di settare il numero di job con location
  * 
  */

public void setJobloc(int jobloc) {
	this.jobloc = jobloc;
}


/**getter che restituisce il numero di job con remote pari a true
 * 
 * @return
 */
public int getJobpres() {
	return jobpres;
	
}

public void setJobpres(int jobpres) {
	this.jobpres = jobpres;
			
}

/**getter che restituisce il numero di job con emplyment_type pari a full time
 * 
 */

public int getJobfull() {
	return jobfull;

}

public void setJobfull(int jobfull) {
	this.jobfull = jobfull;
	
}}












