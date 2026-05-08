public class PaperRechecking{
	private String studID;
	private String studName;
	private String subjectCode;
	private int previousMark;
	private int newMark;
	
	public PaperRechecking(){
		studID = "";
		studName = "";
		subjectCode = "";
		previousMark = 0;
		newMark = 0;
	}
	
	public PaperRechecking(String studID, String studName, String subjectCode, int previousMark, int newMark){
		this.studID = studID;
		this.studName = studName;
		this.subjectCode = subjectCode;
		this.previousMark = previousMark;
		this.newMark = newMark;
	}
	
	public PaperRechecking (PaperRechecking a){
		studID = a.studID;
		studName = a.studName;
		subjectCode = a.subjectCode;
		previousMark = a.previousMark;
		newMark = a.newMark;
	}
	
	public void setstudID (String studID){
		this.studID = studID;
	}
	public void setstudName (String studName){
		this.studName = studName;
	}
	public void setsubjectCode (String subjectCode){
		this.subjectCode = subjectCode;
	}
	public void setpreviousMark (int previousMark){
		this.previousMark = previousMark;
	}
	public void setnewMark (int newMark){
		this.newMark = newMark;
	}
	
	public String getstudID(){
		return studID;
	}
	public String getstudName(){
		return studName;
	}
	public String getsubjectCode(){
		return subjectCode;
	}
	public int getpreviousMark(){
		return  previousMark;
	}
	public int getnewMark(){
		return newMark;
	}
	
	public String DisplayChanges(){
		if(newMark < previousMark)
			return "The mark after recheck deducted"+(previousMark - newMark);
		if(newMark > previousMark)
			return "The mark after recheck added"+(newMark - previousMark);
		else
			return "No change of Mark";
	}
	
	public String toString(){
		return  "Student ID    : "+studID+
				"Student Name  : "+studName+
				"Subject Code  : "+subjectCode+
				"Previous Mark : "+previousMark+
				"New Mark      : "+newMark+
				"Changes       : "+DisplayChanges();
		
	}
}