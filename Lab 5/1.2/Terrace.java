public class Terrace extends House {
    private String type;
    private boolean cornerLot;

    public Terrace() {
        super();
        type = "";
        cornerLot = false;
    }

    public Terrace(String tenant, String ICNo, String address,String type, boolean cornerLot) {
        super(tenant, ICNo, address);
        this.type = type;
        this.cornerLot = cornerLot;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCornerLot(boolean cornerLot) {
        this.cornerLot = cornerLot;
    }

    public String getType() {
        return type;
    }

    public boolean isCornerLot() {
        return cornerLot;
    }

    public double calculateRent() {
        double rent = 0;

        if (type.equalsIgnoreCase("single-storey")) {
            rent = 1200;
        } else if (type.equalsIgnoreCase("double-storey")) {
            rent = 1800;
        }

        if (cornerLot) {
            rent += 300;
        }

        return rent;
    }

    // Printer
    public String toString() {
        return super.toString() +"\nType: "+type+"\nCorner Lot: "+(cornerLot ? "Yes" : "No")+"\nRent: RM " + calculateRent();
    }
}
