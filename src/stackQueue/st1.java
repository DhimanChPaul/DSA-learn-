package stackQueue;

import java.util.Stack;

class queueUsingStack{
      Stack<Integer> first= new Stack<>();
      Stack<Integer> second= new Stack<>();

//      void queueUsingStack(){
//            first=new Stack<>();
//            second=new Stack<>();
//      }
      public void add(int item){
           first.push(item);

      }
      public int remove(){
            while (!first.isEmpty()){
                  second.push(first.pop());
            }
            int re=second.pop();
            while(!second.isEmpty()){
                  first.push(second.pop());
            }
           return re;
      }
      public int top(){
            while (!first.isEmpty()){
                  second.push(first.pop());
            }
            int temp=second.peek();
            while(!second.isEmpty()){
                  first.push(second.pop());
            }
            return temp;
      }
}

public class st1 {
      public static void main(String[] args) {
//            Stack<Integer> st= new Stack<>();
//            st.push(5);
//            st.push(8);
//            System.out.println(st.peek());
//            System.out.println(st.size());
//            st.pop();
//            System.out.println(st.peek());
//            System.out.println(st.size());
            queueUsingStack qs=new queueUsingStack();
            qs.add(45);
            qs.add(55);
            qs.add(65);
            System.out.println(qs.top());
            System.out.println(qs.remove());
            System.out.println(qs.remove());


      }
}
