public class Primary extends Student{
	private int totalSubject;
	
	public Primary(){
		totalSubject = 0;
	}
	
	public Primary(String studentID, String studentName, int age, String nameOfSchool, boolean extraLanguage, boolean computerCourse, int totalSubject){
		super(studentID, studentName, age, nameOfSchool, extraLanguage, computerCourse);
		this.totalSubject = totalSubject;
	}
	
	public void setTotalSubject(){
		this.totalSubject = totalSubject;
	}
	
	public int getTotalSubject(){
		return totalSubject;
	}
	
	public double calculatePrimaryFees(){
		double subjectFeeP = 50.00 * totalSubject;
		
		if(extraLanguage == true){
			subjectFeeP += 100.00;
		}
			
		if(computerCourse == true){
			subjectFeeP += 150.00;
		}
		return subjectFeeP;
	}
	
	public String toString(){
		return super.toString()+"\nTotal subject: "+totalSubject;
	}
}