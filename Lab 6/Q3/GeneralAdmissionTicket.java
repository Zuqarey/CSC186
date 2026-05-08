package Q3;

public class GeneralAdmissionTicket extends Ticket {
    private int seatingArea;

    public GeneralAdmissionTicket(String ticketID, String customerName,
                                  boolean earlyBird, int seatingArea) {
        super(ticketID, customerName, earlyBird);
        this.seatingArea = seatingArea;
    }

    public int getSeatingArea() {
        return seatingArea;
    }

    public void setSeatingArea(int seatingArea) {
        this.seatingArea = seatingArea;
    }

    @Override
    public double calcTicket() {
        double price = 50.0;
        if (earlyBird) {
            price *= 0.85; // 15% discount
        }
        return price;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nSeating Area: " + seatingArea +
               "\nTicket Price: RM " + calcTicket();
    }
}
