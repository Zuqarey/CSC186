import java.util.*;
public class ProgramApp{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
			
		//call
		
		Program program = new Program();
		
		System.out.println("1.\t:CS009\n2.\t:CS110\n3.\t:CS220\n4.\t:CS770\n5.\t:CS990");
		System.out.print("Please enter your Program code: ");
		String cd =scan.nextLine();
		
		System.out.print("Program Description: ");
		String d =scan.nextLine();
		
		System.out.print("Program Duration: ");
		int du =scan.nextInt();
		scan.nextLine();
		
		System.out.print("What is your Faculty: ");
		String fa =scan.nextLine();
		
		System.out.print("Who is your Program Head: ");
		String h =scan.nextLine();
		
		program = new Program(cd, d, du, fa, h);
			
		System.out.println("\n==Program Details==");
		System.out.println(program);
		
	}
}