package Lesson4;

public class Main {
    public static void main(String[] args) {
        Main.while1(); // #1
        System.out.println("   ");
        Main.for1(); // #2
        System.out.println("   ");
        Main.while2(); // #3
        System.out.println("   ");
        Main.for2(); // #4
        System.out.println("   ");
        Main.max1(); // #5
        System.out.println("   ");
        Main.min1(); // #6
        System.out.println("   ");
        Main.text();
        System.out.println("   ");
        Main.even(); // #8
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
        while (a >= 10) {
            System.out.println(a);
            a -= 10;
        }
        System.out.println("Finish №3");
    }

    public static void for2() {
        for (int a = 100; a >= 10; a -= 10) {
            System.out.println(a);
        }
        System.out.println("Finish №4");
    }

    public static void max1() {
        int[] array = {1, 2, 6, 12, 43, 45, 19, 76, 101, 36};
        int qmax1 = (array[0] >= array[9]) ? array[0] : array[9];
        int qmax2 = (array[1] >= array[8]) ? array[1] : array[8];
        int qmax3 = (array[2] >= array[7]) ? array[2] : array[7];
        int qmax4 = (array[3] >= array[6]) ? array[3] : array[6];
        int qmax5 = (array[4] >= array[5]) ? array[4] : array[5];

        int smax1 = (qmax1 >= qmax5) ? qmax1 : qmax5;
        int smax2 = (qmax2 >= qmax4) ? qmax2 : qmax4;

        int fmax1 = (smax1 >= smax2) ? smax1 : smax2;
        int max = (fmax1 >= qmax3) ? fmax1 : qmax3;
        System.out.println(max);
        System.out.println("Finish №5");
    }

    public static void min1() {
        int[] array = {1, 2, 6, 12, 43, 45, 19, 76, 101, 36};
        int qmin1 = (array[0] <= array[9]) ? array[0] : array[9];
        int qmin2 = (array[1] <= array[8]) ? array[1] : array[8];
        int qmin3 = (array[2] <= array[7]) ? array[2] : array[7];
        int qmin4 = (array[3] <= array[6]) ? array[3] : array[6];
        int qmin5 = (array[4] <= array[5]) ? array[4] : array[5];

        int smin1 = (qmin1 <= qmin5) ? qmin1 : qmin5;
        int smin2 = (qmin2 <= qmin4) ? qmin2 : qmin4;

        int fmin1 = (smin1 <= smin2) ? smin1 : smin2;
        int min = (fmin1 <= qmin3) ? fmin1 : qmin3;
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
            int var = (array[a]/2)*2;
            System.out.println((array[a] > var) ? a+1 + " не четное" : a+1 + " четное" );
            a++;
        }
        System.out.println("Finish №8");
    }
    }
