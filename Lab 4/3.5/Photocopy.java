public class Photocopy {
    private String lectName;
    private String staffID;
    private String facCode;
    private String assType;
    private int masterNum;
    private int copiesNum;

    public Photocopy() {} // Default constructor

    public void setPhotocopy(String name, String id, String code, String type, int master, int copies) {
        this.lectName = name;
        this.staffID = id;
        this.facCode = code;
        this.assType = type;
        this.masterNum = master;
        this.copiesNum = copies;
    }

    // Accessors
    public String getLectName() { return lectName; }
    public String getStaffID() { return staffID; }
    public String getFacCode() { return facCode; }
    public String getAssType() { return assType; }
    public int getMasterNum() { return masterNum; }
    public int getCopiesNum() { return copiesNum; }

    public String toString() {
        return "Lecturer: " + lectName + " | Staff ID: " + staffID + " | Faculty: " + facCode + 
               " | Type: " + assType + " | Master Pages: " + masterNum + " | Copies: " + copiesNum;
    }
}