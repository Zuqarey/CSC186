package Q6;

public class Wedding extends Event {
    private int numOfGuests;
    private char menuPackage;
    private boolean doorgift;

    public Wedding(String eventName, String Date, int numOfGuests, char menuPackage, boolean doorgift) {
        super(eventName, Date);
        this.numOfGuests = numOfGuests;
        this.menuPackage = menuPackage;
        this.doorgift = doorgift;
    }

    public void setNumOfGuests(int numOfGuests) {
        this.numOfGuests = numOfGuests;
    }

    public void setMenuPackage(char menuPackage) {
        this.menuPackage = menuPackage;
    }

    public void setDoorgift(boolean doorgift) {
        this.doorgift = doorgift;
    }

    public int getNumOfGuests() {
        return numOfGuests;
    }

    public char getMenuPackage() {
        return menuPackage;
    }

    public boolean isDoorgift() {
        return doorgift;
    }

    @Override
    public double totalCost() {
        double costPerGuest = 0.0;
        switch (menuPackage) {
            case 'A':
                costPerGuest = 10000.0;
                break;
            case 'B':
                costPerGuest = 15000.0;
                break;
            case 'C':
                costPerGuest = 22000.0;
                break;
        }
        double totalCost = numOfGuests * costPerGuest;
        if (doorgift) {
            totalCost += numOfGuests * 9.0; // Additional cost for doorgifts
        }
        return totalCost;
    }

    @Override
    public String toString() {
        return super.toString() + "Number of Guests: " + numOfGuests + "\nMenu Package: " + menuPackage +
               "\nDoorgift: " + (doorgift ? "Yes" : "No") + "\nTotal Cost: " + totalCost() + "\n";
    }
    
}
