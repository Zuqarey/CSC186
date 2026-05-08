package Q5;

public abstract class DecoService {

    protected String name;
    protected int contactNo;
    protected boolean plan3D;

    // Normal constructor
    public DecoService(String name, int contactNo, boolean plan3D) {
        this.name = name;
        this.contactNo = contactNo;
        this.plan3D = plan3D;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }

    public void setPlan3D(boolean plan3D) {
        this.plan3D = plan3D;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getContactNo() {
        return contactNo;
    }

    public boolean getPlan3D() {
        return plan3D;
    }

    // Abstract method
    public abstract double calcDesignCost();

    @Override
    public String toString() {
        return "Customer Name: " + name +
               "\nContact No: " + contactNo +
               "\n3D Plan: " + (plan3D ? "Yes" : "No") + "\n";
    }
}
