package question.linkl;

import Linklist.list1;

public class reverse {
    public static class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
    public static ListNode reverseList(ListNode head) {
        ListNode past= null;
        ListNode curr = head;
        ListNode next= curr.next;
        ListNode temp=head;
//        temp=temp.next;
        while(curr != null){
            curr.next=past;
            past=curr;
            curr=next;
            if (next != null){
                next=next.next;
            }

        }



//        displayr(curr);
//        System.out.println();
        displayr(past);
        System.out.println();
//        displayr(next);
        System.out.println(head.val);
        return temp;
    }
public static void displayr(ListNode head){

    if (head==null)return;
    System.out.print(head.val+" ");
    displayr(head.next);
}

    public static ListNode middleNode(ListNode head) {
        ListNode mid=head;
        ListNode last=mid.next;

        while(last != null){
            mid=mid.next;
            if (last.next== null){
                System.out.println(mid.val);
                return mid;
            }
            last=last.next.next;
        }
        System.out.println(mid.val);
        return mid;
    }
    public static void main(String[] args) {

        ListNode a= new ListNode(10);
        ListNode b= new ListNode(20);
        ListNode c= new ListNode(30);
        ListNode d= new ListNode(40);
        ListNode e= new ListNode(50);
//        ListNode f= new ListNode(60);
//        ListNode d = new ListNode();
        //10 20 30 40 50 60


        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
//        e.next=f;
//        reverseList(a);
middleNode(a);
//        displayr(a);

    }
}

