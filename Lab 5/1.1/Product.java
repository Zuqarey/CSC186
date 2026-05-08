public class Product{
	private String id;
	private String title;
	
	public Product(){
		id = "";
		title = "";	
	}
	
	public Product(String id, String title){
		this.id = id;
		this.title = title;	
	}
	
	public void setId(String id){
		this.id = id;	
	}
	
	public void setTitle(String title){
		this.title = title;
		
	}
	public String getId(){
		return id;
	}
	
	public String getTitle(){
		return title;
	}
		
	public String toString(){
		return "\nId"+id+"\nTitle"+title;
	}
	
	
	
	
}