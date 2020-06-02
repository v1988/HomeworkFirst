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

        //арифметические действия #3
        double result = b + s - f;
        System.out.print(result); // дробный результат 1
        System.out.print("   ");

        double n = b * 3 + f / 2 - s;
        System.out.print(n); // дробный результат 2
        System.out.print("   ");

        int k = 10;
        double resultA = k / f;
        System.out.println(resultA); // дробный результат 3

        double resultB = k * 1.46 / 2;
        System.out.print(resultB); // дробный результат 4
        System.out.print("   ");

        double resultC = f * k / 3.45;
        System.out.println(resultC); // дробный результат 5
        System.out.println("   ");

        int resultD = 50000 / b + k;
        System.out.print(resultD); // целый результат 1
        System.out.print("   ");

        int resultE = s * k / b;
        System.out.print(resultE); // целый результат 2
        System.out.print("   ");

        int resultF = b - 1000 / k;
        System.out.println(resultF); // целый результат 3

        long resultG = l - k + b;
        System.out.print(resultG); // целый результат 4
        System.out.print("   ");

        int resultH = 150 / b * k;
        System.out.println(resultH); // целый результат 5
        System.out.println("   ");

        // с присвоением #4
        int first = 50;
        int second = 700;
        int third = -65;
        int fourth = 100;
        int fifth = 10;
        System.out.print(first *= fifth); // присвоение 1
        System.out.print("   ");
        System.out.print(fourth /= 50); // присвоение 6
        System.out.print("   ");
        System.out.print(fourth -= fourth); // присвоение 2
        System.out.print("   ");
        System.out.print(second += fifth); // присвоение 3
        System.out.print("   ");
        System.out.print(fifth -= third); // присвоение 4
        System.out.print("   ");
        System.out.println(third %= first); // присвоение 5
        System.out.print("   ");

        // логика #5
        System.out.print(result > n);
        System.out.print("   ");
        System.out.print(n != result);
        System.out.print("   ");
        System.out.print(n == s);
        System.out.print("   ");
        System.out.print(result >= l);
        System.out.print("   ");
        System.out.print(result >= l || b > n);
// test 123
    }
}
