package Lesson7;

public class Table {
    private int age;
    private double price;

    public Table() {
    }

    public Table(int age, double price) {
        this.age = age;
        this.price = price;
    }

    public void setAge(int age1) {
        this.age = age1;
    }

    public void setPrice(double price1) {
        this.price = price1;
    }
    public int getAge() {return age;}

    public double getPrice(){ return price;}

}
