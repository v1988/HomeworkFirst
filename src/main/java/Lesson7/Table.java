package Lesson7;

public class Table {
    private int tage;
    private double tprice;

    public Table() {
    }

    public Table(int tage, double tprice) {
        this.tage = tage;
        this.tprice = tprice;
    }

    public void settAge(int tage1) {
        this.tage = tage1;
    }

    public void settPrice(double tprice1) {
        this.tprice = tprice1;
    }

    public int gettAge() {
        return tage;
    }

    public double gettPrice() {
        return tprice;
    }

}
