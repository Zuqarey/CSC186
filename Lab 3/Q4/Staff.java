public class Staff{
	private String staffname;
	private String staffId;
	private String staffContact;
	
	public Staff(String staffname, String staffId, String staffC){
		this.staffname = staffname;
		this.staffId = staffId;
		this.staffContact = staffC;
	}
	
	public void setstaffname(String staffname){
		this.staffname = staffname;
	}
	public void setstaffId(String staffId){
		this.staffId = staffId;
	}
	public void setstaffContact(String staffC){
		this.staffContact = staffC;
	}
	
	public String getstaffname(){
		return staffname;
	}
	public String getstaffId(){
		return staffId;
	}
	public String getstaffContact(){
		return staffContact;
	}




	
}