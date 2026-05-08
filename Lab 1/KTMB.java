import java.util.Scanner;

public class KTMB {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("WELCOME TO KTMB ONLINE BOOKING");
		System.out.println("HERE YOU CAN BOOK A TICKET FROM BUTTERWORTH TO KUALA LUMPUR\n");

		char type;
		char choice;
		String addon;
		int meal = 0;
		
		do {
			System.out.print("PLEASE ENTER YOUR ID: ");
			String ID = input.nextLine();
			
			System.out.print("\nPLEASE ENTER YOUR TYPE OF PACKAGE (G FOR GOLD, P FOR PLATINUM): ");
			type = input.next().toUpperCase().charAt(0);

			while (type != 'G' && type != 'P') {
				System.out.println("==== YOU ENTERED THE WRONG CODE ====");
				System.out.print("PLEASE ENTER YOUR TYPE OF PACKAGE (G FOR GOLD, P FOR PLATINUM): ");
				type = input.next().toUpperCase().charAt(0);
			}

			System.out.println("\nThank you! You selected package: " + (type == 'G' ? "ETS Gold" : "ETS Platinum"));
		
			System.out.print("ENTER QUANTITY OF ADULT PASSANGER : ");
			int qunt1 = input.nextInt();

			while (Character.isAlphabetic(qunt1)) {
				System.out.println("==== YOU ENTERED THE WRONG CODE ====");
				System.out.print("ENTER QUANTITY OF ADULT PASSANGER : ");
				qunt1 = input.nextInt();
			}

			System.out.print("\nENTER QUANTITY OF CHILD PASSANGER : ");
			int qunt2 = input.nextInt();
			input.nextLine();
			
			while (Character.isAlphabetic(qunt2)) {
				System.out.println("==== YOU ENTERED THE WRONG CODE ====");
				System.out.print("ENTER QUANTITY OF CHILD PASSANGER : ");
				qunt2 = input.next().charAt(0);
			}

			double adult = 0, child = 0;
			String name = "";
		
			if (type == 'G' || type == 'g') {
				name = "ETS Gold";
				adult = 59;
				child = 34;
			} else {
				name = "ETS Platinum";
				adult = 79;
				child = 44;
			}
			
			System.out.println("WE HAVE AN ADD-ON MEAL");
			System.out.println("ONE ADD-ON MEAL RM 7");
			System.out.println("YOU WISH TO HAVE ADD-ON MEAL?(yes/no)");
			addon = input.next().toLowerCase();
			input.nextLine(); // Consume leftover \n
			
			if (addon.equalsIgnoreCase("yes")){
				System.out.println("HOW MANY MEAL DO YOU WANT?");
				meal = input.nextInt();
			}
					
			double totalmeal = meal * 7;
			double totaladult = adult * qunt1;
			double totalchild = child * qunt2;
			double total = totaladult + totalchild + totalmeal;
			double all = totaladult + totalchild;
			
			System.out.println("\nETS TICKET INFORMATION - Butterworth to Kuala Lumpur");
			System.out.println("\nPassenger ID : " + ID);

			System.out.println("\nNumber of Adults :" + qunt1);
			System.out.println("Number of Children :"+ qunt2);
			  
			System.out.println("\nTotal Ticket Price: RM"+ all);
			System.out.println("Meal Combo Price: RM"+ totalmeal);
			System.out.println("Net Ticket Price: RM"+ total);
			System.out.println("----------------------------");

			// Ask user if they want to process another passenger
			System.out.print("\nDo you want to calculate another ticket? (Y/N): ");
			choice = input.next().charAt(0);
			input.nextLine(); // consume newline

			System.out.println("\nThank you for using ETS Ticket System!");
        } while (choice != 'n' && choice != 'N');
    }
}
