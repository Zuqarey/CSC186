package Q5;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // (d)(i) User determines array size
        System.out.print("Enter number of services: ");
        int size = sc.nextInt();

        DecoService[] service = new DecoService[size];

        for (int i = 0; i < size; i++) {

            System.out.println("\nService " + (i + 1));
            System.out.print("Enter Service Type (H = Home, W = Wedding): ");
            char type = sc.next().charAt(0);

            System.out.print("Customer Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Contact Number: ");
            int contact = sc.nextInt();

            System.out.print("3D Plan (true/false): ");
            boolean plan3D = sc.nextBoolean();

            if (type == 'H' || type == 'h') {

                System.out.print("Home Area (1=Living, 2=Dining): ");
                int area = sc.nextInt();

                System.out.print("Area Size (m2): ");
                int sizeArea = sc.nextInt();

                service[i] = new HomeDeco(name, contact, plan3D, area, sizeArea);

            } else if (type == 'W' || type == 'w') {

                System.out.print("Wedding Theme (Floral/Beach): ");
                String theme = sc.next();

                System.out.print("Wedding Package (A/B): ");
                char pkg = sc.next().charAt(0);

                service[i] = new WeddingDeco(name, contact, plan3D, theme, pkg);
            }
        }

        // (d)(ii) Total cost for Floral Wedding theme
        double floralTotal = 0.0;

        for (int i = 0; i < service.length; i++) {
            if (service[i] instanceof WeddingDeco) {
                WeddingDeco w = (WeddingDeco) service[i];
                if (w.getWeddingTheme().equalsIgnoreCase("Floral")) {
                    floralTotal += w.calcDesignCost();
                }
            }
        }

        System.out.println("\nTotal Cost for Floral Wedding Theme: RM" + floralTotal);

        sc.close();
    }
}
