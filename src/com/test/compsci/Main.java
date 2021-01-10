package com.test.compsci;

public class Main {

    Main() {
        System.out.println("Main() default constructor");
    }

    public static void main(String[] args) {
	    //System.out.println("Hello Main class");

	    IBMComputer ibmComputer = new IBMComputer(20);
	    //Main main = new Main();
    }
}
