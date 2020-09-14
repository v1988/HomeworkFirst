package Lesson7;

public class House {
    public static void main(String[] args) {
    Table table1 = new Table();
    Chair chair1 = new Chair();
    Locker locker1 = new Locker();

    locker1.setAge(3);
    System.out.println(locker1.getAge());

    table1.setAge(6);
    System.out.println(table1.getAge());

    chair1.setAge(1);
    System.out.println(chair1.getAge());

    locker1.setPrice(539.90);
    System.out.println(locker1.getPrice());

    table1.setPrice(199.90);
    System.out.println(table1.getPrice());

    chair1.setPrice(130.50);
    System.out.println(chair1.getPrice());
    }

}
