import java.io.*;
import java.util.*;

public class SupermarketApp {
    public static void main(String[] args) {
        Supermarket[] arrStore = new Supermarket[100]; // Array of objects 
        int count = 0;
        double totalSale = 0.0;

        // Use exception handling for file errors
        try {
            Scanner fileScanner = new Scanner(new File("20180221.txt"));
            PrintWriter writer = new PrintWriter(new FileWriter("reportSale.txt"));

            // Header for the output file [cite: 540-550]
            writer.printf("%-20s %-10s %-10s %-15s\n", "Item", "Quantity", "Price(RM)", "Sub Total (RM)");
            writer.println("------------------------------------------------------------");

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] data = line.split(","); // Assuming comma delimiter 
                
                String name = data[0].trim();
                int qty = Integer.parseInt(data[1].trim());
                double price = Double.parseDouble(data[2].trim());

                arrStore[count] = new Supermarket(name, qty, price);
                double subtotal = arrStore[count].calculateSubtotal();
                totalSale += subtotal;

                // Write record to file
                writer.printf("%-20s %-10d %-10.2f %-15.2f\n", name, qty, price, subtotal);
                count++;
            }

            writer.println("------------------------------------------------------------");
            writer.printf("TOTAL SALE for date: 21st, February 2018 is: RM %.2f\n", totalSale);

            fileScanner.close();
            writer.close();
            System.out.println("Report generated successfully in reportSale.txt");

        } catch (FileNotFoundException e) {
            System.err.println("Error: Input file not found.");
        } catch (IOException e) {
            System.err.println("Error: Could not write to output file.");
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}