package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        /*System.out.println("QA Factory");
        int a1 = 10;
        System.out.println(a1);
        int b1 = 20;
        System.out.println(a1 + b1);
        String s1 = "Hello class";
        System.out.println(s1);
        String c1 = "15";
        System.out.println(c1);
        System.out.println(s1 + c1);
        //Home work
        int a = 20;
        int b = a + 5;
        String s = "Test String";
        System.out.println("--------------");
        System.out.println(a);
        System.out.println(a + b);
        System.out.println(s + a);
        System.out.println(a + s);
        System.out.println("--------------");
        System.out.println(a == b);
        System.out.println(a < b);
        System.out.println(true && false); // && means AND
        System.out.println(true || false); // || means OR
        System.out.println(a == 20.0);
        System.out.println("--------------");
        int c = b + a;
        a = 0;
        System.out.println(c == (b + a));

        s = "0";
        //System.out.println(a==s);
        //System.out.println(s == 0);
        System.out.println(s == "0");
        // write your code here
        System.out.println("--------------");
        int[] i = {1, 2, 3, 4, 5, 5, 5, 1};
        System.out.println(i[1] - i[4]);
        i[4] = i[6];
        System.out.println(i[4]);
        i[0] = i[1] * i[2];
        System.out.println(i[0]);
        System.out.println(s + s + s + s + s);
*/
        System.out.println("-----------------W H I L E-------------------------");
        int i1 = 1;
        while (i1 < 5) {
            System.out.print(i1 + " ");
            i1++;
        }
        int i2 = 1;
        while (i2 < 0) {
            System.out.print(i2 + " ");
            i2++;
        }
       /* int i3 = 1;
        while (true) {
            System.out.print(i3 + " ");
            i3++;
            }*/
        System.out.println();
        System.out.println("-------------D O----W H I L E-------------------------");
        int i4 = 1;
        do {
            i4++;
            System.out.print(i4 + " ");
        } while (i4 < 5);
        int i5 = 1;
        System.out.println();
        do {
            i5++;
            System.out.print(i5 + " ");
        } while (i5 < 0);
        System.out.println("-------------******************-------------------------");
       /* // prog — число созданное программой
        // user — число введённое пользователем
        int prog, user, i6=0;
        // Генерируем случайное целое число от 1 до 10
        prog = (int)(Math.random() * 10) + 1;
        System.out.println("I has thought number from 1 to 10, guess its.");
        System.out.print("Enter your number: ");
        Scanner input = new Scanner(System.in);
        // Проверяем, есть ли в потоке ввода целое число
        if( input.hasNextInt() ) {
            do {
                // Читаем с потока ввода целое число
                user = input.nextInt();
                if(user == prog) {
                    System.out.println("You guessed!");
                    i6++;
                } else {
                    // Проверяем, входит ли число в отрезок [1;10]
                    if (user > 0 && user <= 10) {
                        i6++;
                        System.out.print("You not guessed! "+" try number "+i6+" ");
                        // Если число загаданное программой меньше...
                        if( prog < user ) {
                            System.out.println("My number is smaller.");
                        } else {
                            System.out.println("My number is greater.");
                        }
                    } else {
                        System.out.println("Your numbers do not of the desired segment!");
                        i6++;
                    }
                }
            } while( user != prog );
        } else {
            System.out.println("Error. You have not entered an integer!");
            i6++;
        }
        System.out.println("Goodbye!"+i6);

*/
       /*
        System.out.println(" -------------****** FOR ************-------------------------");
        for (int i7 = 1; i7 <= 100; i7++) {
            System.out.print(i7 + " ");
        }
        System.out.println();
        for (int s2 = 10; s2 > -11; s2--) {
            System.out.print(s2 + " ");
        }
        System.out.println();
        for (int i8 = 1; i8 <= 33; i8 = i8 + 2) {
            System.out.print(i8 + " ");
        }
        System.out.println();
        System.out.println("______________");
        int sum = 0; // Сюда будем накапливать результат
        for (int j = 2; j <= 100; j=j+2) {
            sum = sum + j;
        }
        System.out.println("sum "+sum);
        System.out.println("______________");
        double a2 = 2;
        int n = 10;
        double res = 1; // Сюда будем накапливать результат
        for (int i9 = 1; i9 <= n; i9++) {
            res = res * a2;
        }
        System.out.println("res "+res);
        System.out.println("______________");
        for (int i10 = 1; i10 < 11; i10++) {
            System.out.print(2*i10 + 2 + " ");
        }
        */
        System.out.println(" -------------****** Additional task lesson 3 ************-------------------------");

        int a = 3;
        int b = 2;
        int r = a + b;
        System.out.println(r);
        int g = 113;
        int sec = 1;
        int r1 = g * sec;
        System.out.println("r1="+r1);
////////////////////
        boolean oper=false;
        int a1=0;
        int b1=-200;
        if (oper==true){
            System.out.println("True "+(a1+b1));
        } else {
            System.out.println("False " + (a1 - b1));
           }
//////////////////
        String[] strings = {"Hello", "World", "Class", "Guys", "Girls", "Everyone", "Goodbye"};
        int w1 = 1;
        int w2 = 7;
        System.out.println("TEXT MAS "+(strings[w1-1])+" "+(strings[w2-1]));
//////////////////
        boolean anti = false;
        if (anti==true){
            System.out.println("___False ");
        } else {
            System.out.println("__True " );
        }

//////////////////
        //int[] notstrings = {1, 2, 3, 4, 1, 3, 1, 6, 6, 1, 1};
        //int[] notstrings = {1, 2, 3, 4, 1, 3, 1, 6, 6, 1, 1};
        int[] notstrings = {1, 7, 1, 4, 1, 7, 9, 6, 13, 1, 7};
        //int target = 1;
        //int target = 6;
        int target = 7;
        int count=0;
        for (int j = 0; j < 10; j=j+1) {
            if (notstrings[j]==target){
                count = count+1;
            }
        }
        System.out.println("Coun element in massive: "+target+": " +count );

//////////////////////////////

        int[] input = {1, 2, 3, 4, 1, 3, 1, 6, 6, 1, 1};
        int isAllLessThan = 3;
        for (int j = 0; j <= 12; j=j+1) {
            if (Math.abs( input[j])  < isAllLessThan){
                System.out.println("FALSE: ");
            }
        }
//////////////////
      /*  int[] input = {1, 2, 3, 4, 1, 3, 1, 6, 6, 1, 1};
        int isAllLessThan = 3;
        int maxmas=Math.max(input);
        //if >=isAllLessThan){
                System.out.println("Coun element in massive: "+input);
        };*/
// false


    System.out.println(" -------------****** Additional task lesson 3 ************-------------------------");

        int[] operand1 = {76, 90, 4, 87, 70, 57, 48, 70, 31, 69, 18, 40, 76};
        int[] operand2 = {76, 50, 36, 77, 87, 28, 98, 20, 20, 52, 86, 34, 34};
        int[] expectedResults = {152, 140, 40, 164, 157, 85, 146, 90, 51, 121, 104, 74, 110};
        int k=0;
        while (k<13) {
            if (expectedResults[k]==operand1[k] + operand2[k]){
                System.out.println("true: TEST PASSED");
            }
            else {
                System.out.println("FALSE TEST FAILED");
            }
            k=k+1;

        }
///////////////////////////////////////////////


        int[] operand3 = {76, 91, 4, 87, 70, 57, 45, 30, 30, 121, 18, 40, 76};
        int[] operand4 = {76, 49, 36, 77, 87, 28, 101, 60, 20, 0, 86, 34, 34};
        int[] expectedResults1 = {152, 140, 40, 164, 157, 85, 146, 90, 51, 121, 104, 74, 110};
        int k1=0;
        System.out.println("-----------------------");
        while (k1<13) {
            if (expectedResults1[k1]==operand3[k1] + operand4[k1]){
                System.out.println("true: TEST PASSED  "+ (operand3[k1] + operand4[k1]));
            }
            else {
                System.out.println("FALSE TEST FAILED");
            }
            k1=k1+1;

        }
///////////////////////////////////////////////

       /* int[] operand5 = {96, 35, 71, 54, 87, 76, 85, 30, 94, 8, 88, 82, 20};
        int[] operand6 = {2, 63, 33, 91, 98, 20, 95, 95, 5, 83, 38, 66, 87};
        int[] expectedResults2 = {98, 98, 100, 137, 185, 96, 180, 125, 99, 91, 126, 148, 90};
        int k2=0;
        System.out.println("-----------------------");
        while (k2<13) {
            if (expectedResults2[k2]==operand5[k2] + operand6[k2]){
                System.out.println("true: TEST PASSED  "+ (operand5[k2] + operand6[k2]));
            }
            else {
                System.out.println("FALSE TEST FAILED");
            }
            k2=k2+1;

        }

// Expected: 100; Actual: 104
// Expected: 137; Actual: 145
// Expected: 90; Actual: 107
// Tests FAILED*/

///////////////////////////////////////////////

        int[] operand5 = {41, 39, 64, 56, 48, 52, 57, 82, 12, 53, 80, 24, 75};
        int[] operand6 = {81, 42, 83, 4, 68, 11, 4, 67, 29, 1, 51, 3, 98};
        int[] expectedResults2 = {122, 81, 147, 60, 116, 63, 61, 149, 41, 54, 131, 27, 173};
// Tests PASSED
        int k2=0;
        System.out.println("-----------------------");
        while (k2<13) {
            if (expectedResults2[k2]==operand5[k2] + operand6[k2]){
                System.out.println("true: TEST PASSED  "+ (operand5[k2] + operand6[k2]));
            }
            else {
                System.out.println("FALSE TEST FAILED");
            }
            k2=k2+1;

        }


// Tests PASSED

    }
}

