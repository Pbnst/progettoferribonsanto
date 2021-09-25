/** la classe statistiche prende un file di testo in input, poi attraverso il metodo stat lo scorre e cerca se le parole sotto elencate
 * sono presenti, se è così incrementa la variabile result, poi utilizza tale risultato per creare le statistiche su lavori: part time, full time, in remoto
 * e in sede e le stampa a schermo */
public class statistiche {
	private String text; 
	public statistiche(String unTesto)
	{
	 text = unTesto;
	}
	public int stat(String word)
	{
	 int result = 0;
	 for (int i = 0; i <= (text.length() - word.length()); i++)
	 {
	 if(text.substring(i,i+word.length()).toUpperCase().equals(word.toUpperCase()))
		 result++;
	 }
	return result;
	}
	
	public void stampaStatistiche()
	{
		 String word = "part time";
		 String word2 = "full time";
		 String word3 = "remoto";
		 String word4 = "sede";
		 double numero_part = this.stat(word);
		 double numero_full = this.stat(word2);
		 double numero_no = this.stat(word4);
		 double numero_rem = this.stat(word3);
		 double tot1= numero_part + numero_full;
		 double tot2= numero_no + numero_rem;
		 double ris1= numero_part / tot1 *100;
		 double ris2= numero_full / tot1 *100;
		 double ris3= numero_rem / tot2 *100;
		 double ris4= numero_no / tot2 *100;
		 System.out.println("percentuale lavori par time " + ris1 +"%");
		 System.out.println("percentuale lavori full time " +ris2 +"%");
		 System.out.println("percentuale lavori in remoto "+ ris3 +"%");
		 System.out.println("percentuale lavori in sede " + ris4 +"%");
	}
}
