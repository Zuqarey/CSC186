import java.io.*;
import java.util.*;

public class VehicleApp{
	public static void main(String[] args){
		//Create an array of object for Vehicle named arrCar.
		Vehicle[] arrCar = new Vehicle[6];
		
		try{
			//Read all records from the file named car.txt and store each object onto array of object named arrCar
			BufferedReader inputFile = new BufferedReader(new FileReader("car.txt"));
			int i = 0;
			String inData = null;
			while((inData = inputFile.readLine()) != null){
				String[] token = inData.split(";");
				arrCar[i] = new Vehicle(token[0], token[1], Double.parseDouble(token[2]));
				i++;
			}
			PrintWriter outputFileS = new PrintWriter(new BufferedWriter(new FileWriter("Selangor.txt")));
			PrintWriter outputFileT = new PrintWriter(new BufferedWriter(new FileWriter("Terengganu.txt")));
			
			outputFileS.printf("%-10s %-15s %-11s\n", "Type", "Plat Number", "Price");
			outputFileS.printf("%-10s %-15s %-11s\n", "----", "-----------", "-----");
			outputFileT.printf("%-10s %-15s %-11s\n", "Type", "Plat Number", "Price");
			outputFileT.printf("%-10s %-15s %-11s\n", "----", "-----------", "-----");
			
			double totalS = 0; 
			double totalT = 0;
			for (i = 0; i < arrCar.length; i++) {
				if (arrCar[i].getcarplatNum().substring(0, 1).equalsIgnoreCase("b")){
					// Write the information for all cars that are manufactured in Selangor
					outputFileS.println(arrCar[i].toString());
					totalS += arrCar[i].getprice();
				}
				if (arrCar[i].getcarplatNum().substring(0, 1).equalsIgnoreCase("t")){
					outputFileT.println(arrCar[i].toString());
					totalT += arrCar[i].getprice();
				}

			}
						
			outputFileS.println("Total price in Selaangor = "+totalS);
			outputFileT.println("Total price in Terengganu = "+totalT);
				
			inputFile.close();
			outputFileS.close();
			outputFileT.close();
			
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
}