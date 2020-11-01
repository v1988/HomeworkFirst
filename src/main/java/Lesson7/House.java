package Lesson7;
import java.util.Objects;

public class House {
    private String myLocker;
    private String myChair;
    private String myTable;


    public House(String myLocker, String myTable, String myChair) {
        this.myLocker = myLocker;
        this.myTable = myTable;
        this.myChair = myChair;
    }

    public House() {

    }
    public void setMyLocker(String myLocker) { this.myLocker = myLocker; }
    public void setMyChair(String myChair) { this.myChair = myChair; }
    public void setMyTable(String myTable) { this.myTable = myTable; }


    public String getMyLocker() { return myLocker; }
    public String getMyChair() { return myChair; }
    public String getMyTable() { return myTable; }
}






