package Linklist;

import java.util.*;
import java.util.concurrent.DelayQueue;

public class stack1 {
    public static void main(String[] args) {
        Stack<Double> st=new Stack<>();
        st.push(34.76);
        st.push(45.67);
//        stack.push(55);
        System.out.println(st.pop());
        System.out.println(st.pop());
//        System.out.println(stack.pop());
        double a=23.87;
        System.out.println(a);

        Queue <Integer> queue= new LinkedList<>();
        queue.add(45);
        queue.add(5);
        queue.add(65);
        queue.add(4);
        System.out.println(queue.peek());

        System.out.println(queue.remove());
        System.out.println(queue.peek());
        System.out.println(queue.remove());

        Deque<Integer> de1= new ArrayDeque<>();
        de1.add(45);
        de1.add(55);
        de1.add(65);
        System.out.println(de1.removeFirst());

    }
}
