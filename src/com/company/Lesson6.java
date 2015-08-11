package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson6 {
    public static void main (String[] less6) {

       /*     String a = "asdadsad";
            System.out.println(a.length());
            int [] b = {1,2,3,4,65,76};
            System.out.println(b.length);

       ArrayList<Integer> c = new ArrayList<Integer>();
       System.out.println(c.size());     //quantity of the parameters in the list
       c.add(10);
       System.out.println(c.size());
       System.out.println("------------");
       c.add(1);
       c.add(5);
       System.out.println(c.size());
       System.out.println("------------");
       System.out.println(c.get(1));
       System.out.println(c.get(2));
       c.remove(0);                      //removing of the first (1,2,3) value in the list
       System.out.println(c.size());
       System.out.println("------------");
       Integer[] c1 = {1,2,10,20};
       c.addAll(Arrays.asList(c1));     //mass creation of some values for the current list "c"
       System.out.println(c.size());*/
//////////////////////
        ArrayList<String> s = new ArrayList<String>();
        s.add("a");
        s.add("b");
        s.add("c");
        s.add("d");
        print(s);
////////////////////
        ArrayList<String> f = new ArrayList<String>();
        f.add("a");
        f.add("b");
        f.add("c");
        f.add("d");
        System.out.println(isListsEqual(s, f));
/////////////////////
        f.add("d");
        System.out.println(isListsEqual(s, f));
//////////////////
        s.add("b");
        System.out.println(isListsEqual(s, f));
///////////////////
        ArrayList<String> s1 = new ArrayList<>();
        ArrayList<String> s2 = new ArrayList<>();
        System.out.println(isListsEqual(s1, s2));
////////////////////
        String[] a = {"a", "b", "c", "d", "b"};
        print(a);
//////////////////////////
        System.out.println();
        System.out.println(isEqual(a, s));
        System.out.println("--------------------");
//******************************************************
        sayHello();
        System.out.println(hello());
        System.out.println(hello("Friends"));
        System.out.println(hello("Friends").equals(hello("Friends")));
        System.out.println(hello("Friends") == hello("Friends"));
/////////////////////////////////////
        System.out.println("--------------------");
        test("Hello Engineers!", hello());
        test("Hello Enginers!", hello());
        test("Hello Friends", hello("Friends"));
        test("Hello Good Men", hello("Good Men"));
        System.out.println("---------------------");

//*****************????????????????

        test("Hello to all 14 students!", hello(14));
        test("Hello student!", hello(1));
        test("No one came. ", hello(0));
        System.out.println("---------------------");
//*****************????????????????
        test("Hello to all 25 persons!", hello(25, "persons"));
        test("Hello to all 99 programmers!", hello(99, "programmers"));
        System.out.println("---------------------");
//*****************????????????????
        test("Hello Jean Podmore Oleksiia !", hello(new String[]{"Jean", "Podmore", "Oleksiia"}));
        test("Hello Anonymous Anonymous2 !", hello(new String[]{"Anonymous", "Anonymous2"}));
////////////////////////////////////////
        test("Hello Slughorn, Norris, Fred and George!", hello(Arrays.asList("Slughorn", "Norris", "Fred", "George")));
        test("Hello Horace, Miss and Weasley's!", hello(Arrays.asList("Horace", "Miss", "Weasley's")));
///////////////////////////////////
        test(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3));
        test(Arrays.asList(1, 4, 3), Arrays.asList(1, 2, 3));
///////////////////////////////////
      //  test(Arrays.asList(6), stringsLength(Arrays.asList("Jordan")));
        // Test PASSED.
      //  test(Arrays.asList(5, 3, 8), stringsLength(Arrays.asList("Harry", "Ron", "Hermione")));
        // Test PASSED.
       // test("[5, 5]", stringsLength(Arrays.asList("Jinny", "Lupin")).toString());
        // Test PASSED.
        //test(Arrays.asList(3, 6, 1, -60), reverseInts(Arrays.asList(-60, 1, 6, 3)));
        // Test PASSED.
       // prettyPrint(Arrays.asList("Vernon", "Dudley", "Petunia", "Madge"), true);
        // Vernon
        //  Dudley
        //   Petunia
        //    Madge
        //prettyPrint(reverse(Arrays.asList("Vernon", "Dudley", "Petunia", "Madge")), false);
        //    Madge
        //   Petunia
        //  Dudley
        // Vernon

        System.out.println(Arrays.asList("Vernon", "Dudley", "Petunia", "Madge"));

    }

    public static void print(ArrayList s){
        for (int i=0;i<=3;i++) {
            System.out.println(s.get(i));
        }
    }
    public static void print(String[] a) {
        for (int i = 0; i <= 4; i++) {
            System.out.print(a[i]);
        }
    }
    public static boolean isListsEqual(ArrayList s, ArrayList f){
        return s.equals(f);
    }
    public static boolean isEqual(String [] a, ArrayList s) {
        boolean tr=true;
        for (int i = 0; i <= 4; i++) {
            if (a[i] != s.get(i)) {
                tr = false;
                break;
            }
        }return tr;
    }
///////////////////
    public static void sayHello() {
       System.out.println("Hello Class!");
   }
    public static String hello() {
        return "Hello Engineers!";
    }
    public static String hello(String who) {
        return "Hello "+who;
    }
    public static String hello(int howMany) {
        if (howMany!=1 && howMany!=0)
            return "Hello to all " + howMany + " students!";
        else if (howMany==1)
            return "Hello student!";
        else
            return "No one came.";
    }
    public static String hello(int howMany, String whom) {
        if (howMany<=25)
            return "Hello to all " + howMany+" " + whom+"!";
        else
            return "Hello to all " + howMany+" " + whom+" !";
    }
    public static String hello(String[] str){
        String str1="";
        for (String aStr : str) {
            str1 = str1 + aStr + "";
        }

        return "Hello "+ str1+ "!";
    }
    public static String hello(List<String> c) {
        String c1 = "Hello ";
        for (int i = 0; i < c.size(); i++) {
            if (i == 0)
                c1 = c1 + c.get(i);
            else if (i == c.size() - 1)
                c1 = c1 + " and " + c.get(i) + "!";
            else
                c1 = c1 + ", " + c.get(i);
        }
        return c1;
    }

    public static void test(String expected, String actual ) {
          if (expected.equals(actual)) {
            System.out.println("Test PASSED.");
        } else {
              System.out.println("Test FAILED.");
              System.out.println("Expected: " + expected );
              System.out.println("Actual:   " + actual);
        }
    }
    public static void test(List expected, List actual ) {
        if (expected.equals(actual)) {
            System.out.println("Test PASSED.");
        } else {
            System.out.println("Test FAILED.");
            System.out.println("Expected: " + expected );
            System.out.println("Actual:   " + actual);
        }
    }
}
