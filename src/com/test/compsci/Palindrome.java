package com.test.compsci;

public class Palindrome {

    public static void main(String args[]) {
        //Finnish 19-letter word saippuakivikauppias (a soapstone vendor), is the world's longest palindromic word in everyday use
        String name = "saippuakivikauppias";
        System.out.println("Is Palindrome? = " + isPalindrome(name));
    }

    public static boolean isPalindrome (String name) {
        if (name == null || name.trim().equals(""))
            return false;
        else
            name = name.trim().toLowerCase();
        boolean palindrome = false;
        for (int i=0; i<name.length()/2; i++) {
            if (name.charAt(i) != name.charAt(name.length()-1-i)) {
                palindrome = false;
                break;
            } else {
                palindrome = true;
            }
        }
        return palindrome;
    }
}
