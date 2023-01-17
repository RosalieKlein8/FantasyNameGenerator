import java.util.Random;
import java.util.Scanner;

public class FantasyNameGenerator {
	
	public static void main(String[] args){
	
	    // Variables
		
            Scanner input = new Scanner(System.in);
	    Random random = new Random();
	    
	    // Names
	    
	    String fName[] = {"Vanikain", "Vanikath",	"Vanikfar",	"Vanikien",	"Vanikik", "Vanikil", "Vanikimal",
	    	    "Zanain", "Zanath",	"Zanfar"};
	    
	    String lName[] = {"Adlain",	"Avalam", "Enakan",	"Enakaron",	"Grulathil", "Moaben",	"Rallam", "Grulbruk",	
	    	    "Rallaron",	"Rallathil", "Rallbruk", "Sailaron", "Sailathil", "Sailbruk"};

	    // Code
		
	    // Ask for user input
		System.out.println("Generate a fantasy name? (Y/N)");
		String yesNo = input.nextLine();
		
		
		// If they say yes
		if(yesNo.equals("y") || yesNo.equals("Y")) {
			
			System.out.println(fName[random.nextInt(fName.length)] + " " + lName[random.nextInt(lName.length)]);
					
			// Generate another 						
		    System.out.println("\n" + "Generate another? (Y/N)");
		    String another = input.nextLine();
		    
		    // Loop
		    do{    
		    	System.out.println(fName[random.nextInt(fName.length)] + " " + lName[random.nextInt(lName.length)]);
		    	System.out.println("\n" + "Generate another? (Y/N)");
			    another = input.nextLine();
		      } 
		    
		    while(another.equals("y") || another.equals("Y"));    
		    
		    System.out.println("Bye bitch.");
		}
		
		// If they say no
		else {
			System.out.println("Bye bitch.");
		}   
	    
	    // Close input stream
	    
		input.close();
		
		System.out.println();
		System.out.println();		
	}
}
