public class Member extends Customer{
	//Data members
	private int memberNo;
	private String dateExpired;
	
	//Methode
	//Default constructor
	public Member(){
		super();
		memberNo = 0;
		dateExpired = "";
	}
	//Normal constructor
	public Member(String custName, int icNo, String address, String roomType, int bookingNo, int day, int memberNo, String dateExpired){
		super(custName, icNo, address, roomType, bookingNo, day);//need to be first line
		this.memberNo = memberNo;
		this.dateExpired = dateExpired;
	}
	
	public void setCustName(int memberNo){
		this.memberNo = memberNo;
	}
	
	public void setDateExpired(String dateExpired){
		this.dateExpired = dateExpired;
	}
	
	public int getmemberNo(){
		return memberNo;
	}
	
	public String getDateExpired(){
		return dateExpired;
	}
	
	public double claculatePayment(){
		double totalCost = 0.0;
		
		if(roomType.equalsIgnoreCase("Standard")){
			totalCost = 180.00 * day;
		}else if (roomType.equalsIgnoreCase("Superior")){
			totalCost = 220.00 * day;
		}else if(roomType.equalsIgnoreCase("Deluxe")){
			totalCost = 280.00 * day;
		}else if (roomType.equalsIgnoreCase("Executive")){
			totalCost = 400.00 * day;
		}
		return totalCost;
	}
	
	public String toString(){
		return super.toString()+"\nMember Number: "+memberNo+"\nDate of Expired: "+dateExpired;
	}
}