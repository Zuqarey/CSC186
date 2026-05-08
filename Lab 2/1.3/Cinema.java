public class Cinema {

    private String code;
    private String title;
    private int price;
    private String pay;        
    private boolean member;    

    // Default constructor
    public Cinema() {
        code = "";
        title = "";
        price = 0;
        pay = "";
        member = false; 
    }

    // Normal constructor
    public Cinema(String code, String title, int price, String pay, boolean member) {
        this.code = code;
        this.title = title;
        this.price = price;
        this.pay = pay;
        this.member = member;
    }

    // Copy constructor
    public Cinema(Cinema cine) {
        code = cine.code;
        title = cine.title;
        price = cine.price;
        pay = cine.pay;
        member = cine.member;
    }

    // Setter / Mutator
    public void setcode(String code) {
        this.code = code;
    }

    public void settitle(String title) {
        this.title = title;
    }

    public void setprice(int price) {
        this.price = price;
    }

    public void setpay(String pay) {
        this.pay = pay;
    }

    public void setmember(boolean member) {
        this.member = member;
    }

    // Getter / Accessor
    public String getcode() {
        return code;
    }

    public String gettitle() {
        return title;
    }

    public int getprice() {
        return price;
    }

    public String getpay() {
        return pay;
    }

    public boolean getmember() {
        return member;
    }

    // Processor
    public double discount() {
        double dis = 0;
        if (pay.equalsIgnoreCase("cc")) {
            if (member == true) {
                dis = 0.05;    
            } else {
                dis = 0.03;    
            }
        }

        else if (pay.equalsIgnoreCase("c")) {
            if (member == true) {
                dis = 0.10;  
            } else {
                dis = 0.0;
            }
        }

        return dis;
    }

    public String toString() {
    	double finalprice = price - (price * discount());
        return "\nCinema Code: " + code +
               "\nMovie Title: " + title +
               "\nTicket Price: RM " + price +
               "\nMode of Payment: " + pay +
               "\nMembership: " + member +
               "\nDiscount Rate: " + (discount() * 100) + "%"+
               "\nFinal price: " + finalprice;
               
    }
}
