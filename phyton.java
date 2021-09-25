import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class  phyton {
 public static void main(String[] args)throws FileNotFoundException, IOException{
	String fileName = "città.txt";
    System.out.println("Scegli tra le seguenti città:");
    System.out.println("New York");
    System.out.println("Orlando");
    System.out.println("Los Angeles");
    System.out.println("Chicago");
    System.out.println("Washington");
    System.out.println("Fine per uscire");
    statistiche times;
    String città;
    String appCitta;
    String tipoLavoro="";
    do {
        Scanner scan = new Scanner(new File(fileName));
        Boolean iniziato = false;
        String rline = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Scegli la citta in cui cercare lavoro");
        appCitta = input.nextLine();
        if(!appCitta.equals("fine"))
        {
            System.out.println("Scegli il tipo di lavoro da cercare");
            tipoLavoro = input.nextLine();
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
        }
        else
            break;
    }while (true);
}
}
	