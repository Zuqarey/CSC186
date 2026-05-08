package Q5;

public class HomeDeco extends DecoService {

    private int homeArea; // 1 = Living, 2 = Dining
    private int areaSize;

    // Normal constructor
    public HomeDeco(String name, int contactNo, boolean plan3D,
                    int homeArea, int areaSize) {
        super(name, contactNo, plan3D);
        this.homeArea = homeArea;
        this.areaSize = areaSize;
    }

    // Accessors
    public int getHomeArea() {
        return homeArea;
    }

    public int getAreaSize() {
        return areaSize;
    }

    // Cost calculation
    @Override
    public double calcDesignCost() {
        double rate = 0.0;

        if (homeArea == 1) { // Living room
            rate = (areaSize <= 20) ? 1000 : 1500;
        } else if (homeArea == 2) { // Dining room
            rate = (areaSize <= 20) ? 800 : 1300;
        }

        double cost = rate * areaSize;

        if (plan3D) {
            cost += cost * 0.10;
        }

        return cost;
    }

    @Override
    public String toString() {
        return super.toString() +
               "Home Area: " + (homeArea == 1 ? "Living Room" : "Dining Room") +
               "\nArea Size: " + areaSize +
               "\nTotal Cost: RM" + calcDesignCost() + "\n";
    }
}
