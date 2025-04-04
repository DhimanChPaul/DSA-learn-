package question.recursion;

import java.util.Stack;

public class sortStack {
    public static void actualSort(Stack<Integer> temp,int top){

        if (temp.isEmpty() || top>temp.peek()){
            temp.push(top);
            return;
        }
        int stTop= temp.pop();
        actualSort(temp,top);
        temp.push(stTop);
    }


    public static Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
//        Stack<Integer> st = new Stack<>();

        if (!s.isEmpty()){
            int top=s.pop();
            sort(s);
            actualSort(s,top);

        }
//        while()



        return s;
    }
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(41);
        st.push(3);
        st.push(32);
        st.push(2);
        st.push(11);

//        System.out.println(st.size());
//        System.out.println(st.get(3));

        st= sort(st);
        for (int i = 0; i < st.size(); i++) {
            System.out.println(st.get(i));
        }



    }
}
