import java.util.*;

public class ClothApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        
        System.out.print("Enter number of customers: ");
        int n = scan.nextInt();
        scan.nextLine();

        Cloth[] arr = new Cloth[n];

        
        for (int i = 0; i < n; i++) {
            System.out.println("\nCustomer " + (i+1));

            System.out.print("Enter customer name: ");
            String name = scan.nextLine();

            System.out.print("Enter price per meter: ");
            double price = scan.nextDouble();

            System.out.print("Enter length bought (meters): ");
            double length = scan.nextDouble();
            scan.nextLine(); 
            arr[i] = new Cloth(name, price, length);
        }

        
        System.out.println("\n--- CUSTOMER INFORMATION ---");
        for (int i = 0; i < n; i++) {
            System.out.println("\nCustomer " + (i+1));
            System.out.println(arr[i].toString());
        }

        
        double totalPayment = 0;
        for (Cloth c : arr) {
            totalPayment += c.calcpayment();
        }
        System.out.println("\nTotal payment collected from all customers: RM " + totalPayment);

        
        int countMore10 = 0;
        for (Cloth c : arr) {
            if (c.getlength() > 10) {
                countMore10++;
            }
        }
        System.out.println("Number of customers who bought more than 10 meters: " + countMore10);

        
        double highestPayment = arr[0].calcpayment();
        int indexHighest = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i].calcpayment() > highestPayment) {
                highestPayment = arr[i].calcpayment();
                indexHighest = i;
            }
        }

        System.out.println("\n--- CUSTOMER WITH HIGHEST PAYMENT ---");
        System.out.println(arr[indexHighest].toString());
    }
}
