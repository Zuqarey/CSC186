public class Program{
    private String code;
    private String des;
    private int duration;
    private String facul;
    private String head;

    //default constructor
    Program(){
        code = "";
        des = "";
        duration = 0;
        facul = "";
        head = "";
    }

    //normal constructor
    public Program (String code, String des, int duration, String facul, String head){
        this.code = code;
        this.des = des;
        this.duration = duration;
        this.facul = facul;
        this.head = head;
    }

    //copy constructor
    public Program(Program prog){
        code = prog.code;
        des = prog.des;
        duration = prog.duration;
        facul = prog.facul;
        head = prog.head;
    }

    //Setter/Mutator
    public void setCode(String code){
        this.code = code;
    }

    public void setDes(String des){
        this.des = des;
    }

    public void setDuration(int duration){
        this.duration = duration;
    }

    public void setFacul(String facul){
        this.facul = facul;
    }

    public void setHead(String head){
        this.head = head;
    }

    //Getter/Accessor
    public String getCode(){
        return code;
    }

    public String getDes(){
        return des;
    }

    public int getDuration(){
        return duration;
    }

    public String getFacul(){
        return facul;
    }

    public String getHead(){
        return head;
    }

    //Processor method
    public String getProgramLevel(){
        char level = code.charAt(2);

        if (level == '0')
            return "Certificate";
        else if (level == '1')
            return "Diploma";
        else if (level == '2')
            return "Degree";
        else if (level == '7')
            return "Master";
        else if (level == '9')
            return "Doctorate";
        else
            return "Unknown Level";
    }

    //printer
    public String toString(){
        return  "\nProgram Code: " + code +
                "\nDescription: " + des +
                "\nDuration: " + duration +
                "\nFaculty: " + facul +
                "\nProgram Head: " + head +
                "\nProgram Level: " + getProgramLevel();
    }
}
