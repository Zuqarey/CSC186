import java.util.*;

public class CustomerApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Step 1: size of array
        System.out.print("Enter size of Array: ");
        int size = scan.nextInt();   
        scan.nextLine();

        Customer[] cus = new Customer[size];

        // Input
        for (int i = 0; i < size; i++) {
            System.out.println("\nCustomer " + (i + 1));

            System.out.print("Enter Name: ");
            String name = scan.nextLine();

            System.out.print("Enter IC number: ");
            int ic = scan.nextInt();
            scan.nextLine();

            System.out.print("Enter address: ");
            String add = scan.nextLine();

            System.out.print("Enter room type: ");
            String room = scan.nextLine();

            System.out.print("Enter booking number: ");
            int book = scan.nextInt();    

            System.out.print("Enter day you are staying: ");
            int day = scan.nextInt();
            scan.nextLine();

            // Ask member or non-member
            System.out.print("Are you a member? (1 = Member, 2 = NonMember): ");
            int choice = scan.nextInt();
            scan.nextLine();

            if (choice == 1) {
                // Member
                System.out.print("Enter member number: ");
                int memNo = scan.nextInt();
                scan.nextLine();

                System.out.print("Enter expiry date: ");
                String exp = scan.nextLine();

                cus[i] = new Member(name, ic, add, room, book, day, memNo, exp);

            } else {
                // NonMember
                System.out.print("Spa service (true/false): ");
                boolean spa = scan.nextBoolean();

                System.out.print("Number of treatments: ");
                int treatment = scan.nextInt();

                System.out.print("Breakfast (true/false): ");
                boolean breakfast = scan.nextBoolean();
                scan.nextLine();

                cus[i] = new NonMember(name, ic, add, room, book, day,
                                       spa, treatment, breakfast);
            }
        }

        
        double grandTotal = 0.0;
        double highest = 0.0;
        Customer highestCus = null;
        int countNonMem = 0;

        for (int i = 0; i < size; i++) {
            double payment = 0.0;

            if (cus[i] instanceof Member) {
                payment = ((Member) cus[i]).claculatePayment();
            } else if (cus[i] instanceof NonMember) {
                payment = ((NonMember) cus[i]).claculatePayment();

                NonMember nm = (NonMember) cus[i];
                if (nm.getSpa() && nm.getBreakfast()) {
                    countNonMem++;
                }
            }

            System.out.println(cus[i]);
            System.out.println("Nett Payment: RM " + payment);
            System.out.println();

            grandTotal += payment;

            if (payment > highest) {
                highest = payment;
                highestCus = cus[i];
            }
        }

        System.out.println("Grand Total Payment: RM " + grandTotal);
        System.out.println("\nCustomer with Highest Payment:");
        System.out.println(highestCus);
        System.out.println("Highest Payment: RM " + highest);

        System.out.println("Total Non-Members with Spa & Breakfast: " + countNonMem);
    }
}
