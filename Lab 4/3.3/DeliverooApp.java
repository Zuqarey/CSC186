import java.io.*;
import java.util.*;

public class DeliverooApp {
    public static void main(String[] args) {

        // Exception handling
        try {
            // Open input and output files
            BufferedReader in = new BufferedReader(new FileReader("Deliveroo.txt"));
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("earning.txt")));

            out.println("Profit earned for each delivery");
            out.printf("%-15s %-10s%n", "Date(Day)", "Profit");

            String inData;
            while ((inData = in.readLine()) != null) {

                String[] token = inData.split(",");

                double price = Double.parseDouble(token[5]);
                double multiplier = Double.parseDouble(token[7]);

                double profit = (price * multiplier) - price;

                out.printf("%s (%s) RM %.2f%n",token[0],token[1].substring(0, 3),profit);
            }

            // Close files
            in.close();
            out.close();
        }
        catch (Exception e) {
            System.out.println("Problem: " + e.getMessage());
        }
    }
}
