public class CustomerServices{
	private String custName;
	private String phoneNo;
	private String address;
	private String serviceType;
	private double serviceArea;
	private double toiletArea;
	private Worker wkr;
	
	public CustomerServices(){
		custName = "";
		phoneNo = "";
		address = "";
		serviceType = "";
		serviceArea = 0;
		toiletArea = 0;
		wkr = null;
	}
	
	public void setCustomerServices(String custName, String phoneNo, String address, String serviceType, double seviceArea, double toiletArea, Worker wkr){
		this.custName = custName;
		this.phoneNo = phoneNo;
		this.address = address;
		this.serviceType = serviceType;
		this.serviceArea = serviceArea;
		this.toiletArea = toiletArea;
		this.wkr = wkr;
	}
	
	public String getCustName(){
		return custName;
	}
	public String getPhoneNo(){
		return phoneNo;
	}
	public  String getAddress(){
		return address;
	}
	public String getServiceType(){
		return serviceType;
	}
	public double getServiceArea(){
		return serviceArea;
	}
	public double getToiletArea(){
		return toiletArea;
	}
	public Worker getWorker(){
		return wkr;
	}
	
	public double calcServiceCharge(){
		double totService = 0;
		double price = 0;
		
		switch(serviceType){
			case "Grass": price = serviceArea * 0.85;
			break;
			
			case "Room": price = serviceArea * 2.00;
			break;
			
			case "Toilet": price = serviceArea* 5.00;
			break;
				
		}
		
		if(price > 150){
			totService = price * (1 - 0.03);
		}
		
		return totService;	
	}
}
