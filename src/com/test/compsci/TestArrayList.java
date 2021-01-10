package com.test.compsci;

public class TestArrayList {

    public static void main(String[] args) {

        String[] names = {"Sri","Satvik","Bharath"};
        for (int i=0; i<names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println(ObjectSizeCalculator.getObjectSize(new HashMap<String, Integer>(100000)));
    }
}
