package com.company;

import static java.lang.System.*;

public class Main {
    public static void main(String[] arg) {
         out.println("-----------------W H I L E-------------------------");
        int i1 = 1;
        while (i1 < 5) {
            out.print(i1 + " ");
            i1++;
        }
        int i2 = 1;
        while (i2 < 0) {
            out.print(i2 + " ");
            i2++;
        }
        /*int i3 = 1;
        while (true) {
            out.print(i3 + " ");
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

      /*  int[] input = {1, 2, 3, 4, 1, 3, 1, 6, 6, 1, 1};
        int isAllLessThan = 3;
        for (int j = 0; j <= 12; j=j+1) {
            if (Math.abs( input[j])  < isAllLessThan){
                System.out.println("FALSE: ");
            }
        }
//////////////////
        /*int[] input = {1, 2, 3, 4, 1, 3, 1, 6, 6, 1, 1};
        int isAllLessThan = 3;
        int maxmas=Math.max(input);
        //if >=isAllLessThan){
                System.out.println("Coun element in massive: "+input);
        };*/
// false


        System.out.print(" -----------****** Additional task lesson 3 ************------");

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

        int[] operand5 = {96, 35, 71, 54, 87, 76, 85, 30, 94, 8, 88, 82, 20};
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
        System.out.println("/////TASK 4/////");
        int[] operand7 = {41, 39, 64, 56, 48, 52, 57, 82, 12, 53, 80, 24, 75};
        int[] operand8 = {81, 42, 83, 4, 68, 11, 4, 67, 29, 1, 51, 3, 98};
        int[] expectedResults3 = {122, 81, 147, 60, 116, 63, 61, 149, 41, 54, 131, 27, 173};
        int k4=0;
        System.out.println("-----------------------");
        while (k4<13) {
            if (expectedResults3[k4]==operand5[k4] + operand6[k4]){
                System.out.println("true: TEST PASSED  "+ (operand5[k4] + operand6[k4]));
            }
            else {
                System.out.println("FALSE TEST FAILED");
            }
            k4=k4+1;

        }


// Tests PASSED
    }
}


