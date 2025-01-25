package Linklist;

public class list2 {


    public static class LinkList{
        Node head=null;
        Node tail=null;
//        int size= size();
//
        void insertAtFirst(int  val){
            Node temp=new Node(val);
//            size=+1;
            if (head== null){
                head=tail=temp;
                return;
            }
            temp.next=head;
            head=temp;

        }
        void insertAtLast(int val){
            Node temp=new Node(val);
            if (tail==null){
                tail=head=temp;
                return;
            }
            tail.next=temp;
            tail=temp;

        }
         void insertAt(int index,int val){
            Node temp=new Node(val);
            Node t= head;

            if (index==0){
                insertAtFirst(val);
             }
            else if (index == size()+1) {
                insertAtLast(val);
            }

            else {
                for (int i = 0; i < index - 1; i++) {
                    t=t.next;
                }
                t.next=temp;

        }
        }
        int size(){
           Node temp=head;
           int count=0;
            while(temp!= null){
                count++;
                temp=temp.next;
            }
            return count;
        }
                public void display() {
                    Node temp = head;
                    while (temp != null) {
                        System.out.print(temp.data + " -> ");
                        temp = temp.next;
                    }
                    System.out.println("NULL");
                }

    }

    public static class Node{
        int data;
        Node next;
        public  Node(int data)
        {

            this.data=data;
        }
    }

    public static void main(String[] args) {
        LinkList ll1 = new LinkList();

        ll1.insertAtLast(6);
        ll1.insertAtLast(7);

        ll1.insertAtFirst(4);
        ll1.insertAtFirst(3);
        ll1.display();
        System.out.println( "size is "+ll1.size());  
        ll1.insertAt(2,5);
        ll1.display();

        System.out.println( "size is "+ll1.size());
        ll1.insertAt(0,2);
        ll1.display();
        System.out.println( "size is "+ll1.size());
        ll1.insertAt(6,8);
//

        ll1.display();
//


        System.out.println(ll1.size());

//        System.out.println(ll1.getElement(3));
    }
}
