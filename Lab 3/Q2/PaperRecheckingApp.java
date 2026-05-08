import java.util.*;

public class PaperRecheckingApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        PaperRechecking[] pRechecking = new PaperRechecking[100];

        System.out.print("Enter number of rechecking records to input (max 100): ");
        int n = scan.nextInt();
        scan.nextLine(); 

        
        for (int i = 0; i < n; i++) {
            System.out.println("\nRecord " + (i+1));

            System.out.print("Enter Student ID: ");
            String id = scan.nextLine();

            System.out.print("Enter Student Name: ");
            String name = scan.nextLine();

            System.out.print("Enter Subject Code: ");
            String code = scan.nextLine();

            System.out.print("Enter Previous Mark: ");
            int prev = scan.nextInt();

            System.out.print("Enter New Mark: ");
            int newMark = scan.nextInt();
            scan.nextLine(); 

            pRechecking[i] = new PaperRechecking(id, name, code, prev, newMark);
        }

        
        System.out.println("\n===== RECHECKING DETAILS FOR STUDENT: Ali bin Hassan =====");

        int totalCodes = 0;
        double totalCharges = 0;

        for (int i = 0; i < n; i++) {
            if (pRechecking[i].getstudName().equalsIgnoreCase("Ali bin Hassan")) {

                totalCodes++;
  
                totalCharges += 30;

                System.out.println("\nSubject: " + pRechecking[i].getsubjectCode());
                System.out.println("Previous Mark: " + pRechecking[i].getpreviousMark());
                System.out.println("New Mark: " + pRechecking[i].getnewMark());
                System.out.println("Changes: " + pRechecking[i].DisplayChanges());
            }
        }

        System.out.println("\nTotal subjects rechecked by Ali bin Hassan: " + totalCodes);
        System.out.println("Total charges (RM30 per subject): RM " + totalCharges);

        int sameMarkCount = 0;

        for (int i = 0; i < n; i++) {
            if (pRechecking[i].getpreviousMark() == pRechecking[i].getnewMark()) {
                sam
