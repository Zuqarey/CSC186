package Q1;

public class PhysicalDesign extends DesignService {
    private int physicalType;
    private boolean printing;
    private int numCopy;

    public PhysicalDesign(String custName, String deposit, String urgentOrder, int physicalType, boolean printing, int numCopy) {
        super(custName, deposit, urgentOrder);
        this.physicalType = physicalType;
        this.printing = printing;
        this.numCopy = numCopy;
    }

    public int getPhysicalType() {
        return physicalType;
    }
    public boolean isPrinting() {
        return printing;
    }
    public int getNumCopy() {
        return numCopy;
    }
    @Override
    public double calcPayment() {
        double baseCost = 0.0;
        switch (physicalType) {
            case 1:
                baseCost = 250.0;
                break;
            case 2:
                baseCost = 250.0;
                break;
            case 3:
                baseCost = 150.0;
                break;
            case 4:
                baseCost = 100.0;
        }
        if (printing) {
            switch (physicalType) {
                case 1:
                    baseCost += numCopy * 40.0;
                    break;
                case 2:
                    baseCost += numCopy * 10.0;
                    break;
                case 3:
                    baseCost += numCopy * 35.0;
                    break;
                case 4:
                    baseCost += 3.0;
            }
        }
        return baseCost;
    }

    @Override
    public String toString() {
        String typeStr = "";
        switch (physicalType) {
            case 1:
                typeStr = "Banner Design";
                break;
            case 2:
                typeStr = "Brochure Design";
                break;
            case 3:
                typeStr = "Poster Design";
                break;
            case 4:
                typeStr = "Business Card Design";
        }
        String printingStr = printing ? "Yes" : "No";
        return super.toString() + "\nPhysical Design Type: " + typeStr + "\nPrinting Required: " + printingStr + "\nNumber of Copies: " + numCopy + "\nTotal Payment: RM" + String.format("%.2f", calcPayment());
    }
}