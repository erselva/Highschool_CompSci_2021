package com.test.compsci;

import java.util.Scanner;

public class FindString {

    public static void main (String[] args) {
        //String s1 = "racccccaaaaarrrrrcacarcacacacawca";
        //String s2 = "car";
        Scanner myInput = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter String 1");
        String s1 = myInput.nextLine();
        System.out.println("Enter String 2");
        String s2 = myInput.nextLine();

        System.out.println("Result using scan=" + findString1(s1,s2));
        System.out.println("Result using Substring()=" + findString1(s1,s2));
        System.out.println("Result String.contains()=" + s1.contains(s2));
    }

    //Find string by scanning the letters
    public static boolean findString(String s1, String s2) {
        if (s1 == null || s1.trim().equals("")){
            System.out.println("String s1 is null or blanks, please check");
            return false;
        }
        if (s2 == null || s2.trim().equals("")) {
            System.out.println("String s2 is null or blanks, please check");
            return false;
        }
        if (s1.length() < s2.length()) {
            System.out.println("String s1 is smaller than s2, please check");
            return false;
        }
        s1 = s1.trim().toLowerCase();
        s2 = s2.trim().toLowerCase();

        String foundString = "";
        int firstCharPos = 0;
        for (int i=0; i<s2.length();) {
            if (s2.equals(foundString) || firstCharPos >= s1.length())
                break;
            for (int j=firstCharPos; j< s1.length(); j++) {
                firstCharPos++; //0r1a2c3e4c5a6r7c8e
                //System.out.println(s2.charAt(i) + " " + s1.charAt(j));
                if (s2.charAt(i) == s1.charAt(j)) {
                    foundString += s2.charAt(i);
                    i++;
                    break;
                } else {
                    if (!foundString.equals("")) {
                        foundString = "";
                        firstCharPos--;
                        i=0;
                        break;
                    }
                }

            }
        }

        return s2.equals(foundString);
    }

    //Find string using Substring() function
    public static boolean findString1(String s1, String s2) {
        if (s1 == null || s1.trim().equals("")){
            System.out.println("String s1 is null or blanks, please check");
            return false;
        }
        if (s2 == null || s2.trim().equals("")) {
            System.out.println("String s2 is null or blanks, please check");
            return false;
        }
        if (s1.length() < s2.length()) {
            System.out.println("String s1 is smaller than s2, please check");
            return false;
        }
        s1 = s1.trim().toLowerCase();
        s2 = s2.trim().toLowerCase();

        int s2Len = s2.length();
        for (int i=0; i <= s1.length()-s2Len; i++) {
            String temp=s1.substring(i,i+s2Len);
            if (temp.equals(s2)) {
                return true;
            }
        }

        return false;
    }
}
