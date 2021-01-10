package com.test.compsci;

public class IBMComputer extends Computer{

    IBMComputer () { //default parameter
        //super(); //This must be first statement
        System.out.println("IBMComputer");
    }

    IBMComputer (double price) {
        System.out.println("IBMComputer price");
    }
}
