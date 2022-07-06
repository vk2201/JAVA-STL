package com.javastl;

import java.util.*;

public class SetStl {
    public static void main(String[] args) {
        //implements set
        //duplicate element is not allowed ... don't maintain order
        //unordered so Hashset cant be sorted , ALL operation of set is in O(1)
        //for ordered LinkedHashSet()  and sorted TreeSet is used()  O(logN)
        Set<Character> hashSet = new HashSet<>();
        //.add(element)
        hashSet.add('b');
        hashSet.add('A');
        //.addAll(Collection)
        ArrayList<Character> arr = new ArrayList<>();
        arr.add('3');
        arr.add('v');
        hashSet.addAll(arr);
        System.out.println(hashSet);
        hashSet.remove('A');
        System.out.println(hashSet.contains('A'));
        System.out.println(hashSet.containsAll(arr));
        System.out.println(hashSet.size());
        System.out.println(hashSet.isEmpty());
      //  hashSet.clear();

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        //all methods are same
        for(Character element : hashSet) {
            System.out.println(element);
        }

        //Custom Set - Set for user defined class
        //for custom class to work set we need to override .equals and hashcode method in that class and toString method

        Set<Student> studentSet = new TreeSet<>();

    }
}
