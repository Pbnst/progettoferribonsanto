import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class mainvero {
	public static void main(String[] args)throws FileNotFoundException, IOException{
		String fileName = "città.txt";
	    statistiche times;
	    String città;
	    String appCitta;
	    String tipoLavoro="";
	    String filtro;
	    do {
	        Scanner scan = new Scanner(new File(fileName));
	        Boolean iniziato = false;
	        String rline = "";
	        Scanner input = new Scanner(System.in);
	        System.out.println("Scegli il tipo di lavoro da cercare");
            tipoLavoro = input.nextLine();
            if(!tipoLavoro.equals("fine")) {
            System.out.println("scegli come filtrare le statistiche");
            filtro = input.nextLine(); 
            switch(filtro) {
            case "città":
	            System.out.println("Scegli la città in cui cercare il lavoro");
	            System.out.println("New York");
	            System.out.println("Orlando");
	            System.out.println("Los Angeles");
	            System.out.println("Chicago");
	            System.out.println("Washington");
	            appCitta = input.nextLine();
	            while (scan.hasNext()) {
	                città = scan.nextLine();
	                if (città.toUpperCase().contains(appCitta.toUpperCase())) {
	                    iniziato = true;
	                }
	                if (iniziato) {
	                    if (città.toUpperCase().contains(tipoLavoro.toUpperCase())) {
	                        rline += città;
	                    } else if (città.contains("."))
	                        break;
	                }
	            }
	                if (!iniziato)
	                    System.out.println("Citta non trovata");
	                else {
	                    times = new statistiche(rline);
	                    times.stampaStatistiche();
	                }
            	break;
            case "azienda":
            	
            	
            }
            }else break;
	    }while(true);
	}
}
