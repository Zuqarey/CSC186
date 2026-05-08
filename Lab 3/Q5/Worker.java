public class Worker{
	private String wkrName;
	private String wkrId;
	private String wkrContact;
		
	public Worker(String wkrName, String wkrId, String wkrContact){
		this.wkrName = wkrName;
		this.wkrContact= wkrContact;
		this.wkrId = wkrId;
	}
	
	public void Worker(String wkrName, String wkrId, String wkrContact){
		this.wkrName = wkrName;
		this.wkrContact= wkrContact;
		this.wkrId = wkrId;
	}
	
	public String getWorkerName(){
		return wkrName;
	}
	public String getWorkerContact(){
		return wkrContact;
	}
	public String getWorkerId(){
		return wkrId;
	}
}