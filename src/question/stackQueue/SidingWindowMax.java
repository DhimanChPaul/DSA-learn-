package question.stackQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class SidingWindowMax {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans= new int[nums.length-k+1];
        Deque<Integer> dq= new ArrayDeque<>();
        int temp=0;

        for (int i = 0; i < nums.length; i++) {
//            System.out.println("queue: "+dq.iterator().toString());

            if(!dq.isEmpty() && dq.peek() == i-k){
                System.out.println("exede: "+dq.poll());
//                dq.poll();

            }
            while(!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]){
                System.out.println("smaller: "+dq.poll());
//                System.out.println(dq.peek());
//                dq.poll();

            }


            dq.offer(i);
            if(i >= k-1){
                ans[temp++] = nums[dq.peek()];
            }
            System.out.println(i +" val: "+nums[i]);
            System.out.println("peek: "+dq.peek());
            System.out.println("max: "+nums[dq.peek()]);
            System.out.println("..........");


        }
//        for (int i = 0; i < ans.length; i++) {
//            System.out.println(ans[i]);
//        }


        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,3,-1,-3,5,3,6,7};
        int[] ans=maxSlidingWindow(arr,3);
//        Stack<Integer,Integer> st= new Stack<>();
//        for (int i = 0; i < ans.length; i++) {
//            System.out.println(ans[i]);
//        }

    }
}



//import java.util.ArrayList;
//import java.util.Deque;
//import java.util.ArrayDeque;

//class GfG {
//
//    // Method to find the maximum for each
//    // and every contiguous subarray of size k.
//    static ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
//        int n = arr.length;
//
//        // to store the results
//        ArrayList<Integer> res = new ArrayList<Integer>();
//
//        // create deque to store max values
//        Deque<Integer> dq = new ArrayDeque<Integer>();
//
//        // Process first k (or first window) elements of array
//        for (int i = 0; i < k; ++i) {
//
//            // For every element, the previous smaller elements
//            // are useless so remove them from dq
//            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
//
//                // Remove from rear
//                dq.pollLast();
//            }
//
//            // Add new element at rear of queue
//            dq.addLast(i);
//        }
//
//        // Process rest of the elements, i.e., from arr[k] to arr[n-1]
//        for (int i = k; i < arr.length; ++i) {
//
//            // The element at the front of the queue is the largest
//            // element of previous window, so store it
//            res.add(arr[dq.peekFirst()]);
//
//            // Remove the elements which are out of this window
//            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
//
//                // Remove from front of queue
//                dq.pollFirst();
//            }
//
//            // Remove all elements smaller than the currently being
//            // added element (remove useless elements)
//            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
//                dq.pollLast();
//            }
//
//            // Add current element at the rear of dq
//            dq.addLast(i);
//        }
//
//        // store the maximum element of last window
//        res.add(arr[dq.peekFirst()]);
//
//        return res;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {1, 3, 2, 1, 7, 3};
//        int k = 3;
//        ArrayList<Integer> res = maxOfSubarrays(arr, k);
//        for (int maxVal : res) {
//            System.out.print(maxVal + " ");
//        }
//    }
//}
