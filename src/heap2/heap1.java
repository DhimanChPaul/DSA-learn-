package heap2;

import java.util.ArrayDeque;
import java.util.*;
import java.util.PriorityQueue;

public class heap1 {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq= new PriorityQueue<>();

        pq.add(34);
        pq.add(12);
        pq.add(20);

        System.out.println(pq.peek());


        Deque<Integer> dq = new ArrayDeque<Integer>();

        dq.add(45);
        dq.add(96);
        dq.add(5);
        dq.add(34);

        System.out.println(dq.peek());
        System.out.println(dq.iterator());
        for (Iterator itr = dq.iterator();
             itr.hasNext();) {
            System.out.print(itr.next() + " ");
        }
    }
}
