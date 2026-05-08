import java.util.Scanner;

public class HomeCareApp {public static void main (String[] args) {
												   
	// 1. Create an array named assist to store 30 HomeCare objects. Then, read and store all data into the array of objects.
	HomeCare[] assist = new HomeCare[1];
	Scanner a = new Scanner(System.in);
	
	for(int i = 0; i < assist.length; i++){
		
		
		System.out.println("Please Enter your Name: ");
		String name = a.nextLine();
		System.out.println("Please Enter your Phone number: ");
		String phone = a.nextLine();
		System.out.println("Please Enter Your Location: ");
		String loc = a.nextLine();
		System.out.println("Please Enter Your Service Type: ");
		char serviceType = a.next().charAt(0);
		a.nextLine();
		System.out.println("Please Enter Your Duration: ");
		int duration = a.nextInt();
		a.nextLine();
		
		System.out.println("Please Enter staff name: ");
		String staffName = a.nextLine();
		System.out.println("Please Enter your staff ID: ");
		String staffID = a.nextLine();
		System.out.println("Please Enter Your stff Contact: ");
		String stffContact = a.nextLine();
	
		Staff stf = new Staff(staffName, staffID, stffContact);
		assist[i] = new HomeCare(name, phone, loc, serviceType,  duration, stf);
	}
	
	
	
	// 2. Calculate and display total charges for customers who choose physiotherapy service\
	double total = 0.00;
	for(int i = 0; i < assist.length; i++){
		if(assist[i].getServiceType() == 'T'){
			total += assist[i].calcServiceCharge();
			
		}
	}

	System.out.println("Total charges for customer who choose physiotherapy: "+total);
}
}
		