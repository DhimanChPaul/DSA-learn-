package heap2;

import java.util.PriorityQueue;

public class maxAndMin {

        static void kth_Largest_MaxHeap(int[] arr, int k) {

            PriorityQueue<Integer>pq= new PriorityQueue<>((a,b)->b-a);

            int n = arr.length  ;

//            for (int i = 0; i < arr.length; i++) {
//                pq.add(arr[i])  ;
//            }
            for (int j : arr) {
                pq.add(j);
            }

            int f = k - 1 ;

            while (f > 0) {
                System.out.println(pq.remove());
//                pq.remove()  ;
                f-- ;
            }

            System.out.println("Kth Largest element "+pq.peek())  ;
        }

        static void kth_Smallest_MinHeap(int[] arr, int k) {

            PriorityQueue<Integer> pq= new PriorityQueue<>();
            int n = arr.length  ;

            for (int j : arr) {
                pq.add(j);
            }

            int f = k - 1 ;

            while (f > 0) {
                System.out.println(pq.remove());
                f-- ;
            }

            System.out.println("Kth Smallest element "+pq.peek())  ;
        }

        public static void main(String args[]) {

            int[] arr = {1, 2, 6, 4, 5, 3,10,7,12,14}  ;

            kth_Largest_MaxHeap(arr, 4)  ;
            kth_Smallest_MinHeap(arr, 4)  ;
        }

}
