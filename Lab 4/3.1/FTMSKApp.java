		/*
		 * printf()
		 * %s = output string
		 * %c = output char
		 * %d = output digit (int)
		 * %f = output float & double
		 * %2f = output float & double WITH CHARACTER SIZE OF 2
		 * %.2f = output float & double WITH 2 DECIMAL POINT
		 * \n = new line
		 * \t = tab
		 */


import java.io.*;
import java.util.*;
public class FTMSKApp{
	public static void main(String[] args){
	//STEP 1: Exception Handling (Block Try)
		try {
			//STEP 2: Open All Files
			BufferedReader inputFile = new BufferedReader(new FileReader("FTMSK.txt"));
			
			PrintWriter[] outputFile = new PrintWriter[2];
			final int CS110 = 0;
			final int CS111 = 1;
			outputFile[CS110] = new PrintWriter(new BufferedWriter(new FileWriter("CS110.txt")));
			outputFile[CS111] = new PrintWriter(new BufferedWriter(new FileWriter("CS111.txt")));
		
			outputFile[0].println("        Male Students from CS110");
			outputFile[1].println("        Male Students from CS111");
			
			outputFile[0].printf("%-13s  %-25s  %-4s\n", "Matric Number", "Name", "Part");
			outputFile[1].printf("%-13s  %-25s  %-4s\n", "Matric Number", "Name", "Part");
			
			//STEP 3: Read data from input file
			int totalCs110 = 0;
			int totalCs111 = 0; 
			
			String inData = null;
			while((inData = inputFile.readLine()) != null){
				//STEP 4: Tokenize the record into fiels/attributes/tokens
				String[] token = inData.split(";");
				
				if (token[2].equalsIgnoreCase("CS110") && token[4].equalsIgnoreCase("M")){
					outputFile[CS110].printf("%-13s  %-25s  %-4s\n", token[0], token[1], token[3]);
					totalCs110++;
				}
				if (token[2].equalsIgnoreCase("CS111") && token[4].equalsIgnoreCase("M")){
					outputFile[CS111].printf("%-13s  %-25s  %-4s\n", token[0], token[1], token[3]);
					totalCs111++;
				}
			}//end while
			inputFile.close();
			
			outputFile[CS110].println("Number of male student for CS110 : "+ totalCs110);
			outputFile[CS111].println("Number of male student for CS111 : "+ totalCs111);
			
			outputFile[CS110].close();
			outputFile[CS111].close();
		}//end try
		catch (Exception e){
			System.out.println(e.getMessage());
		}
	}//end main
}//end class