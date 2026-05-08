public class Land{
	// Data members/ instance variable
	private String id;
	private String name;
	private String house;
	private double area;
	
	
	//Method Members
	//Default Constructor
	public Land(){
		id = "";
		name = "";
		house = "";
		area = 0;
		
		
	}
	
	//Normal Constructor
	public Land(String id, String name, double area, String house){
		this.id = id;
		this.name = name;
		this.area = area;
		this.house = house;
	}
	
	
	//Copy constructor
	public Land(Land lan){
		id = lan.id;
		name = lan.name;
		area = lan.area;
		house = lan.house;
		
		
		
	}
	
	//Setter/Mutator
	public void setid(String id){
		this.id = id;
		
	}
	public void setname(String name){
		this.name = name;
		
	}
	public void setarea(double area){
		this.area = area;
		
	}
	public void sethouse(String house){
		this.house = house;
	}
	
	//Gater/Accessor/retriver
	public String getid(){
	
		return id;
	}
	public String getname(){
		return name;
		
	}
	public double getarea(){
		return area;
	}
	public String gethouse(){
		return house;
		
	}
	
	//Processor
			
	
	public double calcArea(){
		
		double result = 0;
		
		switch (house){
			case "T":
				result = area*10;
				break;
			
			case "S":
				result = area*15;
				break;
				
			case "B":
				result = area*20;
				break;
					
			case "C":
				result = area*30;
				break;
				
			default :
				System.out.println("Wrong House Type");
				
		}
		
		return result;
	
	}
	
	//printer
	public String toString(){
		return  "\nIDs : "+id+
				"\nOwner Name : "+name+ 
				"\nHouse Type: "+house+
				"\nTotal RM: "+calcArea();
	}
	
	
	
}



