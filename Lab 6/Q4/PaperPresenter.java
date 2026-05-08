package Q4;

public class PaperPresenter extends Presenter {
    private char sector; // 'A' or 'I'

    public PaperPresenter(int presenterID, String presenterName,
                          String presenterAffiliation, char sector) {
        super(presenterID, presenterName, presenterAffiliation);
        this.sector = sector;
    }

    public char getSector() {
        return sector;
    }

    public void setSector(char sector) {
        this.sector = sector;
    }

    @Override
    public double enrollFee() {
        if (sector == 'A')
            return 180.0;
        else if (sector == 'I')
            return 200.0;
        else
            return 0.0;
    }
}
