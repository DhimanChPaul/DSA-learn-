package question.heapQ;

//import question.linkl.reverse;

import java.util.PriorityQueue;

public class mergeList {
    public static class ListNode {
        int val;
       ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode ans= new ListNode(0);
        ListNode temp= ans;
         ans.val=12;
         int len= lists.length;
        System.out.println(lists.length);
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)-> a.val-b.val);
        for (ListNode list: lists){
            pq.offer(list);

        }
        while (pq.isEmpty()){
            ListNode curr=pq.poll();
            temp.next=curr;
            temp=curr;
            if(curr.next != null){
                pq.offer(curr);
            }
        }
        return ans.next;
    }
    public static void main(String[] args) {

    }
}
