public class Book extends Product{
	private String author;
	private int numPages;
	
	public Book(){
		author = "";
		numPages = 0;
	}
	
	public Book(String id, String title, String author, int numPages){
		super (author, title);
		this.author = author;
		this.numPages = numPages;
	}
	
	public void setAuthor(String author){
		this.author = author;
	}
	
	public void setNumPages(int numPages){
		this.numPages = numPages;
	}
	
	public String getauthor(){
		return author;
	}
	public int getnumPages(){
		return numPages;
	}
	
	public double calcPrice(){
		double cost = 0.0;
		double disRate = 0.0;
		double costofProduct = 0.0;
		double tcost = 0.0;
		
		tcost = numPages * 0.50;
		
		if(cost < 201){
			disRate = 0.02;
		}
		if(cost < 500){
			disRate = 0.05;
		}
		else if(cost >= 500){
			disRate =0.1;
		}
		costofProduct = tcost* (1 - disRate);
		return costofProduct;
	}
	
	public String toString(){
		return super.toString()+ "\nName of Author : "+author+"\nNumber of Pages : "+numPages;
	}
}