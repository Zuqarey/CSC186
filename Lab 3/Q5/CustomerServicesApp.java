import java.util.Scanner;
public class CustomerServicesApp{
	public static void main(String[] args) {
		
		/*i) Create an array to store FIFTY (50) CustomerServices object. Then, read all data and store it into the array of object. */
		CustomerServices[] cs = new CustomerServices[50];
		Scanner a = new Scanner(System.in);
		for(int i=0; i < cs.length; i++){
			cs[i] = new CustomerServices();
			
			System.out.println("Enter name: ");
			String custName = a.nextLine();
			System.out.println("Enter phone number: ");
			String phoneNo = a.nextLine();
			System.out.println("Enter address: ");
			String address = a.nextLine();
			System.out.println("Enter service type: ");
			String serviceType = a.nextLine();
			System.out.println("Enter name: ");
			double serviceArea = a.nextDouble();
			a.nextLine();
			System.out.println("Enter toilet area: ");
			double toiletArea = a.nextDouble();	
			
			System.out.println("Please Enter worker name: ");
			String wkrName = a.nextLine();
			System.out.println("Please Enter your worker ID: ");
			String wkrID = a.nextLine();
			System.out.println("Please Enter Your worker Contact: ");
			String wkrContact = a.nextLine();
			
			Worker wkr = new Worker(wkrName, wkrID, wkrContact);
			cs[i].setCustomerServices( custName, phoneNo, address, serviceType, serviceArea, toiletArea ,wkr);
		}
		
		
		/*ii) Calculate and display the total service charges collected from all customers for each type of service.*/
		double grasstotal = 0.00;
		double roomtotal = 0.00;
		double toilettotal = 0.00;
		 for (int i=0; i<cs.length; i++){
		 	if(cs[i].getServiceType().equalsIgnoreCase("Grass")){
		 		grasstotal += cs[i].calcServiceCharge();
		 	}
		 	else if(cs[i].getServiceType().equalsIgnoreCase("Room")){
		 		roomtotal += cs[i].calcServiceCharge();
		 	}
		 	else if(cs[i].getServiceType().equalsIgnoreCase("Tolet")){
		 		toilettotal += cs[i].calcServiceCharge();
		 	}
		 }
		 	
		/*iii) Display the IDs of workers who have done the grass-cutting job.*/
		 for(int i=0; i<cs.length; i++){
		 	if(cs[i].getServiceType().equalsIgnoreCase("Grass")){
		 		System.out.println("the IDs of workers who have done the grass-cutting job: "+ cs[i].getWorker().getWorkerId());
		 	}
		 }
		/*iv) Calculate and display the average service charges collected from customers. */
		double total = 0.00;
		 for (int i=0; i<cs.length; i++){
		 	total += cs[i].calcServiceCharge();
		 }
		
	}
}