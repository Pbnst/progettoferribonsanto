

import java.util.Scanner;
public class  menù {
public static void main(String[] args){
	Scanner in = new Scanner(System.in);
			
	System.out.println("Scegli la città in cui cercare lavoro");
	System.out.println("Scegli tra le seguenti:");
	System.out.println("New York Orlando Los Angeles Chicago Washington");
			
	
	String città = in.nextLine();

	 String nome ;{
	 switch(città) {
	 case "New York":
		 nome="New York";
		 
		 
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
    	 nome="Città non presente";
    	 System.out.println(nome);
    
    	 
    }
	
 }}}