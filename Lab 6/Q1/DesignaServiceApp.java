package Q1;

import java.util.Scanner;

public class DesignaServiceApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask for number of orders
        System.out.print("Enter the number of design orders: ");
        int numOrders = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        DesignService[] services = new DesignService[numOrders];
        
        // Loop to get details for each order
        for (int i = 0; i < numOrders; i++) {
            System.out.println("\n--- Order " + (i + 1) + " ---");
            
            // Get customer details
            System.out.print("Enter Customer Name: ");
            String custName = scanner.nextLine();
            
            System.out.print("Enter Deposit Amount: ");
            String deposit = scanner.nextLine();
            
            System.out.print("Is this an Urgent Order? (yes/no): ");
            String urgentOrder = scanner.nextLine();
            
            // Ask for service type
            System.out.print("\nSelect Service Type:\n1 - Digital Design\n2 - Physical Design\nEnter choice (1 or 2): ");
            int serviceType = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            if (serviceType == 1) {
                // Digital Design
                System.out.print("\nDigital Design Type:\n1 - Web Design\n2 - Advertisement Design\nEnter choice (1 or 2): ");
                int digitalType = scanner.nextInt();
                scanner.nextLine();
                services[i] = new DigitalDesign(custName, deposit, urgentOrder, digitalType);
            } 
            else if (serviceType == 2) {
                // Physical Design
                System.out.print("\nPhysical Design Type:\n1 - Logo Design\n2 - Packaging Design\n3 - Brochure Design\n4 - Banner Design\nEnter choice (1-4): ");
                int physicalType = scanner.nextInt();
                scanner.nextLine();
                
                System.out.print("Do you need Printing? (yes/no): ");
                boolean printing = scanner.nextLine().toLowerCase().startsWith("y");
                
                int numCopy = 0;
                if (printing) {
                    System.out.print("Enter Number of Copies: ");
                    numCopy = scanner.nextInt();
                    scanner.nextLine();
                }
                
                services[i] = new PhysicalDesign(custName, deposit, urgentOrder, physicalType, printing, numCopy);
            }
        }
        
        // Display all physical design orders with details and payment
        System.out.println("\n===== PHYSICAL DESIGN ORDERS SUMMARY =====");
        for (int i = 0; i < services.length; i++) {
            if (services[i] != null && services[i] instanceof PhysicalDesign) {
                System.out.println("\n--- Order " + (i + 1) + " ---");
                System.out.println(services[i]);
            }
        }
        
       System.out.println("\n===== URGENT WEBSITE DESIGN ORDERS =====");
int urgentWebDesignCount = 0;

for (int i = 0; i < services.length; i++) {
    if (services[i] != null && services[i] instanceof DigitalDesign) {

        DigitalDesign digitalDesign = (DigitalDesign) services[i];

        if (digitalDesign.getDigitalType() == 1 &&
            digitalDesign.getUrgentOrder().trim().equalsIgnoreCase("y")) {

            urgentWebDesignCount++;
            System.out.println("\n--- Order " + (urgentWebDesignCount) + " ---");
            System.out.println(digitalDesign);
        }
    }
}

        System.out.println("\nTotal Number of Urgent Website Design Orders: " + urgentWebDesignCount);
        
        scanner.close();
    }
}
