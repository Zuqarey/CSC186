public class Supermarket {
    private String itemName;
    private int quantity;
    private double unitPrice;

    // Constructor 
    public Supermarket(String itemName, int quantity, double unitPrice) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    // Setters/Mutators 
    public void setItemName(String itemName) { this.itemName = itemName; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void setUnitPrice(double unitPrice) { this.unitPrice = unitPrice; }

    // Getters/Accessors
    public String getItemName() { return itemName; }
    public int getQuantity() { return quantity; }
    public double getUnitPrice() { return unitPrice; }
    
    // Calculate subtotal
    public double calculateSubtotal() {
        return quantity * unitPrice;
    }
}