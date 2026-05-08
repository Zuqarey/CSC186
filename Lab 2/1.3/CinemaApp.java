import java.util.*;
public class CinemaApp{
	public static void main(String[] args){
	
		Scanner scan = new Scanner(System.in);

        System.out.println("+----------------+------------+---------------+");
        System.out.println("| Mode of Payment| Membership | Discount Rate |");
        System.out.println("+----------------+------------+---------------+");
        System.out.println("| Credit Card    | true       | 5%            |");
        System.out.println("| Credit Card    | false      | 3%            |");
        System.out.println("| Cash           | true       | 10%           |");
        System.out.println("| Cash           | false      | 0%            |");
        System.out.println("+----------------+------------+---------------+");
   


		System.out.println("Enter Cinema code: ");
		String CODE = scan.nextLine();
		System.out.println("Enter Movie Title: ");
		String TITLE = scan.nextLine();
		System.out.println("Enter price: ");
		int PRICE = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter how you pay (credit card (cc)/ cash (c))");
		String PAY = scan.nextLine();
		System.out.println("Are you a member(true/false): ");
		boolean MEMBER = scan.nextBoolean();
		
		
		Cinema cinema = new Cinema(CODE, TITLE, PRICE, PAY, MEMBER);
		
		System.out.println("\n== CINEMA DETAILS ==");
        System.out.println(cinema);
		
		
		
	}
	
	
}

