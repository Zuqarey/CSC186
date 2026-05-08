package Q3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask user for number of tickets
        System.out.print("Enter the number of tickets: ");
        int numTickets = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        Ticket[] tick = new Ticket[numTickets];
        
        // Loop to get details for each ticket
        for (int i = 0; i < numTickets; i++) {
            System.out.println("\n--- Ticket " + (i + 1) + " ---");
            
            // Get common ticket details
            System.out.print("Enter Ticket ID: ");
            String ticketID = scanner.nextLine();
            
            System.out.print("Enter Customer Name: ");
            String customerName = scanner.nextLine();
            
            System.out.print("Is Early Bird? (yes/no): ");
            boolean earlyBird = scanner.nextLine().toLowerCase().startsWith("y");
            
            // Ask ticket type
            System.out.print("Ticket Type - (1) General Admission or (2) VIP: ");
            int ticketType = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            if (ticketType == 1) {
                // General Admission Ticket
                System.out.print("Enter Seating Area (1-10): ");
                int seatingArea = scanner.nextInt();
                scanner.nextLine();
                tick[i] = new GeneralAdmissionTicket(ticketID, customerName, earlyBird, seatingArea);
            } else if (ticketType == 2) {
                // VIP Ticket
                System.out.print("Enter Package Type (Gold/Silver/Bronze/Platinum): ");
                String packageType = scanner.nextLine();
                tick[i] = new VIPTicket(ticketID, customerName, earlyBird, packageType);
            }
        }
        
        // Display all tickets
        System.out.println("\n===== TICKET SUMMARY =====");
        double totalPrice = 0;
        int platinumCount = 0;
        for (int i = 0; i < tick.length; i++) {
            if (tick[i] != null) {
                System.out.println("\n--- Ticket " + (i + 1) + " ---");
                System.out.println(tick[i]);
                totalPrice += tick[i].calcTicket();
                
                // Count platinum packages
                if (tick[i] instanceof VIPTicket) {
                    VIPTicket vipTicket = (VIPTicket) tick[i];
                    if (vipTicket.getPackageType().equalsIgnoreCase("Platinum")) {
                        platinumCount++;
                    }
                }
            }
        }
        
        // Display total price and platinum count
        System.out.println("\n===== TOTAL SUMMARY =====");
        System.out.println("Total Price of All Tickets: RM " + String.format("%.2f", totalPrice));
        System.out.println("Number of Platinum Package Tickets: " + platinumCount);
        
        scanner.close();
    }
}
