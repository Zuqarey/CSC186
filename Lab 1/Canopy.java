import java.util.Scanner;

public class Canopy {
	public static char c;
	public static int canopies;
	public static int days;
	public static char wc;
	public static char choice;
	public static double charges;
	
	public static double canopyCharges (char c, int canopies, int days, double charges) {

		if (c == 'T')
			charges = 90.00;
		if (c == 'S')
			charges = 150.00;
		if (c == 'O')
			charges = 200.00;


		return charges * canopies * days;
	}
	
	public static double additionaiCharges(char wc){
		return (wc == 'Y' || wc == 'y') ? 100: 0;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		do{
			System.out.print("Welcome to rental system canopy");	
			System.out.print("\nWe have the 3 type of paticipant type all of them have different charges per day");	
			System.out.println("| Participant Type | Participant Code | Charges / Day |");
            System.out.println("| ---------------- | ---------------- | ------------- |");
            System.out.println("| Students         | T                | RM90          |");
            System.out.println("| Staff            | S                | RM150         |");
            System.out.println("| Outsider         | O                | RM200         |");

			System.out.print("What is your participant Code: ");
			c = scan.next().toUpperCase().charAt(0);
			while (c != 'T' && c != 'S' && c != 'O') {
				System.out.println("You enter the wrong code please try again");
				System.out.print("What is your participant Code: ");
				c = scan.next().toUpperCase().charAt(0);
			}

			System.out.print("How many canopy you want:  ");
			canopies = scan.nextInt();

			System.out.print("How many days you rent:  ");
			days = scan.nextInt();
			
			System.out.print("Are you sell a wet item :  ");
			wc = scan.next().toUpperCase().charAt(0);
			
			double  charge = canopyCharges ( c,canopies, days, charges);
			double	wet = additionaiCharges(wc);
			
			double total = charge + wet;
			
			
			System.out.println("\n--- RENTAL RECEIPT ---\n");
			System.out.println("Participant Type: "+ c);
			System.out.println("Canopy Charge: RM "+ charge);
			System.out.println("Additional Charge: RM "+ wet);
			System.out.println("Total Charge: RM "+ total);
			
			System.out.printf("\nDo you want to calculate another bill?(Y/N)");
			choice = scan.next().toUpperCase().charAt(0);
		}
		while (choice == 'Y');
		scan.close();
	}
}
