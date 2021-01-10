package com.test.compsci;

import java.util.ArrayList;
import java.util.List;

public class RearrangeArray {

    public static void main(String[] orgs) {

        int[] list = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32};
        int[] listOut = list.clone();

        String in = "";
        String out = "";
        while (in.equals(out)) {
            in = getAsString(listOut);
            listOut = rearrange(listOut);
            out = getAsString(listOut);
            System.out.println("in=" + in + ";out=" + out);
            //break;
        }
    }

    public static int[] rearrange(int[] list) {

        for (int i=0; i<=list.length-3; i++) {
            int current = list[i];
            int next = list[i+1];
            int third = list[i+2];
            if ((current + next) == third) {
                int temp = list[i+2];
                list[i+2] = list[i+3];
                list[i+3] = temp;
            }
        }
        return list;
    }

    public static String getAsString(int[] list) {
        String out = "";
        for (int i=0; i<list.length; i++) {
            out = out + list[i];
        }
        return out;
    }
}
