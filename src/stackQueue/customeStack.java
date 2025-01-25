//package stackQueue;
//
//import java.util.Scanner;
//
//public class customeStack {
//  protected int []data;
//  public static final int defauleSize=10;
//  int ptr=-1;
//   public customeStack() {
//      this(defauleSize);
//   }
//       public customeStack(int size){
//
//       this.data= new int[size];
//       }
//       public boolean push(int item){
//
//       if (isFull()){
//           System.out.println("stack is full");
//           return false;
//       }
//       ptr++;
//       data[ptr]=item;
//       return true;
//       }
//       public int pop(){
//       if (isEmpty()){
////           throw new Exception("can not pop from empty stack");
//       }
//       }
//
//    private boolean isFull() {
//       return ptr== data.length-1;
//       // data is at last index
//    }
//    private  boolean isEmpty(){
//       return ptr== -1;
//    }
//
//
//}
