

import java.util.Scanner;

public class PaintCalculator {

	// initializes values
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        double cansPaintNeeded = 0.0;
        
        final double squareFeetPerGallons = 350.0;
        
        // while loop to ensure input is valid and more than 0
        // Prompts user to input wall's height
        System.out.println("Enter wall height (feet): ");
        wallHeight = scnr.nextDouble();
        while(wallHeight >=1 == false ){
        	System.out.println("Please enter a valid height in feet: ");
            wallHeight = scnr.nextDouble();

        }
    

        // while loop ensures input is valid and more than 0
        // Prompts user to input wall's width
        System.out.println("Enter wall width (feet): ");
        wallWidth = scnr.nextDouble();
        while(wallWidth >=1 == false){
        	System.out.println("Please enter a valid width in feet: ");
            wallWidth = scnr.nextDouble();

        }

        // Calculates and outputs wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + "  square feet");

        // Calculates and outputs the amount of paint (in gallons) needed to paint the wall
        gallonsPaintNeeded = wallArea/squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");
        
        // Calculates and outputs the amount of cans needed for the job
        cansPaintNeeded = Math.ceil(gallonsPaintNeeded);
        System.out.println("Cans needed: "+cansPaintNeeded+" can(s)");

    }
}
