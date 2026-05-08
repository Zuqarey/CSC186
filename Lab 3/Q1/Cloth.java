public class Cloth{
	private String name;
	private double price;
	private double length;
	
	public Cloth(){
		name = "";
		price = 0;
		length = 0;
	}
	
	public Cloth(String name, double price, double length){
		this.name = name;
		this.price = price;
		this.length = length;
	}
		
	public Cloth(Cloth a){
		name = a.name;
		price = a.price;
		length = a.length;
		
	}
	
	public void setname(String name){
		this.name = name;
	}
	
	public void setprice(double price){
		this.price= price;
	}
	
	public void setlength(double length){
		this.length = length;
	}
	
	
	public String getname(){
		return name;
	}
	
	public double getprice(){
		return price;
	}
	
	public double getlength(){
		return length;
	}
	
	
	
	public double calcpayment(){
		
		double totprice = price * length;
		double gst = totprice * 0.06;
		double finalprice = totprice + gst;
		
		return finalprice;
		
	}
	
	public String toString(){
		return  "Name : "+name+
				"Price of the cloth per meter : "+price+
				"Length of the cloth in meter : "+length+
				"Final price : "+calcpayment();
				
	}
	
	
	
	
	
	
	
}