import java.util.Scanner;

public class LandApp2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		// i) Declare array of object for Land objects. */

		System.out.print("Please enter size: ");
		int size = keyboard.nextInt();
		keyboard.nextLine();

		Land[] land = new Land[size];

		// Instantiate each subscript
		for (int i = 0; i < land.length; i++) {
			land[i] = new Land();
		}
		
        	// ii) Input some data onto the array of objects.
		for (int i = 0; i < land.length; i++) {
			System.out.print("\nPlease enter your ID: ");
			land[i].setid(keyboard.nextLine());

			System.out.print("Please enter your name: ");
			land[i].setname(keyboard.nextLine());

			System.out.print("Please enter area: ");
			land[i].setarea(keyboard.nextDouble());
			keyboard.nextLine();

			System.out.print("Please enter house type: ");
			land[i].sethouse(keyboard.nextLine());
		}
		
        	// iii) Display the land information from the Condominium house type.
		for (int i = 0; i < land.length; i++) {
			if (land[i].gethouse().equalsIgnoreCase("C")) {
				System.out.println(land[i].toString()); // call toString()
			}
		}

                // iv) Calculate and display the total price for each type of the house.
		double total = 0.00;
		for (int i = 0; i < land.length; i++) {
			total += land[i].calcArea();
		}
		System.out.printf("\nTotal is: RM%.2f", total);

		/*
		 * printf()
		 * %s = output string
		 * %c = output char
		 * %d = output digit (int)
		 * %f = output float & double
		 * %2f = output float & double WITH CHARACTER SIZE OF 2
		 * %.2f = output float & double WITH 2 DECIMAL POINT
		 * \n = new line
		 * \t = tab
		 */

        	// v) Calculate and display the average tax price for Semi-Detached house type.
		double semiDetachedHouse = 0.00;
		int numberOfSD = 0;
		for (int i = 0; i < land.length; i++) {
			if (land[i].gethouse().equalsIgnoreCase("S")) {
				semiDetachedHouse += land[i].calcArea();
				numberOfSD++;
			} else {
				semiDetachedHouse = 0.00;
			}
		}
		semiDetachedHouse /= numberOfSD;
		System.out.println("\nAverage tax price for Semi-Detached House: " + semiDetachedHouse);

        	// vi) Determine and display the highest tax price for Bungalow house type. */
		double highest = -999999.99;
		for (int i = 0; i < land.length; i++) {
			if (land[i].gethouse().equalsIgnoreCase("B")) {
				if (land[i].calcArea() > highest) {
					highest = land[i].calcArea();
				}
			}
		}
		System.out.println("\nHigest tax price for bungalow: " + highest);
	}
}
