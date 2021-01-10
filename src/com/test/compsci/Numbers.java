package com.test.compsci;

public class Numbers {

    public static void main(String[] orgs) {

       print();
       printNum(true);
       printNum(false);
       printPyramid(5);

    }

    public static void print() {
        String value = "x";
        for (int i=0; i<5; i++) {
            for (int j=0; j<=i; j++)
                System.out.print(value + " ");
            System.out.println();
        }
    }

    public static void printNum(boolean count) {
        for (int i=0; i<5; i++) {
            for (int j=0; j<=i; j++) {
                if (count) {
                    System.out.print(j+1 + " ");
                } else {
                    System.out.print(i+1 + " ");
                }
            }
            System.out.println();
        }
    }

    public static void printPyramid(int max) {
        for (int i=1; i<=max; i++) {
            String num = "";
            for (int j=max; j>0; j--) {
                if (j <= i) {
                    num = num + " " + j;
                } else {
                    num = num + " " + " ";
                }
            }
            for (int j=2; j<=max; j++) {
                if (j <= i) {
                    num = num + " " + j;
                } else {
                    num = num + " " + " ";
                }
            }
            System.out.println(num);
        }
    }
}
