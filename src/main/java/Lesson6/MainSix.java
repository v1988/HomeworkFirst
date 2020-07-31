package Lesson6;

import java.awt.image.SampleModel;

public class MainSix {
    public static void main(String[] args) {
    Dog dog1 = new Dog();
    Dog dog2 = new Dog(12);
    Dog dog3 = new Dog(7, "Name");
    Dog dog4 = new Dog("Sample", 2 , "Name");

    Cat cat1 = new Cat();
    Cat cat2 = new Cat(12);
    Cat cat3 = new Cat(7, "Name");
    Cat cat4 = new Cat("Sample", 2 , "Name");

        cat1.setName("2");
        System.out.println(cat1.getName());
        cat1.setAge(6);
        System.out.println(cat1.getAge());

        dog1.setName("Example");
        System.out.println(dog1.getName());
        dog1.setAge(4);
        System.out.println(dog1.getAge());

        System.out.println(cat1.age);
        System.out.println(dog3.name);

    }


}
