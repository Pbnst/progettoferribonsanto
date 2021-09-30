package com.progetto.progetto.Model;

public class ModelloStatistiche {
private int jobloc;
private int jobrem;
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
public int getJobrem() {
	return jobrem;
	
}

public void setJobrem(int jobrem) {
	this.jobrem = jobrem;
			
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












