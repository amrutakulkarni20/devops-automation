package com.kubernetes.demo.interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionOfArrayLists {
    public static void main(String args[]){
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(5);
        list1.add(7);
        list1.add(5);
        list1.add(7);
        list1.add(2);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(5);
        list2.add(2);
        list2.add(6);

        List<Integer> result = unionWithoutDuplicates(list1, list2);

        System.out.println("Union of ArrayLists without duplicates: " + result);
    }

    private  static List<Integer> unionWithoutDuplicates(List<Integer> list1, List<Integer> list2) {
        List<Integer> finalList = new ArrayList<>();

        finalList.addAll(list1);
        finalList.addAll(list2);
        System.out.println("final of ArrayLists with duplicates: " + finalList);

        Set<Integer> uniqueSet = new HashSet<>();
        uniqueSet.addAll(finalList);
        System.out.println("final of set without duplicates: " + uniqueSet);
        List<Integer> uniqueList = new ArrayList<>(uniqueSet);
        return  uniqueList;
    }

}
