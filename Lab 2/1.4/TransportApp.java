import java.util.*;
import java.text.*;
public class TransportApp{
	public static void main(String[] args){
	
		Scanner scan = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat ("##,###.00");
		
		//STEP 1: create / instantite an object Call
		Transport transport = new Transport();
		
		//STEP 2: Input
		System.out.print("Enter Registration Number: ");
		String rnum = scan.nextLine();
		System.out.print("Enter Brand: ");
		String brnd = scan.nextLine();
		System.out.print("Enter Price: RM");
		double pric = scan.nextDouble();
		
		//STEP 3: Store onto object
		//1- Using Normal COnstructor
		// simpan data ke dalam class mengunakan variable yang baru
		transport = new Transport(rnum,brnd,pric);
		
		//OR
		
		
		//2- Using Setter / Mutator
		transport.setRegNumber(rnum);
		transport.setBrand(brnd);
		transport.setPrice(pric);
		
		//STEP 4: Manipulation


		System.out.println(transport.toString()+"\nRegistered in Selangor: "+transport.TransportSelangor()+ "\nPrice After Discount: RM "+df.format(transport.DiscountPrice(0.20)));

	}
}
