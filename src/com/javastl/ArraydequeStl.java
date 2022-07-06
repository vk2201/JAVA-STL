package com.javastl;

import java.util.ArrayDeque;

public class ArraydequeStl {
    public static void main(String[] args) {

        //ArrayDeque implements deq and deq implements queue
        //ArrayDeque  subclass of queue so by default contains all method of queue can also be used to implement stack
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();

        // TC - O(1)
        deque.offer(23);
        deque.offer(25);
        deque.offerLast(256);
        deque.offerFirst(23234);
        deque.push(98);

        System.out.println(deque);

        System.out.println(deque.peek());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        //.contains(Element)
        System.out.println(deque);
        System.out.println(deque.contains(25));

        //.containsAll(Object o);
        //return true if all element is present at least once order is not imp
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offer(23);
        dq.offerLast(98);
        dq.offerFirst(256);
        dq.offerFirst(23);

        System.out.println(deque.containsAll(dq));

        deque.poll();
        deque.pollFirst();
        deque.pollLast();

    }
}
