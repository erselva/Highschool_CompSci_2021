package com.test.compsci;

import java.util.Scanner;

public class NameSort {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Comma separated names:");
        String namesString = myInput.nextLine();

        String names[] = convertToArray(namesString);
        System.out.println("Names before sorting:");
        for (int i=0; i<names.length; i++) {
            System.out.println(names[i]);
        }

        names = sortNames(names);
        System.out.println("Names after sorting:");
        for (int i=0; i<names.length; i++) {
            System.out.println(names[i]);
        }
    }

    private static String[] convertToArray (String namesString) {
        if (namesString == null || namesString.trim().equals("")) {
            System.out.println("String namesString is null or blanks, please check");
            return null;
        }
        String[] temp= new String[100];
        String name = "";
        int count = 0;
        for (int i=0; i<namesString.length();i++) {
            if (namesString.charAt(i) == ',') {
                temp[count] = name.trim();
                name = "";
                count++;
            } else {
                name += namesString.charAt(i);
            }
        }
        if (!name.equals("")) {
            temp[count] = name.trim();
            count++;
        }
        String[] names = new String[count];
        for (int i=0; i<count; i++) {
            names[i] = temp[i];
        }
        return names;
    }

    private static String[] sortNames(String[] names) {
        if (names == null || names.length == 0) {
            System.out.println("String array names is null or empty, please check");
            return names;
        }

        String temp="";
        for (int i=0; i<names.length; i++) {
            for (int j=1; j < names.length; j++) {
                if (names[i].compareTo(names[j]) > 0)
                {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        return names;
    }
}
