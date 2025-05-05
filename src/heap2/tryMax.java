package heap2;

import java.util.Collections;
import java.util.PriorityQueue;

public class tryMax {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());

        pq.add(12);
        pq.add(1);
        pq.add(22);
        pq.add(5);
        pq.add(9);

        System.out.println(pq);
        while (!pq.isEmpty()) {
//            System.out.print(pq.peek()+" ");
//            pq.remove();
//            System.out.println();
            System.out.print(pq.poll() + " ");
        }


    }
}
