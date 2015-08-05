package com.company;

public class WarmUp1 {
    public static void main(String[] args) {

        System.out.println("-----sleepIn --------");
        System.out.println(sleepIn(false, false));
        System.out.println(sleepIn(true, false));
        System.out.println(sleepIn(false, true));
        System.out.println(sleepIn(true, true));

        System.out.println("-----monkeyTrouble--------");
        System.out.println(monkeyTrouble(false, false));
        System.out.println(monkeyTrouble(true, false));
        System.out.println(monkeyTrouble(false, true));
        System.out.println(monkeyTrouble(true, true));

        System.out.println("-----sumDouble --------");
        System.out.println(sumDouble(1, 2));
        System.out.println(sumDouble(3, 2));
        System.out.println(sumDouble(2, 2));
        System.out.println(sumDouble(-1, 2));

        System.out.println("-----diff21 --------");
        System.out.println(diff21(19));
        System.out.println(diff21(10));
        System.out.println(diff21(21));
        System.out.println(diff21(30));

        System.out.println("-----parrotTrouble --------");
        System.out.println(parrotTrouble(true, 6));
        System.out.println(parrotTrouble(true, 7));
        System.out.println(parrotTrouble(false, 6));
        System.out.println(parrotTrouble(false, 12));

        System.out.println("-----makes10--------");
        System.out.println(makes10(9, 10));
        System.out.println(makes10(9, 9));
        System.out.println(makes10(5, 5));
        System.out.println(makes10(12, -2));

        System.out.println("-----nearHundred--------");
        System.out.println(nearHundred(110));
        System.out.println(nearHundred(-93));
        System.out.println(nearHundred(89));
        System.out.println(nearHundred(189));

        System.out.println("-----posNeg --------");
        System.out.println(posNeg(1, -1, false));
        System.out.println(posNeg(-1, 1, false));
        System.out.println(posNeg(1, -1, true));
        System.out.println(posNeg(-1, 1, true));

        System.out.println("-----notString  --------");
        System.out.println(notString("candy"));
        System.out.println(notString("x"));
        System.out.println(notString("not bad"));
        System.out.println(notString("no") );

        System.out.println("-----missingChar  --------");
        System.out.println(missingChar("kitten", 1));
        System.out.println(missingChar("kitten", 0));
        System.out.println(missingChar("kitten", 4));
        System.out.println(missingChar("chocolate", 8) );

        System.out.println("-----frontBack  --------");
        System.out.println(frontBack("code"));
        System.out.println(frontBack("a"));
        System.out.println(frontBack("ab"));
        System.out.println(frontBack("Chocolate"));

        System.out.println("-----front3  --------");
        System.out.println(front3("Java"));
        System.out.println(front3("Chocolate"));
        System.out.println(front3("abc"));
        System.out.println(front3(""));

        System.out.println("----- backAround  --------");
        System.out.println(backAround("cat"));
        System.out.println(backAround("Hello"));
        System.out.println(backAround("a"));
        System.out.println(backAround("boo"));

        System.out.println("----- or35  --------");
        System.out.println(or35(3));
        System.out.println(or35(10));
        System.out.println(or35(8));
        System.out.println(or35(7));

        System.out.println("----- front22  --------");
        System.out.println(front22("kitten"));
        System.out.println(front22("Ha"));
        System.out.println(front22("abc"));
        System.out.println(front22("a"));

        System.out.println("----- startHi --------");
        System.out.println(startHi("hi there"));
        System.out.println(startHi("hi"));
        System.out.println(startHi("hello hi"));
        System.out.println(startHi("h"));

        System.out.println("----- startHi --------");
        System.out.println(startHi("hi there"));
        System.out.println(startHi("hi"));
        System.out.println(startHi("hello hi"));
        System.out.println(startHi("h"));

        System.out.println("----- icyHot --------");
        System.out.println(icyHot(120, -1));
        System.out.println(icyHot(-1, 120));
        System.out.println(icyHot(2, 120));
        System.out.println(icyHot(-2, -2));

        System.out.println("----- in1020 --------");
        System.out.println(in1020(12, 99));
        System.out.println(in1020(21, 12));
        System.out.println(in1020(2, 120));
        System.out.println(in1020(8, 99));

        System.out.println("----- hasTeen --------");
        System.out.println(hasTeen(13, 20, 10));
        System.out.println(hasTeen(20, 19, 10));
        System.out.println(hasTeen(20, 20, 13));
        System.out.println(hasTeen(4, 2, 20));

        System.out.println("----- loneTeen --------");
        System.out.println(loneTeen(13, 99));
        System.out.println(loneTeen(21, 19));
        System.out.println(loneTeen(13, 13));
        System.out.println(loneTeen(25, 35));

        System.out.println("-----loneTeen   --------");
        System.out.println(loneTeen(13, 99));
        System.out.println(loneTeen(21, 19));
        System.out.println(loneTeen(13, 13));
        System.out.println(loneTeen(16, 18));

        System.out.println("-----delDel  --------");
        System.out.println(delDel("adelbc"));
        System.out.println(delDel("adelHello"));
        System.out.println(delDel("adedbc"));
        System.out.println(delDel("a"));

        System.out.println("-----mixStart   --------");
        System.out.println(mixStart("mix snacks") );
        System.out.println(mixStart("pix snacks"));
        System.out.println(mixStart("piz snacks"));
        System.out.println(mixStart("a"));

        System.out.println("-----startOz    --------");
        System.out.println(startOz("ozymandias snacks") );
        System.out.println(startOz("bzoo snacks"));
        System.out.println(startOz("oxx snacks"));
        System.out.println(startOz("az"));

        System.out.println("-----intMax    --------");
        System.out.println(intMax(1, 2, 3) );
        System.out.println(intMax(1, 3, 3));
        System.out.println(intMax(3, 2, 1));
        System.out.println(intMax(1, 2, 10));

        System.out.println("-----close10    --------");
        System.out.println(close10(8, 13));
        System.out.println(close10(13, 8));
        System.out.println(close10(13, 7));
        System.out.println(close10(8, 1));

        System.out.println("-----in3050     --------");
        System.out.println(in3050(30, 31));
        System.out.println(in3050(30, 41));
        System.out.println(in3050(40, 50));
        System.out.println(in3050(8, 1));

        System.out.println("-----max1020      --------");
        System.out.println(max1020(11, 19));
        System.out.println(max1020(19, 11));
        System.out.println(max1020(11, 9));
        System.out.println(max1020(8, 1));

        System.out.println("-----stringE     --------");
        System.out.println(stringE("Hello"));
        System.out.println(stringE("Heelle"));
        System.out.println(stringE("Heelele"));
        System.out.println(stringE("e") );

        System.out.println("-----lastDigit      --------");
        System.out.println(lastDigit(7, 17));
        System.out.println(lastDigit(6, 17));
        System.out.println(lastDigit(3, 113));
        System.out.println(lastDigit(17, 117));

        System.out.println("-----lastDigit      --------");
        System.out.println(endUp("Hello"));
        System.out.println(endUp("hi there"));
        System.out.println(endUp("hi") );
        System.out.println(endUp("woo hoo"));

    }

    //The parameter weekday is true if it is a weekday, and the parameter vacation
    // is true if we are on vacation. We sleep in if it is not a weekday or we're
    // on vacation. Return true if we sleep in.
    public static boolean sleepIn(boolean weekday, boolean vacation) {

        if (!weekday || vacation) {
            return true;
        }
        return false;
    }
    //We have two monkeys, a and b, and the parameters aSmile and
    // bSmile indicate if each is smiling. We are in trouble
    // if they are both smiling or if neither of them is smiling.
    // Return true if we are in trouble.
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if ((aSmile==true && bSmile==true) || (aSmile==false && bSmile==false)) {
            return true;
        }
        else return false;
    }
    //Given two int values, return their sum. Unless the two values are the same,
    // then return double their sum.
    public static int sumDouble(int a, int b) {
        if (a==b){
            return (a+b)*2;
        }
        else return a+b;
    }
    //Given an int n, return the absolute difference between n and 21,
    // except return double the absolute difference if n is over 21.
    public static int diff21(int n) {
        if (n>21) {
            return  Math.abs(21 - n)*2;
        }
        else {
            return 21-n;
        }
    }
    //We have a loud talking parrot. The "hour" parameter is the current hour
    // time in the range 0..23. We are in trouble if the parrot is talking
    // and the hour is before 7 or after 20. Return true if we are in trouble.
    public static boolean parrotTrouble(boolean talking, int hour) {
        if (((hour<7) || (hour>20))&& (talking==true)){
            return true;
        }
        else return false;
    }
    //Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
    public static boolean makes10(int a, int b) {
        if ((a==10)||(b==10)||(a+b==10)){
            return true;
        }
        else return false;
    }
    //Given an int n, return true if it is within 10 of 100 or 200.
    // Note: Math.abs(num) computes the absolute value of a number.
    public static boolean nearHundred(int n) {
        if (((n>=90)&&(n<=110))||((n>=190)&&(n<=210))){
            return true;
        }
        else return false;
    }
    //Given 2 int values, return true if one is negative and one is positive.
    // Except if the parameter "negative" is true, then return true only
    // if both are negative.
    public static boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            if ((a<0)&&(b<0))
                return true;
            else
                return false;
        }
        else {
            if (((a>0)&&(b<0))||((a<0)&&(b>0)))
                return true;
            else
                return false;
        }
    }
    //Given a string, return a new string where "not " has been added to the front.
    // However, if the string already begins with "not", return the string unchanged.
    // Note: use .equals() to compare 2 strings.
    public static String notString(String str) {
        if (str.substring(0, (str.length()<=3)?str.length():3).equals("not"))
            //if (str.length() >= 3 && str.substring(0, 3).equals("not"))
            return str;
        else
            return ("not "+str);
    }
    //Given a non-empty string and an int n, return a new string where the
    // char at index n has been removed. The value of n will be a valid index of a
    // char in the original string (i.e. n will be in the range 0..str.length()-1
    // inclusive).
    public static String missingChar(String str, int n) {
        if (n==0)
            return str.substring(1);
        else
            return (str.substring(0,n)+str.substring(n+1));
    }
    //Given a string, return a new string where the first and last chars have
    // been exchanged.
    public static String frontBack(String str) {
        if ((str.length() >= 2) && (str != "")) {
            char first = str.charAt(0);
            char last = str.charAt(str.length() - 1);
            str = last + str.substring(1, str.length() - 1) + first;
        }
        return str;
    }
    //Given a string, we'll say that the front is the first 3 chars of the string.
    // If the string length is less than 3, the front is whatever is there.
    // Return a new string which is 3 copies of the front.
    public static String front3(String str) {
        if (str.length() > 3)
            str = str.substring(0, 3);
        return str+str+str;
    }
    //Given a string, take the last char and return a new string with the last char
    // added at the front and back, so "cat" yields "tcatt". The original string
    // will be length 1 or more.
    public static String backAround(String str) {
        String last = str.substring(str.length() - 1);
        return last + str + last;
    }
    // Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
    //Use the % "mod" operator -- see Introduction to Mod
    public static boolean or35(int n) {
        return ((n % 3==0)||(n % 5==0));
    }
    // Given a string, take the first 2 chars and return the string with the 2 chars
    // added at both the front and back, so "kitten" yields"kikittenki". If the string
    // length is less than 2, use whatever chars are there.
    public static String front22(String str) {
        String first="";
        if ((str.length() >2) && (!str.equals(""))) {
            first = str.substring(0, 2);
            return (first+str+first);
        }
        else return str+str+str;
    }
    // Given a string, return true if the string starts with "hi" and false otherwise.
    public static boolean startHi(String str) {
        if ((str.length() >=2) && (!str.equals(""))&&(str.substring(0, 2).equals("hi"))) {
            return true;
        }
        else return false;
    }
    //Given two temperatures, return true if one is less than 0 and the other is greater than 100.
    public static boolean icyHot(int temp1, int temp2) {
        if (((temp1<0 ) && (temp2>100))||((temp2<0 ) && (temp1>100))) {
            return true;
        }
        else return false;
    }
    // Given 2 int values, return true if either of them is in the range 10..20 inclusive.
    public static boolean in1020(int a, int b) {
        if (((a>=10 ) && (a<=20))||((b>=10 ) && (b<=20))) {
            return true;
        }
        else return false;
    }
    // We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values,
    // return true if 1 or more of them are teen.
    public static boolean hasTeen(int a, int b, int c) {
        return ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)|| (c >= 13 && c <= 19));
    }
    //We'll say that a number is "teen" if it is in the range 13..19 inclusive.
    // Given 2 int values, return true if one or the other is teen, but not both.
   /* public static boolean loneTeen(int a, int b) {
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);
        return (aTeen && !bTeen) || (!aTeen && bTeen);
    }*/

    //We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int
    // values, return true if one or the other is teen, but not both.
    public static boolean loneTeen(int a, int b) {

        return (((a>=13 && a<=19) && !(b>=13 && b<=19))||((!(a>=13 && a<=19) && (b>=13 && b<=19))))?true:false;
       /* if (((a>=13 && a<=19) && !(b>=13 && b<=19))||((!(a>=13 && a<=19) && (b>=13 && b<=19))))
            return true;
        else return false;*/
       /* if (((a >= 13) && (a <= 19)) && ((b >= 13) && (b <= 19))) {
            return false;
        }
        else {
            if (((a>=13) && (a<=19))||((b>=13 ) && (b<=19))){
                return true ;
            }
            else
                return (((a>19) && (a<13))&&((b>19 ) && (b<13)));
        }*/
    }
    /*public boolean loneTeen(int a, int b) {
        // Store teen-ness in boolean local vars first. Boolean local
        // vars like this are a little rare, but here they work great.
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);

        return (aTeen && !bTeen) || (!aTeen && bTeen);
        // Translation: one or the other, but not both.
        // Alternately could use the Java xor operator, but it's obscure.
    }*/
    //Given a string, if the string "del" appears starting at index 1, return a string
    // where that "del" has been deleted. Otherwise, return the string unchanged.
    public static String delDel(String str) {
        if (str.length()>=4 && str.substring(1, 4).equals("del"))
            return str.substring(0, 1) + str.substring(4);
        else return str;
    }
    // Return true if the given string begins with "mix", except the 'm' can be anything,
    // so "pix", "9ix" .. all count.
    public static boolean mixStart(String str) {
        if (str.length()>=3 && str.substring(1, 3).equals("ix"))
            return true;
        else return false;
    }
    //Given a string, return a string made of the first 2 chars (if present),
    // however include first char only if it is 'o' and include the second only
    // if it is 'z', so "ozymandias" yields "oz".
    public static String startOz(String str) {
        String result = "";
        if (str.length() >= 1 && str.charAt(0)=='o') {
            result = result + str.charAt(0);
        }
        if (str.length() >= 2 && str.charAt(1)=='z') {
            result = result + str.charAt(1);
        }
        return result;
    }
    // Given three int values, a b c, return the largest.
    public static  int intMax(int a, int b, int c) {
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
    //Given 2 int values, return whichever value is nearest to the value 10,
    // or return 0 in the event of a tie. Note that Math.abs(n) returns the
    // absolute value of a number.
    public static int close10(int a, int b) {
        int a1=Math.abs(10-a);
        int b1=Math.abs(10-b);
        int c=0;
        if (a1>b1)
            return b;
        else {
            if (a1==b1)
                return c;
        }
        return a;
    }
    //Given 2 int values, return true if they are both in the range 30..40 inclusive,
    // or they are both in the range 40..50 inclusive.
    public static boolean in3050(int a, int b) {
        boolean boola=(a>=40)&&(a<=50);
        boolean boolb=(b>=40)&&(b<=50);
        boolean boola1=(a>=30)&&(a<=40);
        boolean boolb1=(b>=30)&&(b<=40);
        if (boola && boolb)
            return true;
        if (boola1 && boolb1)
            return true;
        else return false;
    }
    // Given 2 positive int values, return the larger value that is in the range 10..20
    // inclusive, or return 0 if neither is in that range.
    public static int max1020(int a, int b) {
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;
        return 0;
    }
    //Return true if the given string contains between 1 and 3 'e' chars.
    public static boolean stringE(String str) {
        int count = 0;
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == 'e') count++;
            // alternately: str.substring(i, i+1).equals("e")
        }
        return (count >= 1 && count <= 3);
    }
    //Given two non-negative int values, return true if they have the same last digit,
    // such as with 27 and 57. Note that the % "mod" operator computes remainders,
    // so 17 % 10 is 7.
    public static boolean lastDigit(int a, int b) {
        if ((a % 10) ==(b%10))
            return  true;
        else
            return false;
    }
    //Given a string, return a new string where the last 3 chars are now in upper case.
    // If the string has less than 3 chars, uppercase whatever is there. Note that
    // str.toUpperCase() returns the uppercase version of a string.
    public static String endUp(String str) {
        if (str.length() >= 3)
            return
                    str.substring(0, str.length() - 3) + str.substring(str.length() - 3, str.length()).toUpperCase();
        else
            return str.toUpperCase();
    }
}





