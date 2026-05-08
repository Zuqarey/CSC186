public class HomeCare{
    private String custName;
    private String phoneNo;
    private String location;
    private char serviceType;
    private int duration;
    private Staff stf;

    public HomeCare(String custName, String phoneNo, String location,char serviceType, int duration, Staff stf){
        this.custName = custName;
        this.phoneNo = phoneNo;
        this.location = location;
        this.serviceType = serviceType;
        this.duration = duration;
        this.stf = stf;
    }

    public void setHomeCare(String custName, String phoneNo, String location,char serviceType, int duration, Staff stf){
        this.custName = custName;
        this.phoneNo = phoneNo;
        this.location = location;
        this.serviceType = serviceType;
        this.duration = duration;
        this.stf = stf;
    }

    public String getCustName(){
        return custName;
    }

    public String getPhoneNo(){
        return phoneNo;
    }

    public String getLocation(){
        return location;
    }

    public char getServiceType(){
        return serviceType;
    }

    public int getDuration(){
        return duration;
    }

    public Staff getStf(){
        return stf;
    }

    public double calcServiceCharge(){
        double price = 0;

        if (serviceType == 'P' || serviceType == 'p'){
            price = 60.00;
        } 
        else if (serviceType == 'T' || serviceType == 't'){
            price = 120.00;
        } 
        else if (serviceType == 'B' || serviceType == 'b'){
            price = 80.00;
        }

        double total = price * duration;

        if (duration > 5){
            total = total - (total * 0.05);
        }

        return total;
    }
}
