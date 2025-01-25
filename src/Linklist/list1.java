package Linklist;

public class list1 {

    public static void display(node head){
        node temp=head;
        while(temp!= null){
            System.out.print(temp.value+" -> ");
//            temp = temp.value;
            temp = temp.next;
        }
        System.out.println("null ");
    }
    public static void displayr(node head){

        if (head==null)return;
        System.out.print(head.value+" ");
        displayr(head.next);
    }

    public static class node{
        int value;
        node next;
        public node(int value){
            this.value=value;

        }
    }
    public static void main(String[] args){
        node a= new node(5);
        node b= new node(56);
        node c= new node(34);
//        a.value=5;
//        b.value=45;
        c.value=23;
        a.next=b;
        b.next=c;
       node head;
        display(a);
        displayr(a);




    }

}
