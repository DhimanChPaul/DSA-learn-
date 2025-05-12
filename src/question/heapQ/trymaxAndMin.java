package question.heapQ;

import java.util.PriorityQueue;

public class trymaxAndMin {
    public static void main(String[] args) {
        PriorityQueue<Integer> smallVal = new PriorityQueue<>((a, b)->b-a);
        PriorityQueue<Integer> maxVal = new PriorityQueue<>();

        smallVal.offer(1);
        smallVal.offer(4);
        smallVal.offer(2);
        smallVal.offer(3);

        maxVal.offer(1);
        maxVal.offer(4);
        maxVal.offer(2);
        maxVal.offer(3);
        for (int i = 0; i < smallVal.size(); i++) {
            System.out.println(smallVal.poll());
        }
        System.out.println("...........");
//        for (int i = 0; i < maxVal.size(); i++) {
//            System.out.println(maxVal.poll());
//        }
    }
}
