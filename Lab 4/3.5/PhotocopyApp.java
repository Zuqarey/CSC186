import java.io.*;
import java.util.*;

public class PhotocopyApp {
    public static void main(String[] args) {
        Photocopy[] copiesArr = new Photocopy[200]; // Max 200 records 
        int actualSize = 0;

        try {
            // (a) Read data from photocopyInfo.txt 
            Scanner fileIn = new Scanner(new File("photocopyInfo.txt"));
            while (fileIn.hasNextLine() && actualSize < 200) {
                String[] data = fileIn.nextLine().split(",");
                copiesArr[actualSize] = new Photocopy();
                copiesArr[actualSize].setPhotocopy(
                    data[0].trim(), data[1].trim(), data[2].trim(), 
                    data[3].trim(), Integer.parseInt(data[4].trim()), 
                    Integer.parseInt(data[5].trim())
                );
                actualSize++;
            }
            fileIn.close();

            // (b) Display FHTM info to console
            System.out.println("Photocopy requests for FHTM:");
            for (int i = 0; i < actualSize; i++) {
                if (copiesArr[i].getFacCode().equalsIgnoreCase("FHTM")) {
                    System.out.println(copiesArr[i].toString());
                }
            }

            // (c) Write quiz requests to quizRequest.txt
            PrintWriter quizOut = new PrintWriter(new FileWriter("quizRequest.txt"));
            quizOut.println("Detail of request for Quiz");
            int quizCount = 1;
            for (int i = 0; i < actualSize; i++) {
                if (copiesArr[i].getAssType().equalsIgnoreCase("quiz")) {
                    int totalCopies = copiesArr[i].getMasterNum() * copiesArr[i].getCopiesNum();
                    quizOut.println("Data" + quizCount + ":");
                    quizOut.println("Staff ID:" + copiesArr[i].getStaffID() + 
                                   " Number of pages for master copy:" + copiesArr[i].getMasterNum() + 
                                   " Number of copies required:" + copiesArr[i].getCopiesNum() + 
                                   " Total:" + totalCopies);
                    quizCount++;
                }
            }
            quizOut.close();

            // (d) Calculate paper reams (2-sided, 500 sheets per ream)
            double totalSheets = 0;
            for (int i = 0; i < actualSize; i++) {
                double sheetsPerSet = Math.ceil(copiesArr[i].getMasterNum() / 2.0);
                totalSheets += sheetsPerSet * copiesArr[i].getCopiesNum();
            }
            double totalReams = Math.ceil(totalSheets / 500.0);
            System.out.println("\nTotal sheets needed: " + (int)totalSheets);
            System.out.println("Total reams needed: " + (int)totalReams);

        } catch (Exception e) {
            System.err.println("Error processing data: " + e.getMessage());
        }
    }
}