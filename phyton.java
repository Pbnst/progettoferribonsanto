import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class  phyton {
public static void main(String[] args)throws FileNotFoundException, IOException{
	Scanner input = new Scanner(System.in);
	String fileName = "città.txt";
	Scanner scan = new Scanner(new File(fileName));
	String rline = "";
	Boolean iniziato = false;
	Scanner in = new Scanner(System.in);
	System.out.println("Scegli tra le seguenti città:");
	System.out.println("New York");
	System.out.println("Orlando");
	System.out.println("Los Angeles");
	System.out.println("Chicago");
	System.out.println("Washington");
	System.out.println("Fine per uscire");
	statistiche times;
	String città;
			
	do {
	System.out.println("Scegli la città in cui cercare lavoro");
	città = in.nextLine();
	 {
	 switch(città.toUpperCase()) 
	 {
	 case "NEW YORK":
		 do{
			 String app = scan.nextLine();

			 if(app.contains("NEW YORK"))
				 iniziato = true;
			 if(iniziato)
			 {
			 if(app.contains("python"))
			 {
				 rline += app;
			 }
			 else if(app.contains("."))
				 break;
			 }
		 }while(scan.hasNextLine());
		 
		 times =  new statistiche(rline);
		 times.stampaStatistiche();
		 break;
	 case "ORLANDO":
		 do{
			 String app = scan.nextLine();

			 if(app.contains("ORLANDO"))
				 iniziato = true;
			 if(iniziato)
			 {
			 if(app.contains("python"))
			 {
				 rline += app;
				 System.out.println(app);
			 }
			 else if(app.contains("."))
				 break;
			 }
		 }while(scan.hasNextLine());
		 
		 times =  new statistiche(rline);
		 times.stampaStatistiche();
		 break;
	 case "LOS ANGELES":
		 do{
			 String app = scan.nextLine();

			 if(app.contains("LOS ANGELES"))
				 iniziato = true;
			 if(iniziato)
			 {
			 if(app.contains("python"))
			 {
				 rline += app;
			 }
			 else if(app.contains("."))
				 break;
			 }
		 }while(scan.hasNextLine());
		 times =  new statistiche(rline);
		 times.stampaStatistiche();
		 break;
	 case "CHICAGO":
		 do{
			 String app = scan.nextLine();

			 if(app.contains("CHICAGO"))
				 iniziato = true;
			 if(iniziato)
			 {
			 if(app.contains("python"))
			 {
				 rline += app;
			 }
			 else if(app.contains("."))
				 break;
			 }
		 }while(scan.hasNextLine());
		 
		 times =  new statistiche(rline);
		 times.stampaStatistiche();
		 break;
	 case "WASHINGTON":
		 do{
			 String app = scan.nextLine();

			 if(app.contains("WASHINGTON"))
				 iniziato = true;
			 if(iniziato)
			 {
			 if(app.contains("python"))
			 {
				 rline += app;
			 }
			 else if(app.contains("."))
				 break;
			 }
		 }while(scan.hasNextLine());
		 
		 times =  new statistiche(rline);
		 times.stampaStatistiche();
		 break;
	 case "FINE":{
		 break;	 
	 }
     default: System.out.println("inserisci una delle città elencate sopra");
	 }
	
 }
}while(città!=null);

}}