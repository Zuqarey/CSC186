package Q1;

public class DigitalDesign extends DesignService {
    private int digitalType;

    public DigitalDesign(String custName, String deposit, String urgentOrder, int digitalType) {
        super(custName, deposit, urgentOrder);
        this.digitalType = digitalType;
    }

    public int getDigitalType() {
        return digitalType;
    }

    @Override
    public double calcPayment() { 
        double cost = 0.0;
        switch (digitalType) {
            case 1:
                cost = 300.0;
                break;
            case 2:
                cost = 200.0;
                break;
        }
        return cost;
    }

    @Override
    public String toString() {
        String typeStr = "";
        switch (digitalType) {
            case 1:
                typeStr = "Web Design";
                break;
            case 2:
                typeStr = "advertisment Design";
                break;
        }
        return super.toString() + "\nDigital Design Type: " + typeStr + "\nTotal Payment: RM" + calcPayment();
    }
}