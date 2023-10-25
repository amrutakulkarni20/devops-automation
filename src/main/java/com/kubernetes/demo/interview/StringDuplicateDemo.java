package com.kubernetes.demo.interview;

import java.util.HashSet;
import java.util.Set;

public class StringDuplicateDemo {
    public static void main(String args[]){
        String inputString = "aabbccddeeffgg";
        StringBuilder resultBuilder = new StringBuilder();
        Set<Character> res = new HashSet<>();
        for (char c : inputString.toCharArray()) {
            if (res.add(c)) {
                resultBuilder.append(c);
            }
        }
        System.out.println("resultBuilder is : "+ resultBuilder.toString());
    }
}
