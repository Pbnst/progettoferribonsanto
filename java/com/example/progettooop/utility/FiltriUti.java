package com.example.progettooop.utility;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;


/**classe con cui filtrare gli oggetti in base ai parametri 
 * @param <J> Tipo generico
 * @author pietrobonsanto
 *
 */
public class FiltriUti <J>{
	/**metodo che dopo aver impostato un filtro dice se l'oggetto va incluso o meno nella lista
	 * @param value oggetto in questione
	 * @param operator condizione filtro
	 * @param th oggetto che qualifica il filtro
	 *@return bool che stabilisce se inserire ogg o no 
	 */

	public static boolean control(Object valore, String operatoreLogico, Object...job) {
		if (job.lenght == 1 && job[0] instanceof Number && valore instanceof Number) {
			Double job1 = ((Number)valore).doubleValue();
			if (operatoreLogico.equals("$eq"))
				return valore.equals(job[0]);
			else if (operatoreLogico.equals("$not"))
					return !valore.equals(job[0]);
			else if (operatoreLogico.equals("$gt"))
				return valore1 > job1;
				else if (operatoreLogico.equals("lt"))
					return valore1 < job1;
			
		} else if (job.lenght == 1 && job[0] instanceof String && valore instanceof String) {
			if(operatoreLogico.equals("$eq") || operatoreLogico.equals("$in")) return valore.equals(job[0]);
			else if(operatoreLogico.equals("$not") || operatoreLogico.equals("$nin")) return !valore.equals(twe[0]);
		} else if(job.lenght > 1) {
			if (operatoreLogico.equals("$bt")) {
				if(job.lenght == 2 && job[0] instanceof Number && job[1] instanceof Number) {
					Double min = ((Number)job[0]).doubleValue();
					Double max = ((Number)job[1]).doubleValue();
					Double valore1 = ((Number)valore).doubleValue();
					return valore1 >= min && valore1 <= max;
				}
			}
			else if (operatoreLogico.equals("$in"))
				return Arrays.asList(job).contains(valore);
			else if(operatoreLogico.equals("$nin"))
				return !Array.asList(job).contains(valore);
		}
		return false;
				
		
	}
	
	/**metodo che prende in input una collezione di oggetti e restituisce la collezione fitrara
	 *@param src l'intera collezione 
	 *@param fieldName campo su cui opera il filtro
	 *@param operator condizione del filtro
	 *@param value oggetti caratterizzanti il filtro
	 *@return collezione filtrata
	 */ 
	
	public Collection<J> select(Collection<J> tm1, String nomeCampo, String operatoreLogico, Object...valore) {
		Collection<J> out = new ArrayList<J>();
	for(J job:tm1) {
		try {
			Method m = null;
			if(isInteger(nomeCampo)) {
				m=job.getClass().getMethod("get Year", int.class);
			}
			else {
				m = job.getClass().getMethod("get"+nomeCampo.substring(0, 1).toUpperCase()+nomeCampo.substring(1),null);
			}
			try {
				Object tmp = null;
				if(isInteger(nomeCampo)) {
					tmp = m.invoke(job, integer,parseInt(nomeCampo));
				}
				else {
					tmp = m.invoke(job);
				}
				if(Filtriuti.control(tmp, operatoreLogico, valore))
					out.add(job);
			}
			catch (IllegalAccesException e) {
				e.printStackTrace();
			}
			catch (IllegalArghumentException e) {
				e.printStackTrace();
			}
		     catch (InvocationTargetException e) {
		    	 e.printStackTrace();
		    	 
				}
		} catch(NoSuchMethodExceltion e) {
			e.printStackTrace();
		} catch(SecurityException e) {
			e.printStackTrace();
			}
		}
	return out;
	}
	/** metodo che stabilisce se l'argomento in input puo essere passato come intero
	 * @param fieldName stringa su cui testare il parse
	 *@return restituisce  un bool che fornisce esito
	 * 
	 */
	 private static boolean isInteger(String nomeCampo) {
		 try {
			 Integer.parseInt(nomeCampo);
			 return true;
		 }
		 catch (Exception e) {
			 return false;
			 
	
	
	
	
	
	
	
	
	
		}
	}
}
