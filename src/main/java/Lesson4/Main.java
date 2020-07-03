package Lesson4;


public class Main {
    public static void main(String[] args) {
        while1(); // #1
        System.out.println("   ");
        for1(); // #2
        System.out.println("   ");
        while2(); // #3
        System.out.println("   ");
        for2(); // #4
        System.out.println("   ");
        max1(); // #5
        System.out.println("   ");
        min1(); // #6
        System.out.println("   ");
        text();
        System.out.println("   ");
        even(); // #8
    }

    public static void while1() {
        int a = 1;
        while (a <= 10) {
            System.out.println(a);
            a++;
        }
        System.out.println("Finish №1");
    }

    public static void for1() {
        for (int a = 1; a <= 10; a++) {
            System.out.println(a);
        }
        System.out.println("Finish №2");
    }

    public static void while2() {
        int a = 100;
        while (a >= 0) {
            System.out.println(a);
            a -= 10;
        }
        System.out.println("Finish №3");
    }

    public static void for2() {
        for (int a = 100; a >= 0; a -= 10) {
            System.out.println(a);
        }
        System.out.println("Finish №4");
    }

    public static void max1() {
        int[] array = {1, 2, 6, 12, 43, 45, 19, 76, 101, 36};
        int b = 1;
        int max = (array[0]);
        while (b < array.length) {
            max = (max >= array[b]) ? max : array[b];
            b++;
        }
        System.out.println(max);
        System.out.println("Finish №5");
    }

    public static void min1() {
        int[] array = {1, 2, 6, 12, 43, 45, 19, 76, 101, 36};
        int b = 1;
        int min = (array[0]);
        while (b < array.length-2) {
            min = (min <= array[b]) ? min : array[b];
            b++;
        }
        System.out.println(min);
        System.out.println("Finish №6");
    }

    public static void text() {
        int a = 5;
        do {
            System.out.println("Sample text");
        } while (a < 0);
        System.out.println("Finish №7");
    }

    public static void even () {
        int a = 0;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        while (a<=9) {
           String b =(array[a]%2 != 0) ? a + 1 + " не четное" : a + 1 + " четное";
            System.out.println(b);
            a++;
        }
        System.out.println("Finish №8");
    }
    }
