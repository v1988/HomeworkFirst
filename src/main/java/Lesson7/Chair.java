package Lesson7;

public class Chair {
    private int cAge;
    private double cPrice;

    public Chair() {
    }

    public Chair(int cAge, double cPrice) {
        this.cAge = cAge;
        this.cPrice = cPrice;
    }
    public void setCAge(int cAge1) {
        this.cAge = cAge1;
    }

    public void setCPrice(double cPrice1) {
        this.cPrice = cPrice1;
    }
    public int getCAge() {return cAge;}

    public double getCPrice(){ return cPrice;}
}
