package Lesson1;

public class Homework { // #1
    public static void main(String[] args) {

        // примитивы #2
        byte b = 100;
        short s = 30000;
        long l = 100000;
        float f = 14.88F;
        char c = '0';
        boolean bo = false;

        String myString = "Я пытался, вышло сомнительно";
        System.out.println(myString);
        String myString2 = new String("Я пытался, вышло сомнительно");
        System.out.println(myString2);

        int a = 1, j = 7, r = 9;
        double d = 1.45, p = 2.66, q = 8.09;

        //арифметические действия #3
        double result = b + s - f;
        System.out.print(result); // дробный результат 1 (30085.119140625)
        System.out.print("   ");

        double n = b * 3 + f / 2 - s;
        System.out.print(n); // дробный результат 2 (-29692.560546875)
        System.out.print("   ");

        double resultA = 10 / f;
        System.out.println(resultA); // дробный результат 3 (0.6720430254936218)

        double resultB = 10 * 1.46 / 2;
        System.out.print(resultB); // дробный результат 4 (7.3)
        System.out.print("   ");

        double resultC = f * 10 / 3.45;
        System.out.println(resultC); // дробный результат 5 (43.13043566717617)
        System.out.println("   ");

        int resultD = 50000 / b + 10;
        System.out.print(resultD); // целый результат 1 (510)
        System.out.print("   ");

        int resultE = s * 10 / b;
        System.out.print(resultE); // целый результат 2 (3000)
        System.out.print("   ");

        int resultF = b - 1000 / 10;
        System.out.println(resultF); // целый результат 3 (0)

        long resultG = l - 10 + b;
        System.out.print(resultG); // целый результат 4 (10090)
        System.out.print("   ");

        int resultH = 150 / b * 10;
        System.out.println(resultH); // целый результат 5 (10)
        System.out.println("   ");

        // с присвоением #4
        int first = 50;
        int second = 700;
        int third = -65;
        int fourth = 100;
        int fifth = 10;
        System.out.print(first *= fifth); // присвоение 1 (500)
        System.out.print("   ");
        System.out.print(fourth /= 50); // присвоение 2 (2)
        System.out.print("   ");
        System.out.print(fourth -= fourth); // присвоение 3 (0)
        System.out.print("   ");
        System.out.print(second += fifth); // присвоение 4 (710)
        System.out.print("   ");
        System.out.print(fifth -= third); // присвоение 5 (75)
        System.out.print("   ");
        System.out.println(third %= first); // присвоение 6 (-65)
        System.out.print("   ");

        // логика #5
        System.out.print(result > n); // true
        System.out.print("   ");
        System.out.print(n != result); // true
        System.out.print("   ");
        System.out.print(n == s); // false
        System.out.print("   ");
        System.out.print(result >= l); // false
        System.out.print("   ");
        System.out.print(result >= l || b > n); // true
    }
}
