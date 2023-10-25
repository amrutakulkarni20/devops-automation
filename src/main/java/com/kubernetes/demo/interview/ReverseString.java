package com.kubernetes.demo.interview;

public class ReverseString {

    public static void main(String args[]){

        String inputString = "aturma";

        String outputString = reverseInputString(inputString);
        System.out.print("Revers String is " +outputString);
    }

    private static String reverseInputString(String inputString) {
        StringBuilder reversedStringBuilder = new StringBuilder(inputString);
        reversedStringBuilder.reverse();

        return reversedStringBuilder.toString();
    }

}
