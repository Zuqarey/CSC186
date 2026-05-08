public class Customer{
	protected String custName;
	protected int icNo;
	protected String address;
	protected String roomType;
	protected int bookingNo;
	protected int day;
	
	public Customer(){
		custName = "";
		icNo = 0;
		address = "";
		roomType = "";
		bookingNo = 0;
		day = 0;
	}
	
	public Customer(String custName, int icNo, String address, String roomType, int bookingNo, int day){
		this.custName = custName;
		this.icNo = icNo;
		this.address = address;
		this.roomType = roomType;
		this.bookingNo = bookingNo;
		this.day = day;
	}
	
	public void setCustName(String custName){
		this.custName = custName;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public void setIcNo(int icNo){
		this.icNo = icNo;
	}
	
	public void setRoomType(String roomType){
		this.roomType = roomType;
	}
	
	public void setBookingNo(int bookingNo){
		this.bookingNo = bookingNo;
	}
	
	public void setDay(int day){
		this.day = day;
	}
	
	public String getCustName(){
		return custName;
	}
	
	public String getAddress(){
		return address;
	}
	
	public int getIcNo(){
		return icNo;
	}
	
	public String getRoomType(){
		return roomType;
	}
	
	public int getBookingNo(){
		return bookingNo;
	}
	
	public int getDay(){
		return day;
	}
	
	public String toString(){
		return "\nCustormer Name: "+custName+"\nAddress: "+address+"\nIC number: "+icNo+"\nRoom Type"+roomType+"\nBooking number: "+bookingNo+"\nDay: "+day;
	}
}