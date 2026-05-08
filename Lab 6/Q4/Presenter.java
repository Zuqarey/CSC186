package Q4;

public abstract class Presenter {
    protected int presenterID;
    protected String presenterName;
    protected String presenterAffiliation;

    public Presenter(int presenterID, String presenterName, String presenterAffiliation) {
        this.presenterID = presenterID;
        this.presenterName = presenterName;
        this.presenterAffiliation = presenterAffiliation;
    }

    public int getPresenterID() {
        return presenterID;
    }

    public String getPresenterName() {
        return presenterName;
    }

    public String getPresenterAffiliation() {
        return presenterAffiliation;
    }

    @Override
    public String toString() {
        return "ID: " + presenterID +
               "\nName: " + presenterName +
               "\nAffiliation: " + presenterAffiliation;
    }

    public abstract double enrollFee();
}
