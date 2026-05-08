public class NonMember extends Customer{
	private boolean spa;
	private int noTreatment;
	private boolean breakfast;
	
	public NonMember(){
		spa = false;
		noTreatment = 0;
		breakfast = false;
	}
	
	public NonMember(String custName, int icNo, String address, String roomType, int bookingNo, int day, boolean spa, int noTreatment, boolean breakfst){
		super(custName, icNo, address, roomType, bookingNo, day);
		this.spa = spa;
		this.noTreatment = noTreatment;
		this.breakfast = breakfast;
	}
	
	public void setSpa(boolean spa){
		this.spa = spa;
	}
	
	public void setNoTreatment(int noTreatment){
		this.noTreatment = noTreatment;
	}
	public void setBreakfst(boolean breakfast){
		this.breakfast = breakfast;
	}
	
	public boolean getSpa(){
		return spa;
	}
	
	public int getNoTreatment(){
		return noTreatment;
	}
	
	public boolean getBreakfast(){
		return breakfast;
	}
	
	public double claculatePayment(){
		double totalCost = 0.0;
		String addOn = "";
		
		if(roomType.equalsIgnoreCase("Standard")){
			totalCost = 180.00 * day;
		}else if (roomType.equalsIgnoreCase("Superior")){
			totalCost = 220.00 * day;
		}else if(roomType.equalsIgnoreCase("Deluxe")){
			totalCost = 280.00 * day;
		}else if (roomType.equalsIgnoreCase("Executive")){
			totalCost = 400.00 * day;
		}
		
		if(addOn.equalsIgnoreCase("Breakfast")){
			totalCost += 30.00 * day;
		}
		if(addOn.equalsIgnoreCase("Spa")){
			totalCost += 150.00 * noTreatment;
		}
		return totalCost;
	}
	
	public String toString(){
		return super.toString()+"\nSpa: "+spa+"\nNo treatmenat: "+noTreatment+"\nBreakfast: "+breakfast;
	}
}