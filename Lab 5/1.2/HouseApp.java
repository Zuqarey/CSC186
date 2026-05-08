import java.util.*;

public class HouseApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
		System.out.print("Enter number of tenants: ");
        int i = scan.nextInt();
        scan.nextLine();

        Terrace[] t = new Terrace[i];

        // INPUT LOOP
        for (int a = 0; a < i; a++) {
            System.out.println("\nTenant " + (a + 1));

            System.out.print("Tenant name: ");
            String tenant = scan.nextLine();

            System.out.print("IC Number: ");
            String ic = scan.nextLine();

            System.out.print("Address: ");
            String address = scan.nextLine();

            System.out.print("House type (single-storey / double-storey): ");
            String type = scan.nextLine();

            System.out.print("Corner lot? (true/false): ");
            boolean cornerLot = scan.nextBoolean();
            scan.nextLine();

            t[a] = new Terrace(tenant, ic, address, type, cornerLot);
        }

        // COUNT DOUBLE-STOREY CORNER LOT
        int c = 0;
        System.out.println("\nDouble Storey corner lot tenants:");

        for (int T = 0; T < t.length; T++) {
            if (t[T].getType().equalsIgnoreCase("double-storey") && t[T].isCornerLot()) {

                System.out.println(t[T]);
                c++;
            }
        }

        System.out.println("Total: " + c);

        // TOTAL RENT
        double totalRent = 0;
        for (int T = 0; T < t.length; T++) {
            totalRent += t[T].calculateRent();
        }
        System.out.println("\nTotal rent for the month: RM " + totalRent);

        // ALI BIN ABU
        for (int T = 0; T < t.length; T++) {
            if (t[T].getTenant().equalsIgnoreCase("Ali bin Abu")) {
                System.out.println("\nAli bin Abu rented a: " + t[T].getType());
            }
        }
    }
}
