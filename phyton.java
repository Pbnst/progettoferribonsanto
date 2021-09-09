import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class  phyton {
public static void main(String[] args)throws FileNotFoundException, IOException{
	Scanner input = new Scanner(System.in);
	String fileName = "città.txt";
	Scanner in = new Scanner(System.in);
	System.out.println("Scegli la città in cui cercare lavoro");
	System.out.println("Scegli tra le seguenti:");
	System.out.println("New York Orlando Los Angeles Chicago Washington");
			
	
	String città = in.nextLine();

	 {
	 switch(città.toUpperCase()) 
	 {
	 case "NEW YORK":
			BufferedReader reader = new BufferedReader(new FileReader("città.txt"));
			String line = reader.readLine();
			
		 Scanner scan = new Scanner(new File(fileName));
		 String rline = "";
		 Boolean iniziato = false;
		 do{
			 String app = scan.nextLine();

			 if(app.contains("NEW YORK"))
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
		 
		 statistiche times =  new statistiche(rline);
		 times.stampaStatistiche();
		 /*
		 String word = "part time";
		 String word2 = "full time";
		 String word3 = "remoto";
		 String word4 = "sede";
		 double numero_part = times.stat(word);
		 double numero_full = times.stat(word2);
		 double numero_no = times.stat(word4);
		 double numero_rem = times.stat(word3);
		 double tot1= numero_part + numero_full;
		 double tot2= numero_no + numero_rem;
		 double ris1= numero_part / tot1 *100;
		 double ris2= numero_full / tot1 *100;
		 double ris3= numero_rem / tot2 *100;
		 double ris4= numero_no / tot2 *100;
		 System.out.println(ris1);
		 System.out.println(ris2);
		 System.out.println(ris3);
		 System.out.println(ris4);
		 */
		 
		 break;
	 case "Orlando":
		 
		 break;
	 case "Los Angeles":
		
		 break;
	 case "Chicago":
		 
		 break;
	 case "Washington":
		 
		 break;
     default:
    
    	 
    }
	
 }
}

}