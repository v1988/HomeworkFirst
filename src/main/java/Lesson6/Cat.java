package Lesson6;

public class Cat {
    String name;
    int age;
    String sample;

    public Cat(int age) {
        this.age = age;
    }

    public Cat(String sample, int age, String name) {
        this.sample = sample;
        this.age = age;
        this.name = name;
    }

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Cat() {
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



