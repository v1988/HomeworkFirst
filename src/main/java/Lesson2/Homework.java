package Lesson2;

import java.util.Arrays;
/** Это сделал я кстати */
public class Homework {
    public static void main(String[] args) {
        // №1
        System.out.println("№1");
        int i = 1;
        System.out.println(i--); // 1
        System.out.println(i++); // 0
        System.out.println(i++); // 1
        System.out.println(--i); // 1
        System.out.println(i++); // 1
        System.out.println(i--); // 2
        System.out.println(i--); // 1
        System.out.println(++i); // 1
        System.out.println("  ");

       /* int i = 1;
        System.out.println(i--); // 1
        System.out.println(i++); // 0
        System.out.println(i++); // 1
        System.out.println(--i); // 1
        System.out.println(i++); // 1
        System.out.println(i--); // 2
        System.out.println(i--); // 1
        System.out.println(++i); // 1 */

        // №2 https://imgur.com/a/3hikd3x

        // №3
        System.out.println("№3");
        byte first = 10;
        short second = 5;
        int third = 7;
        double fourth = 1.5;
        double fifth = 0.5;
        float sixth = 2.2F;

        third = second;
        second = first;
        fourth = third;
        sixth = second;
        fifth = sixth;

        int result = (int) (first + second + third + fourth + fifth + sixth);
        String str1 = Integer.toString(result);
        System.out.println(str1);
        System.out.println("  ");


        // №5
        System.out.println("№5");
        int[] intArray = {1, 7, 5, 12, 10, 2, 21, 8, 9, 50};
        System.out.println(Arrays.toString(intArray));
        intArray[1] *= 2; // 14
        intArray[3] *= 2; // 24
        intArray[5] *= 2; // 4
        intArray[7] *= 2; // 16
        intArray[9] *= 2; // 100

        intArray[0] -= 2; // -2
        intArray[2] -= 2; // 3
        intArray[4] -= 2; // 8
        intArray[6] -= 2; // 19
        intArray[8] -= 2; // 7
        System.out.println(Arrays.toString(intArray));
        System.out.println("  ");
//todo Понять как сделать хоть что-то полезное...
        //№6
        System.out.println("№6");
        int[][] arrayInt = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(arrayInt));
        int a = arrayInt[2][2];
        arrayInt[0][0] = a; // 1 -> 9

        a = arrayInt[2][1]; // 2 -> 8
        arrayInt[0][1] = a;

        a = arrayInt[2][0]; // 3 -> 7
        arrayInt[0][2] = a;

        a = arrayInt[1][2]; //4 -> 6
        arrayInt[1][0] = a;

        a = arrayInt[1][0]; // 6 -> 4
        arrayInt[1][2] =  10 - a;
        /* или
        a = arrayInt[1][1];
        arrayInt[1][2] =  --a;*/

        a = arrayInt[0][2]; // 7 -> 3
        arrayInt[2][0] =  10 - a;
        /* или
        a = arrayInt[1][2];
        arrayInt[2][0] =  --a;*/

        a = arrayInt[0][1]; // 8 -> 2
        arrayInt[2][1] =  10 - a;
       /* или
        a = arrayInt[2][0];
        arrayInt[2][1] =  --a;*/

        a = arrayInt[0][0]; // 9 -> 1
        arrayInt[2][2] =  10 - a;
        /* или
        a = arrayInt[2][1];
        arrayInt[2][2] =  --a;*/
        System.out.println(Arrays.deepToString(arrayInt));
    }
}
