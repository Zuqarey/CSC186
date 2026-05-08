package Q4;

public class SdcPresenter extends Presenter {
    private int level; // 1 = Undergraduate, 2 = Postgraduate

    public SdcPresenter(int presenterID, String presenterName,
                        String presenterAffiliation, int level) {
        super(presenterID, presenterName, presenterAffiliation);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public double enrollFee() {
        if (level == 1)
            return 100.0;
        else if (level == 2)
            return 150.0;
        else
            return 0.0;
    }
}
