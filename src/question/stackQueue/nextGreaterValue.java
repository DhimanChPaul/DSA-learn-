package question.stackQueue;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class nextGreaterValue {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];
        Stack<Integer> st= new Stack<>();
        Map<Integer,Integer> map= new HashMap<>();

        for (int j = nums2.length-1; j >=0 ; j--) {
            while(!st.isEmpty() && st.peek()<nums2[j]){
                st.pop();
            }
            if(!st.isEmpty())
                map.put(nums2[j], st.peek());
            st.push(nums2[j]);
        }

        System.out.println(map.entrySet());


        for (int i = 0; i < nums1.length; i++) {
            arr[i] = map.getOrDefault(nums1[i], -1);
        }
        for (int j : arr) {
            System.out.print(j+" ");
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] nums1={6,1,3,2};
        int[] nums2= {1,4,3,6,2};
        nextGreaterElement(nums1,nums2);
    }
}
