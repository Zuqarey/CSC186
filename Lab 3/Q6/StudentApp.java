import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {

        Scanner z = new Scanner(System.in);
        System.out.println("Enter Array number: ");
        int a = z.nextInt();
        z.nextLine();

        Student[] q = new Student[a];

        for (int i = 0; i < q.length; i++) {

            System.out.println("Enter name: ");
            String name = z.nextLine();
            System.out.println("Enter matrix number: ");
            int noMatrix = z.nextInt();
            z.nextLine();
            System.out.println("Enter part: ");
            int part = z.nextInt();
            z.nextLine();
            System.out.println("Enter course: ");
            String course = z.nextLine();

            Subject[] subject = new Subject[6];

            for (int j = 0; j < 6; j++) {
                System.out.println("Please Enter Code subject: ");
                String codeSubject = z.nextLine();
                System.out.println("Please Enter your subject name: ");
                String subjectName = z.nextLine();
                System.out.println("Please Enter Your credit hour: ");
                int creditHour = z.nextInt();
                z.nextLine();
                System.out.println("Please Enter grade: ");
                String grade = z.nextLine();

                
                subject[j] = new Subject(codeSubject, subjectName, creditHour, grade);
            }

            q[i] = new Student(name, noMatrix, part, course, subject);

            
            System.out.println("**************************************************************");
            System.out.printf("Student Name     : %s\n", name);
            System.out.printf("No. Matrix       : %d\n", noMatrix);
            System.out.printf("Part             : %d\n", part);
            System.out.printf("Course           : %s\n\n", course);

            System.out.printf("%-10s %-15s %-8s %-12s %-12s\n",
                    "Code", "Subject", "Grade", "Credit Hr", "Quality Pt");

            double totalQuality = 0;
            int totalCH = 0;

            for (Subject s : subject) {
                double gp = 0;

                switch (s.getGrade().toUpperCase()) {
                    case "A+": case "A": gp = 4.00; break;
                    case "A-": gp = 3.67; break;
                    case "B+": gp = 3.33; break;
                    case "B": gp = 3.00; break;
                    case "B-": gp = 2.67; break;
                    case "C+": gp = 2.33; break;
                    case "C": gp = 2.00; break;
                    case "C-": gp = 1.67; break;
                    case "D+": gp = 1.33; break;
                    case "D": gp = 1.00; break;
                    default: gp = 0.00;
                }

                double qt = gp * s.getCreditHour();
                totalQuality += qt;
                totalCH += s.getCreditHour();

                System.out.printf("%-10s %-15s %-8s %-12d %-12.2f\n",
                        s.getCodeSubject(),
                        s.getSubjectName(),
                        s.getGrade(),
                        s.getCreditHour(),
                        qt);
            }

            System.out.println();
            System.out.printf("Total Credit Hours: %d\n", totalCH);
            System.out.printf("GPA = %.2f\n", q[i].calcGPA());
            System.out.println("**************************************************************");

        } 


	int counter = 0;
		for(int i=0; i<q.length; i++){
			if(q[i].calcGPA() >= 3.00){
				counter++;
			}
		}
		
		int count = 0;
		for(int i=0; i<q.length; i++){
			if(q[i].calcGPA() >= 3.67){
				count++;
				
				System.out.println("Status: Dean list");
			}
		}
		
		double h = -999999.99;
		for (int i = 0; i < q.length; i++) {
				if (q[i].calcGPA() > h) {
					h = q[i].calcGPA();}
	
	}
    }
}
