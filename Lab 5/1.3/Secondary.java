public class Secondary extends Student{
	private int level;
	
	public Secondary(){
		level = 0;
	}
	public Secondary(String studentID, String studentName, int age, String nameOfSchool, boolean extraLanguage, boolean computerCourse, int level){
		super(studentID, studentName, age, nameOfSchool, extraLanguage, computerCourse);
		this.level = level;
	}
	
	public void setLevel(int level){
		this.level = level;
	}
	
	public int getLevel(){
		return level;
	}
	
	public double calculateSecondaryFees(){
		double subjectFeeS = 0.0;
		
		
		if(level == 1){
			subjectFeeS = 150.00;
		}else if(level == 2){
			subjectFeeS = 200.00;
		}else if(level == 3){
			subjectFeeS = 250.00;
		}else{
			System.out.print("You have enter wrong type");
		}
		
		if(extraLanguage == true){
			subjectFeeS += 100.00;
		}
			
		if(computerCourse == true){
			subjectFeeS += 150.00;
		}
		return subjectFeeS;
		
	}
	
	public String toString(){
		return super.toString()+ "\nLevel: "+level;
	}
}