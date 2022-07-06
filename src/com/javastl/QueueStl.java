package com.javastl;

import java.util.LinkedList;
import java.util.Queue;

public class QueueStl {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<Integer>();

        //.offer()  add element and return true if success else false
        //.add() also do same but throws exception in case task not successful
        queue.offer(23);
        queue.offer(27);
        queue.offer(255);

        //.poll() remove element from head (first ele) return null if empty queue
        //.remove() do same but throws exception if queue is empty
        System.out.println(queue.poll());

        //.peek()  gives first element at head
        //.element() do same but throw exception if empty
        System.out.println(queue.peek());
        System.out.println(queue.peek());


    }
}
