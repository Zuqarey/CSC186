import java.util.*;

public class StudentApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // (i) Declare array of objects
        System.out.print("Enter number of student: ");
        int amount = scan.nextInt();
        scan.nextLine();

        Student[] stud = new Student[amount];

        for (int i = 0; i < amount; i++) {
            System.out.println("Enter education level(1 = primary, 2 = secondary): ");
            int choice = scan.nextInt();
            scan.nextLine();
            
            System.out.print("Enter ID: ");
            String id = scan.nextLine();

            System.out.print("Enter Name: ");
            String name = scan.nextLine();

            System.out.print("Enter age: ");
            int age = scan.nextInt();
            scan.nextLine();

            System.out.print("Enter school name: ");
            String nameOfSchool = scan.nextLine();
            
            System.out.print("Do you have Extra languages (Y/N): ");
            String strInput = scan.nextLine();
            
            boolean extraLanguage = false;
            if (strInput.equalsIgnoreCase("Y"))
            	extraLanguage = true;
            	
            System.out.print("Do you have Computer Course (Y/N): ");
            strInput = scan.nextLine();
            
            boolean computerCourse = false;
            if (strInput.equalsIgnoreCase("Y"))
            	computerCourse = true;
            	
            if(choice == 1){
            	System.out.print("Enter total subject : ");
            	int subject = scan.nextInt();
            	scan.nextLine();
            	stud[i] = new Primary(id, name, age, nameOfSchool, extraLanguage, computerCourse, subject);
            }
            else {
            	System.out.print("Enter level (PMR = 1/SPM = 2/STPM = 3): ");
            	int level = scan.nextInt();
            	scan.nextLine();

            	stud[i] = new Secondary(id, name, age, nameOfSchool, extraLanguage, computerCourse, level);
            }
        }
        
        double totalPricePrimary = 0.00;
        double totalPriceSecondary = 0.00;
        for (int i = 0; i < amount; i++){
         	if (stud[i] instanceof Primary) {
         		Primary primary = (Primary) stud[i];
         		totalPricePrimary += primary.calculatePrimaryFees();
         	} else if (stud[i] instanceof Secondary) {
         		totalPriceSecondary += ((Secondary) stud[i]).calculateSecondaryFees();
         	}
         }
         System.out.println("Total Price for Primary: RM" + totalPricePrimary);
         System.out.println("Total Price for Secondary: RM" + totalPriceSecondary);
    
    	 int both = 0;
    	 for (int i = 0; i < amount; i++){
    	 	if (stud[i] instanceof Primary) {
    	 		if (stud[i].extraLanguage && stud[i].computerCourse){
    	 			both++;
    	 		}
    	 	}
    	 }
    	 System.out.println("Student who have registered both extra language and computer course: " + both);
    	 System.out.println("Name of student who has UPSR subject more than 5");
    	for (int i = 0; i < amount; i++){
    		if (stud[i] instanceof Primary){
    			Primary primary = (Primary)stud[i];
    			if (primary.getTotalSubject() > 5){
    				System.out.println("Name : "+ primary.getstudentName());
    				System.out.println("ID : "+ primary.getstudentID());
    			}
    			
    		}
    	}
    
    }
}
