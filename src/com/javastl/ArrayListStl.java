package com.javastl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListStl {

    public static void main(String[] args) {
        System.out.println("gfdfgsd");
        Scanner sc = new Scanner(System.in);
        Integer val = sc.nextInt();
        System.out.println("val is " + val);

        //static array like array in c++;
        int arr[] = new int[20];

        for(int i=0; i<20; i++) {
            arr[i] = i;
        }
        for(int i=0; i<20; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(arr.length);

        //dynamic array extends list
        ArrayList<Integer> arrayList = new java.util.ArrayList<Integer>();

        //add()  TC-O(1)
        arrayList.add(29);
        arrayList.add(23);
        arrayList.add(24);
        arrayList.add(25);

        //TC-O(N)
        arrayList.add(2,34);

        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(41);
        newList.add(42);

        //addAll() TC-O(N)
        arrayList.addAll(newList);

        System.out.println(arrayList);
        System.out.println(arrayList.size());

        //remove() TC-O(N)
        arrayList.remove(1); //remove at index 1
        arrayList.remove(Integer.valueOf(25));  //remove 25 from list

        //clear()  clear all element of list
        newList.clear();

        //set() modify element at index
        // TC-O(1)
        arrayList.set(1,32);

        //get() return element at index 2
        //TC-O(1)
        System.out.println(arrayList.get(2));

        //.contains() return true if element is present
        //TC-O(1)
        boolean isElement = arrayList.contains(25);

        //.size()
        System.out.println(arrayList.size());

        //iterate in list
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i);
        }

        for (Integer i: arrayList) {
            System.out.print(i + " ");
        }
        System.out.println();

        Iterator<Integer> itr = arrayList.iterator();
        while (itr.hasNext())
            System.out.print(itr + " ");
        System.out.println();

    }

}
