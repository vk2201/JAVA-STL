package com.javastl;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueStl {
    public static void main(String[] args) {

        //priority queue implements queue
        //by default min heap for max heap pass comprator function
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(233);
        pq.add(43);
        pq.add(87);
        pq.add(98);
        pq.add(4);

        System.out.println(pq);

        pq.remove();
        pq.remove(98);
        System.out.println(pq);
        System.out.println(pq.contains(23));

        //max heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        maxHeap.add(344);
        maxHeap.offer(456);
        maxHeap.poll();
    }
}
