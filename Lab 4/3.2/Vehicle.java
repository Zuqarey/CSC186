public class Vehicle{
	private String cartype;
	private String carplatNum;
	private double price;
	
	public Vehicle(){
		this.cartype = cartype;
		this.carplatNum = carplatNum;
		this.price = price; 
	}
	
	public Vehicle(String cartype, String carplatNum, double price) {
		this.cartype = cartype;
		this.carplatNum = carplatNum;
		this.price = price;
	}
	
	public void setVehicle(String cartype, String carplatNum, double price) {
		this.cartype = cartype;
		this.carplatNum = carplatNum;
		this.price = price;
	}
	
	public String getcartype(){
		return cartype;
	}	
	public String getcarplatNum(){
		return carplatNum;	
	}
	public double getprice(){
		return price;
	}
	public String toString(){
		return String.format("%-10s %-15s %-11f", cartype, carplatNum, price);
	}
}