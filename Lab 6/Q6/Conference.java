package Q6;

public class Conference extends Event {
    
    private char type; // A = Academic, S = Seminar, W = Workshop

    // Normal constructor
    public Conference(String eventName, String date, char type) {
        super(eventName, date);
        this.type = type;
    }

    // Setter
    public void setType(char type) {
        this.type = type;
    }

    // Accessor
    public char getType() {
        return type;
    }

    // Payment calculation method
    @Override
    public double totalCost() {
        double fee = 0.0;

        switch (type) {
            case 'A':
                fee = 890.00;
                break;
            case 'S':
                fee = 450.00;
                break;
            case 'W':
                fee = 650.00;
                break;
        }
        return fee;
    }

    // Printer method
    @Override
    public String toString() {
        return super.toString() +
               "Conference Type: " + type +
               "\nTotal Payment: RM" + totalCost() + "\n";
    }
}
