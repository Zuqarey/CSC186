package Q4;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask for number of presenters
        System.out.print("Enter the number of presenters: ");
        int numPresenters = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        Presenter[] presenters = new Presenter[numPresenters];
        
        // Loop to get details for each presenter
        for (int i = 0; i < numPresenters; i++) {
            System.out.println("\n--- Presenter " + (i + 1) + " ---");
            
            // Get common presenter details
            System.out.print("Enter Presenter ID: ");
            int presenterID = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Enter Presenter Name: ");
            String presenterName = scanner.nextLine();
            
            System.out.print("Enter Presenter Affiliation: ");
            String presenterAffiliation = scanner.nextLine();
            
            // Ask presenter type
            System.out.print("Presenter Type - (1) Paper Presenter or (2) SDC Presenter: ");
            int presenterType = scanner.nextInt();
            scanner.nextLine();
            
            if (presenterType == 1) {
                // Paper Presenter
                System.out.print("Enter Sector (A for Academic, I for Industry): ");
                char sector = scanner.nextLine().toUpperCase().charAt(0);
                presenters[i] = new PaperPresenter(presenterID, presenterName, presenterAffiliation, sector);
            } else if (presenterType == 2) {
                // SDC Presenter
                System.out.print("Enter Level (1 for Undergraduate, 2 for Postgraduate): ");
                int level = scanner.nextInt();
                scanner.nextLine();
                presenters[i] = new SdcPresenter(presenterID, presenterName, presenterAffiliation, level);
            }
        }
        
        // Display all presenters with enrollment fees
        System.out.println("\n===== PRESENTER DETAILS =====");
        for (Presenter p : presenters) {
            System.out.println(p);
            System.out.println("Enrollment Fee: RM " + p.enrollFee());
            System.out.println("----------------------");
        }
        
        // Calculate total charge from Industry sector
        double totalIndustryCharge = 0.0;
        for (Presenter p : presenters) {
            if (p instanceof PaperPresenter) {
                PaperPresenter pp = (PaperPresenter) p;
                if (pp.getSector() == 'I') {
                    totalIndustryCharge += pp.enrollFee();
                }
            }
        }
        System.out.println("Total charge from Industry sector: RM " + totalIndustryCharge);
        
        // Count undergraduate SDC presenters
        int undergraduateCount = 0;
        for (Presenter p : presenters) {
            if (p instanceof SdcPresenter) {
                SdcPresenter sp = (SdcPresenter) p;
                if (sp.getLevel() == 1) {
                    undergraduateCount++;
                }
            }
        }
        System.out.println("Number of Undergraduate SDC Presenters: " + undergraduateCount);
        
        scanner.close();
    }
}
