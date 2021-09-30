package com.progetto.progetto.Service;
import java.util.Collection;
import com.progetto.progetto.Model.*;

/**interfaccia che contiene i metodi implementati in JobServiceImpl
 * 
 * @author pietrobonsanto
 *
 */



public interface JobService {
	
	/**restituisce insieme dei job
	 * 
	 * @return collezione dei jobs
	 */
	

public static Collection<Job> getJob() {
	return null;
}
/**
 * Metodo che restituisce l'insieme dei metadati
 * 
 * @return una Collection di metadati
 */
public abstract Collection<Metadata> getMetada();

/**
 * Metodo che restituisce il numero dei tweet con location
 * 
 * @return un oggetto di tipo ModelloStatistiche
 */
public abstract ModelloStatistiche getStats();

}


