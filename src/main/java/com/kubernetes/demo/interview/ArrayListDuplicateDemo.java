package com.kubernetes.demo.interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListDuplicateDemo {
    public static void main(String args[]){
    List<Integer> primes = new ArrayList<>();
    primes.add(2);
    primes.add(3);
    primes.add(5);
    primes.add(7); //duplicate
    primes.add(7);
    primes.add(11); // let's print arraylist with duplicate
    System.out.println("list of prime numbers : " + primes);

    Set<Integer> unique = new HashSet<>();
    unique.addAll(primes);
    System.out.println("list of unique prime numbers : " + unique);
}
}
