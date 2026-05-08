package Q3;

public class VIPTicket extends Ticket {
    private String packageType;

    public VIPTicket(String ticketID, String customerName,
                     boolean earlyBird, String packageType) {
        super(ticketID, customerName, earlyBird);
        this.packageType = packageType;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    @Override
    public double calcTicket() {
        double price = 100.0;
        if (earlyBird) {
            price *= 0.8; // 20% discount
        }
        return price;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nPackage Type: " + packageType +
               "\nTicket Price: RM " + calcTicket();
    }
}
