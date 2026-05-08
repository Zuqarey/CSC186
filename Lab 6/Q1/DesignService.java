package Q1;

public abstract class DesignService {
    protected String custName;
    protected String deposit;
    protected String urgentOrder;
    
    public DesignService(String custName, String deposit, String urgentOrder) {
        this.custName = custName;
        this.deposit = deposit;
        this.urgentOrder = urgentOrder;
    }
    public String getCustName() {
        return custName;
    }

    public String getDeposit() {
        return deposit;
    }

    public String getUrgentOrder() {
        return urgentOrder;
    }

    public String toString() {
        return "Customer Name: " + custName + "\nDeposit: " + deposit + "\nUrgent Order: " + urgentOrder;
    }

    public abstract double calcPayment();

}


