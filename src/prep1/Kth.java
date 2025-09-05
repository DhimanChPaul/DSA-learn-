package prep1;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Kth {

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        System.out.println("3rd Smallest: " + kthSmallest(arr, k)); // 7
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
//        System.out.println("3rd Largest: " + kthLargest(arr, k));
    }

//    private static String kthLargest(int[] arr, int k) {
//        PriorityQueue<String> pq= new PriorityQueue<>();
//
//    }

    private static Integer kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for (int a: arr){
            pq.add(a);
            if (pq.size()> k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}
