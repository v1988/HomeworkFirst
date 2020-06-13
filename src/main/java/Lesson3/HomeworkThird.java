package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class HomeworkThird {
    public static void main(String[] args) {
        // #1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваше имя:");
        String name = scanner.nextLine();

        System.out.println("Введите Вашу фамилию:");
        String surname = scanner.nextLine();

        System.out.println("Введите Ваш возраст:");
        int age = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Укажите почту для регистрациивыа:");
        String mail = scanner.nextLine();

        System.out.println("Напишите несколько слов о себе:");
        String info = scanner.nextLine();
        System.out.print(name + " " + surname + " " + age + " лет");
        System.out.println("Почта: " + mail);
        System.out.println(info);

        // №2
        Random random = new Random();
        int val1 = random.nextInt(100) + 1;
        int val2 = random.nextInt(50) + 1;
        int val3 = random.nextInt(25) + 1;
        double val4 = random.nextDouble();
        double val5 = random.nextDouble();
        double val6 = random.nextDouble();
        System.out.println(val1 + val2 + val3 + val4 + val5 + val6);

        // №4
        System.out.println(Math.max(10, 134));
        System.out.println(Math.min(10, 134));
        System.out.println(Math.sqrt(25));
        System.out.println(Math.abs(5));
        System.out.println(Math.random());
        System.out.println(Math.asin(0.5));
        System.out.println(Math.acos(0.5));

        Сount сount = new Сount();
        int sum = Сount.sum(10, 5);
        int divide = Сount.divide(20, 2);
        double multiply = сount.multiply(5,0.5 );
        double subtraction = сount.subtraction(7, 1.5);

        Employee1 employee1 = new Employee1();
        Employee2 employee2 = new Employee2();
        System.out.println(employee1.equals(employee2));
    }

    public static double salaryMath (double a) {
        double resultMath = Math.random() * 30000;
        System.out.println(resultMath);
        return resultMath;
    }

    public static double salaryRandom(double a) {
        Random random = new Random();
        double resultRandom = random.nextInt(7000) + 20001;
        System.out.println(resultRandom);
        return resultRandom;
    }
    public static int winner (int a) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите количество участников:");
        int players = scanner.nextInt();
        int winner = random.nextInt(players);
        System.out.println("Выйграл участник под номером: " + winner);
        return winner;
    }
}
