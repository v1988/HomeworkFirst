package Lesson7;

public class Locker {
    private int lAge;
    private double lPrice;

    public Locker() {
    }

    public Locker(int lage, double lPrice) {
        this.lAge = lAge;
        this.lPrice = lPrice;
    }

    public void setLAge(int lAge1) {
        this.lAge = lAge1;
    }

    public void setLPrice(double lPrice1) {
        this.lPrice = lPrice1;
    }
    public int getLAge() {return lAge;}

    public double getLPrice(){ return lPrice;}

}
