import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/** la classe python crea una rotta che chiede in input il linguaggio di programmazione riguardo cui cercare lavori. Successivamente si richiedono 
 * specifiche per filtrare le informazioni attraverso le citt? consigliate. 
 * Infine stampa a schermo statistiche riguardo tali lavori*/
public class python {
	public static void main(String[] args)throws FileNotFoundException, IOException{
		String fileName = "citt?.txt";
	    statistiche times;
	    String citt?;
	    String appCitta;
	    String tipoLavoro="";
	    String filtro;
	    do {
	        Scanner scan = new Scanner(new File(fileName));
	        Boolean iniziato = false;
	        String rline = "";
	        Scanner input = new Scanner(System.in);
	        System.out.println("Scegli il linguaggio di programmazione richiesto");
            tipoLavoro = input.nextLine();
            if(!tipoLavoro.equals("fine")) {
            System.out.println("scegli come filtrare le statistiche");
            System.out.println("citt?: filtra le statistiche in base alla citt? scelta");
            //System.out.println("azienda: filtra le statistiche in base alla granzdezza dell'azienda");
            filtro = input.nextLine(); 
            switch(filtro) {
            case "citt?":
	            System.out.println("Scegli la citt? in cui cercare il lavoro");
	            System.out.println("New York");
	            System.out.println("Orlando");
	            System.out.println("Los Angeles");
	            System.out.println("Chicago");
	            System.out.println("Washington");
	            appCitta = input.nextLine();
	            while (scan.hasNext()) {
	                citt? = scan.nextLine();
	                if (citt?.toUpperCase().contains(appCitta.toUpperCase())) {
	                    iniziato = true;
	                }
	                if (iniziato) {
	                    if (citt?.toUpperCase().contains(tipoLavoro.toUpperCase())) {
	                        rline += citt?;
	                    } else if (citt?.contains("."))
	                        break;
	                }
	            }
	                if (!iniziato)
	                    System.out.println("Citta non trovata");
	                else {
	                    times = new statistiche(rline);
	                    times.stampaStatistiche();
	                }
            }
            }else break;
	    }while(true);
	}
}
