public class House{
	private String tenant;
	private String ICNo;
	private String address;
	
	
	public House(){
		tenant = "";
		ICNo = "";
		address = "";
		
	}
	
	public House(String tenant, String ICNo, String address){
		this.tenant = tenant;
		this.ICNo = ICNo;
		this.address = address;
		
	}
	
	public void setTenant(String tenant){
		this.tenant = tenant;
	}
	
	public void setICNo(String ICNo){
		this.ICNo = ICNo;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public String getTenant() {
        return tenant;
    }

    public String getICNo() {
        return ICNo;
    }

    public String getAddress() {
        return address;
    }
	
	public String toString(){
		return "\nTenant: "+tenant+"\nIC number: "+ICNo+"Address: "+address; 
	}
	
}