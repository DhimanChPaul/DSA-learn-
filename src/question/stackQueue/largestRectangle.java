package question.stackQueue;

import java.util.Stack;

public class largestRectangle {
//    public static int largestRectangleArea(int[] heights) {
//        int max=0;
//        int []lMin=new int[heights.length];
//        int []rMin=new int[heights.length];
//        Stack<Integer> st= new Stack<>();
//        for (int i = 0; i < heights.length; i++) {
//
//        }
//        return max;
//    }
    static int largestRectangleArea(int[] histo) {
        Stack < Integer > st = new Stack < > ();
        int maxA = 0;
        int n = histo.length;
        for (int i = 0; i <= n; i++) {
            while (!st.empty() && (i == n || histo[st.peek()] >= histo[i])) {
                int height = histo[st.peek()];
                st.pop();
                int width;
                if (st.empty())
                    width = i;
                else
                    width = i - st.peek() - 1;
                maxA = Math.max(maxA, width * height);
            }
            st.push(i);
        }
        return maxA;
    }
    public static void main(String[] args) {
        int[] height ={2,1,5,6,5,4,2,7};
        int a=largestRectangleArea(height);
        System.out.println(a);
    }
}
