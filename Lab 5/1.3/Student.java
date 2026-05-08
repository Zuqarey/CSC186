public class Student{
	protected  String studentID;
	protected String studentName;
	protected int age;
	protected String nameOfSchool;
	protected boolean extraLanguage;
	protected boolean computerCourse;
	
	public Student(){
		studentID = "";
		studentName = "";
		age = 0;
		nameOfSchool = "";
		extraLanguage = false;
		computerCourse = false;
		
	}
	
	public Student(String studentID, String studentName, int age, String nameOfSchool, boolean extraLanguage, boolean computerCourse){
		this.studentID = studentID;
		this.studentName = studentName;
		this.age = age;
		this.extraLanguage = extraLanguage;
		this.computerCourse = computerCourse;
		
	}
	
	public void setstudentID(String studentID){
		this.studentID = studentID;
	}
	
	public void setstudentName(String studentName){
		this.studentName = studentName;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public void setNameOfSchool(String nameOfSchool){
		this.nameOfSchool = nameOfSchool;
	}
	
	public void setExtraLanguage(boolean extraLanguage){
		this.extraLanguage = extraLanguage;
	}
	
	public void setComputerCourse(boolean computerCourse){
		this.computerCourse = computerCourse;
	}
	
	
	public String getstudentName(){
		return studentName;
	}
	
	public String getstudentID(){
		return studentID;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getNameOfSchool(){
		return nameOfSchool;
	}
	
	public boolean getExtraLanguage(){
		return extraLanguage;
	}
	
	public boolean getComputerCourse(){
		return computerCourse;
	}
	
	public String toString(){
		return "\nstudentent Name: "+studentName+"\nstudentent ID: "+studentID+ "\nAge: "+"\nName of School: "+nameOfSchool+"\nDoyou have extra language: "+extraLanguage+"\nDo you have computer couse: "+computerCourse;
	} 
	
	
	
	
	
	
	
	
	
		
}