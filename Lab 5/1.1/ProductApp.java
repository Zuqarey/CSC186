import java.util.*;

public class ProductApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // (i) Declare array of objects
        System.out.print("Enter number of books: ");
        int amount = scan.nextInt();
        scan.nextLine();

        Book[] books = new Book[amount];

        for (int i = 0; i < amount; i++) {
            System.out.println("\nBook " + (i + 1));

            System.out.print("Enter ID: ");
            String id = scan.nextLine();

            System.out.print("Enter title: ");
            String title = scan.nextLine();

            System.out.print("Enter author: ");
            String author = scan.nextLine();

            System.out.print("Enter number of pages: ");
            int pages = scan.nextInt();
            scan.nextLine();

            books[i] = new Book(id, title, author, pages);
        }

        // (ii) Display all book info including cost
        System.out.println("\n--- Book Details ---");
        for (int i = 0; i < amount; i++) {
            System.out.println(books[i]);
            System.out.println("Cost: RM " + books[i].calcPrice());
            System.out.println();
        }

        // (iii) Total cost
        double totalCost = 0.0;
        for (int i = 0; i < amount; i++) {
            totalCost += books[i].calcPrice();
        }
        System.out.println("Total Cost of Books: RM " + totalCost);

        // (iv) Highest and Lowest cost
        double highest = books[0].calcPrice();
        double lowest = books[0].calcPrice();

        for (int i = 1; i < amount; i++) {
            double price = books[i].calcPrice();
            if (price > highest)
                highest = price;
            if (price < lowest)
                lowest = price;
        }

        System.out.println("Highest Cost: RM " + highest);
        System.out.println("Lowest Cost: RM " + lowest);

        // (v) Count books with pages > 500
        int count = 0;
        for (int i = 0; i < amount; i++) {
            if (books[i].getnumPages() > 500)
                count++;
        }

        System.out.println("Number of books with more than 500 pages: " + count);
    }
}
