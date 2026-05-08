package Q6;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Event[] eventArr = new Event[3];

       
        for (int i = 0; i < eventArr.length; i++) {

            System.out.println("\nEvent " + (i + 1));
            System.out.print("Enter Event Type (W = Wedding, C = Conference): ");
            char choice = sc.next().charAt(0);

            System.out.print("Enter Event Name: ");
            sc.nextLine(); // clear buffer
            String name = sc.nextLine();

            System.out.print("Enter Event Date (ddmmyyyy): ");
            String date = sc.next();

            if (choice == 'W' || choice == 'w') {

                System.out.print("Enter Number of Guests: ");
                int guests = sc.nextInt();

                System.out.print("Enter Menu Package (A/B/C): ");
                char pkg = sc.next().charAt(0);

                System.out.print("Door Gift? (true/falsew): ");
                boolean doorgift = sc.nextBoolean();

                eventArr[i] = new Wedding(name, date, guests, pkg, doorgift);

            } else if (choice == 'C' || choice == 'c') {

                System.out.print("Enter Conference Type (A/S/W): ");
                char type = sc.next().charAt(0);

                eventArr[i] = new Conference(name, date, type);
            }
        }

       
        System.out.println("\nConference Held in May 2023");

        for (int i = 0; i < eventArr.length; i++) {
            if (eventArr[i] instanceof Conference) {

                String d = eventArr[i].getDate();
                String month = d.substring(2, 4);
                String year = d.substring(4, 8);

                if (month.equals("05") && year.equals("2023")) {
                    System.out.println(eventArr[i]);
                }
            }
        }

        
        int weddingCount = 0, conferenceCount = 0;
        double weddingTotal = 0.0, conferenceTotal = 0.0;

        for (int i = 0; i < eventArr.length; i++) {

            if (eventArr[i] instanceof Wedding) {
                weddingCount++;
                weddingTotal += eventArr[i].totalCost();
            } 
            else if (eventArr[i] instanceof Conference) {
                conferenceCount++;
                conferenceTotal += eventArr[i].totalCost();
            }
        }

        System.out.println("\nEvent Summary");
        System.out.println("Wedding Events: " + weddingCount);
        System.out.println("Total Wedding Payment: RM" + weddingTotal);

        System.out.println("\nConference Events: " + conferenceCount);
        System.out.println("Total Conference Payment: RM" + conferenceTotal);

        sc.close();
    }
}
