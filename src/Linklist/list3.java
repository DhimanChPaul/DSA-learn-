package Linklist;

public class list3 {
    public static class linklist{
        Node head=null;
        Node tail=null;
        int size;
        linklist(){
            this.size=0;
        }
        void insertFirst(int val){
            Node temp= new Node(val);
            size+=1;
            if(head==null){
                head=tail=temp;
            }
            else {
                temp.next=head;
                head=temp;
            }
        }
        void insertLast(int val){
            Node temp= new Node(val);
            size+=1;
            if (tail==null){
                head=tail=temp;
            }
            else {
                tail.next=temp;
                tail=temp;
            }
        }
        void insert(int index, int val){
            Node temp=new Node(val);
            Node t=head;
            size+=1;
            if (index==0){
                temp.next=head;
                head=temp;
            }
            else if (index==size){
                tail.next=temp;
                tail=temp;
            }
            else {
                for (int i = 0; i < index-1; i++) {
                t=t.next;
                }
                temp.next=t.next;
                t.next=temp;
            }

        }
        void deletFirst(){
            head=head.next;
            size-=1;
        }
        void deletLast(){
            Node temp=head;
            for (int i = 1; i <size-1; i++) {
                temp=temp.next;
            }
            temp.next=null;
            tail=temp;
            size-=1;
        }
        void delet(int index){
            if(index==0)deletFirst();
            else if (index==size-1) {
                deletLast();
            }
            else {
                Node temp = head;
                size -= 1;
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
            }
        }

        int getElement(int index){
            Node temp= head;
            for (int i = 0; i < index; i++) {
                temp=temp.next;
            }
            return temp.data;
        }
        void display(){
            Node temp=head;
            while (temp!= null){
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.println("null");
        }
    }

    public static class Node{
        int data;
        Node next;
        public Node(int data){
         this.data=data;
        }
    }
    public static void main(String[] args) {
        linklist ll= new linklist();
        ll.insertFirst(4);

        ll.insertLast(5);

        ll.insertFirst(2);

        ll.insertLast(6);

        ll.insert(1,3);

        ll.insert(0,1);
        System.out.println(ll.size);
        ll.insert(6,7);
        System.out.println(ll.size);
        System.out.println(ll.tail.data);
//assert new
        ll.display();
//
        ll.deletLast();
        ll.display();
        System.out.println(ll.head.data);
        System.out.println(ll.tail.data);
        ll.delet(5);
        ll.display();
        System.out.println(ll.tail.data);
        ll.delet(0);
        ll.display();
        System.out.println(ll.head.data);
        System.out.println("at index 3 val is ->" +ll.getElement(3));
    }
}
