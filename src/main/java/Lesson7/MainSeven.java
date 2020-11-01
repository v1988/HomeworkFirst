package Lesson7;

public class MainSeven {
    private static Object House;
    public static void main(String[] args) {

        Chair myChair = new Chair();
        myChair.setCPrice(143.2);
        myChair.setCAge(1);

        Table myTable = new Table();
        myTable.settPrice(759.40);
        myTable.settAge(1);

        Locker myLocker = new Locker();
        myLocker.setLPrice(549.2);
        myLocker.setLAge(1);



        House myHouse = new House();
        myHouse.setMyChair(String.valueOf(myChair));
        myHouse.setMyTable(String.valueOf(myTable));
        myHouse.setMyLocker(String.valueOf(myLocker));

        System.out.println(myHouse);
    }
}
