package Q5;

public class WeddingDeco extends DecoService {

    private String weddingTheme; // Floral / Beach
    private char weddingPackage; // A / B

    // Normal constructor
    public WeddingDeco(String name, int contactNo, boolean plan3D,
                       String weddingTheme, char weddingPackage) {
        super(name, contactNo, plan3D);
        this.weddingTheme = weddingTheme;
        this.weddingPackage = weddingPackage;
    }

    // Accessors
    public String getWeddingTheme() {
        return weddingTheme;
    }

    public char getWeddingPackage() {
        return weddingPackage;
    }

    // Cost calculation
    @Override
    public double calcDesignCost() {
        double cost = 0.0;

        if (weddingPackage == 'A') {
            cost = 5000;
        } else if (weddingPackage == 'B') {
            cost = 10000;
        }

        if (plan3D) {
            cost += cost * 0.10;
        }

        return cost;
    }

    @Override
    public String toString() {
        return super.toString() +
               "Wedding Theme: " + weddingTheme +
               "\nWedding Package: " + weddingPackage +
               "\nTotal Cost: RM" + calcDesignCost() + "\n";
    }
}
