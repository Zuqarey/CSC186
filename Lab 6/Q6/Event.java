package Q6;
public abstract class Event {
    protected String eventName;
    protected String Date;

    

    public Event(String eventName, String Date){
        this.eventName = eventName;
        this.Date = Date;
    
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getEventName() {
        return eventName;
    }

    public String getDate() {
        return Date;
    }

   

    public String toString() {
        return "Event Name: " + eventName + "\nEvent Date: " + Date + "n";
    }

    public abstract double totalCost();
}