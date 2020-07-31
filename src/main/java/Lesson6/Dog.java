package Lesson6;

public class Dog {
    String name;
    int age;
    String sample;

    public Dog(int age) {
        this.age = age;
    }

    public Dog(String sample, int age, String name) {
        this.sample = sample;
        this.age = age;
        this.name = name;
    }

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Dog() {
    }

    public void setName(String name1) {
        if (name1 == null || name1.length() < 2) {
            this.name = "-";
        } else {
            this.name = name1;
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}


