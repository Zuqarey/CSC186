import java.util.Scanner;


public class LandApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size of Array: ");
        int size = scan.nextInt();

        Land[] lands = new Land[size];

        for (int i = 0; i < size; i++) {
            lands[i] = new Land();
        }

        for (int i = 0; i < size; i++) {
            System.out.println("\n--- Land Record " + (i+1) + " ---");

            System.out.print("Enter Land ID: ");
            String lid = scan.nextLine();

            System.out.print("Enter Owner Name: ");
            String owner = scan.nextLine();

            System.out.print("Enter House Type (T/S/B/C): ");
            char htype = scan.nextLine().charAt(0);

            System.out.print("Enter Area (m�): ");
            double area = scan.nextDouble();

            lands[i] = new Land(lid, owner, htype, area);
        }

        System.out.println("\n========== CONDOMINIUM HOUSE TYPES ==========");
        int condoCount = 0;

        for (int i = 0; i < size; i++) {
            if (lands[i].getHouseType() == 'C') {
                condoCount++;
                System.out.println("\nRecord " + condoCount + ":");
                System.out.println(lands[i]);
                System.out.printf("Tax: RM %.2f\n", lands[i].calculateTax());
            }
        }

        if (condoCount == 0) {
            System.out.println("No Condominium records found.");
        }

        System.out.println("\n========== TOTAL PRICE BY HOUSE TYPE ==========");
        double tTotal = 0, sTotal = 0, bTotal = 0, cTotal = 0;
        int tCount = 0, sCount = 0, bCount = 0, cCount = 0;

        for (int i = 0; i < size; i++) {
            double tax = lands[i].calculateTax();
            char type = lands[i].getHouseType();

            if (type == 'T') {
                tTotal = tTotal + tax;
                tCount++;
            } else if (type == 'S') {
                sTotal = sTotal + tax;
                sCount++;
            } else if (type == 'B') {
                bTotal = bTotal + tax;
                bCount++;
            } else if (type == 'C') {
                cTotal = cTotal + tax;
                cCount++;
            }
        }

        System.out.printf("Terrace (T): RM %.2f from %d lands\n", tTotal, tCount);
        System.out.printf("Semi-Detached (S): RM %.2f from %d lands\n", sTotal, sCount);
        System.out.printf("Bungalow (B): RM %.2f from %d lands\n", bTotal, bCount);
        System.out.printf("Condominium (C): RM %.2f from %d lands\n", cTotal, cCount);

        System.out.println("\n========== AVERAGE TAX FOR SEMI-DETACHED ==========");
        if (sCount > 0) {
            double sAverage = sTotal / sCount;
            System.out.printf("Average tax for Semi-Detached: RM %.2f\n", sAverage);
        } else {
            System.out.println("No Semi-Detached records found.");
        }

        System.out.println("\n========== HIGHEST TAX FOR BUNGALOW ==========");
        double highestBTax = 0;
        int highestBIndex = -1;

        for (int i = 0; i < size; i++) {
            if (lands[i].getHouseType() == 'B') {
                double tax = lands[i].calculateTax();
                if (tax > highestBTax) {
                    highestBTax = tax;
                    highestBIndex = i;
                }
            }
        }

        if (highestBIndex != -1) {
            System.out.println("Highest tax for Bungalow:");
            System.out.println(lands[highestBIndex]);
            System.out.printf("Tax: RM %.2f\n", highestBTax);
        } else {
            System.out.println("No Bungalow records found.");
        }

        System.out.println("\n========== ALL LAND RECORDS ==========");
        for (int i = 0; i < size; i++) {
            System.out.println("\nRecord " + (i+1) + ":");
            System.out.println(lands[i]);
            System.out.printf("Tax: RM %.2f\n", lands[i].calculateTax());
        }
    }
}