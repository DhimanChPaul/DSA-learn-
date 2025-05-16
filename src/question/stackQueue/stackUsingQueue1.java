package question.stackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class stackUsingQueue1 {
    public static void main(String[] args) {

    }
}
class MyStack {
Queue<Integer> qu= new LinkedList<>();


    public MyStack() {

    }

    public void push(int x) {
        qu.add(x);

    }

    public int pop() {
        if (!qu.isEmpty()){
            for (int i = 0; i < qu.size(); i++) {
                int size=qu.size();
                int temp=qu.poll();
                if (i==size-1){
                    return temp;
                }
                qu.add(temp);
            }
        }
    return 0;
    }

    public int top() {
        if (!qu.isEmpty()){
            for (int i = 0; i < qu.size(); i++) {
                int temp=qu.poll();
                qu.add(temp);
                if (i==qu.size()-1){
                    return temp;
                }

            }
        }
        return 0;
    }

    public boolean empty() {
        if (qu.isEmpty()){
            return true;
        }
    return false;
    }
}
