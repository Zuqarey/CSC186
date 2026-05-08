public class Transport{
	// Data members/ instance variable
	private String regNumber;
	private String brand;
	private double price;
	
	//Method Members
	//Default Constructor
	public Transport(){
		regNumber = "";
		brand = "";
		price = 0;
		
		
	}
	
	//Normal Constructor
	public Transport(String regNumber, String brand, double price){
		this.regNumber = regNumber;
		this.brand = brand;
		this.price = price;
	}
	
	
	//Copy constructor
	public Transport(Transport trans){
		regNumber = trans.regNumber;
		brand = trans.brand;
		price = trans.price;
		
		
		
		
	}
	
	//Setter/Mutator
	public void setRegNumber(String regNumber){
		this.regNumber = regNumber;
		
	}
	public void setBrand(String brand){
		this.brand = brand;
		
	}
	public void setPrice(double price){
		this.price = price;

	}
	
	//Gater/Accessor/retriver
	public String getRegNumber(){
	
		return regNumber;
	}
	public String getBrand(){
		return brand;
		
	}
	public double getPrice(){
		return price;
		
	}
	
	//Processor
	public boolean  TransportSelangor(){
		if(regNumber.charAt(0)=='b' || regNumber.charAt(0)== 'B')
			return true;
		else
			return false;
			
	}
	
	public double DiscountPrice(double dis){
		double priceAfterDiscount = price * (1-dis);
		
		return priceAfterDiscount;
			
	}
	
	//printer
	public String toString(){
		return "\nRegistration Number : "+regNumber+"\nBrand : "+brand+ "\nPrice: RM"+price;
	}
	
	
	
}



