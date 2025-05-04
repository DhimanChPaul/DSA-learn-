package question.linkl;


import java.util.Stack;

public class reverse {
    public static class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

    public boolean isPalindromeStack(ListNode head) {

        Stack<Integer> st = new Stack<>();
        ListNode temp=head;

        while( temp != null){
            st.push(temp.val);
            temp=temp.next;

        }

        while(!st.empty()){
            // System.out.println("val "+ head.val);
            // System.out.println("peek "+st.peek());
            assert head != null;
            if(head.val != st.pop()){
                return false;
            }
            head=head.next;
        }
        return true;


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
        return past;
//        System.out.println();
////        displayr(next);
//        System.out.println(head.val);
//        return temp;
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
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp= head;
        ListNode temp2= head;
        int len=0;
        while(temp != null){
            temp=temp.next;
            len++;
        }
        System.out.println(len);
        System.out.println(head.val);
        for (int i = 0; i < len; i++) {
            if (n==len){
                temp2=temp2.next;
                return temp2;
            }
            if (i==len-n-1){
                temp2.next=temp2.next.next;
                return head;
            }
            temp2=temp2.next;
        }

        return head;
    }

    public static boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
//        while(fast != null){
//            if(fast.next==null){
//                return false;
//            }
//            slow=slow.next;
//            fast=fast.next.next;
//            if (fast==slow){
//                return true;
//            }
//        }
        while(fast.next != null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (fast==slow){
                return true;
            }
        }
        return false;
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode node= new ListNode(0);
        // node.val=-1;
        ListNode temp=node;
        // node=node.next;

        while(list1 != null || list2 != null){
            if(list1 == null && list2 == null){
                return temp;
            }
            else if(list1 == null){
                node.val=list2.val;
                list2= list2.next;
            }
            else if(list2 == null){
                node.val=list1.val;
                list1= list1.next;
            }
            else{
                if(list1.val <=list2.val ){
                    // node=new ListNode(list1.val);
                    node.val = list1.val;
                    list1=list2.next;
                }
                else{
                    // node=new ListNode(list2.val);
                    node.val = list2.val;
                    list2=list2.next;
                }
            }
            node=node.next;
        }

        return temp;


    }
    public static boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast= head;

//        while (fast != null && fast.next != null) {

            while(fast.next != null || fast.next.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.val);
        ListNode temp=reverseList(slow.next);
        System.out.println("temp: "+temp.val);
        ListNode last=temp;
        ListNode first=head;
        while(last != null){
            if(first.val != last.val){
                reverseList(temp);
                return false;
            }
            first=first.next;
            last=last.next;
        }
        reverseList(temp);
        return true;
    }
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right) return head;
        ListNode prev=null;
        ListNode curr=head;

        for(int i=1;i<left && left != 1;i++){
            prev=curr;
            curr=curr.next;

        }
        // System.out.println("prev"+prev.val);
        ListNode last=prev;
        ListNode actualLast=curr;
        ListNode next=curr.next;

        for(int i=0;i<(right-left)+1;i++){
            curr.next=prev;
            prev=curr;
            curr=next;
            if(next != null){
                next=next.next;
            }
            // System.out.println(curr.val);
        }
        actualLast.next=curr;
        if(left != 1)
            last.next=prev;
        else{
            return prev;
        }
        return head;
    }

//    public static ListNode reverseKGroup(ListNode head, int k) {
//        ListNode prev=null;
//        ListNode curr=head;
//        ListNode next=head.next;
//
//        int temp=k;
//
//        ListNode prevHead=null;
//        ListNode currHead=null;
//        ListNode currLast=null;
//
//        while(curr !=null ){
//            System.out.println("temp: "+temp+ " k: "+k);
//            System.out.println("curr: "+curr.val);
//            if (temp==k){
//                System.out.println("next iteration----------------------");
//
//                if (prevHead != null){
//                    currHead=curr;
//                    System.out.println("prevhead: "+prevHead.val);
//                    System.out.println("currhead: "+currHead.val);
//                }
//                else {
//                    prevHead=curr;
//                    System.out.println("prevhead1: "+prevHead.val);
//                }
//            }
//            if(temp==1){
//                currLast=curr;
//                System.out.println("currlast: "+currLast.val);
//                if (currHead != null){
//                    prevHead.next=currLast;
//                    System.out.println("prevhead: "+prevHead.val);
//                    prevHead=currHead;
//
//                    System.out.println("currhead: "+currHead.val);
//
//                }
//
//
//                temp=k+1;
//            }
//
//            temp--;
//            curr.next=prev;
//            System.out.println(curr.val);
//            prev=curr;
//            curr=next;
//            if (next != null){
//                next=next.next;
//            }
//
//        }
//        System.out.println(head.val);
//        if (temp != 1){
//            prevHead.next=currHead;
//        }
//        System.out.println("linklist is:  ");
////        displayr(head);
//        for (int i = 0; i < 10; i++) {
//            assert head != null;
//            System.out.println(head.val);
//            head=head.next;
//        }
////
////        displayr(prev);
//        return prev;
//
//    }
public ListNode reverseKGroupAns(ListNode head, int k) {
    ListNode dummy = new ListNode(0, head);
    ListNode groupPrev = dummy;

    while(true) {
        ListNode kth = getkth(groupPrev, k);
        if(kth == null) break;
        ListNode groupNext = kth.next;

        ListNode prev = kth.next;
        ListNode curr = groupPrev.next;

        while(curr != groupNext) {
            ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        ListNode tmp = groupPrev.next;
        groupPrev.next = kth;
        groupPrev = tmp;
    }
    return dummy.next;
}

    public ListNode getkth(ListNode curr, int k) {
        while(curr != null && k > 0) {
            curr = curr.next;
            k--;
        }
        return curr;
    }
public static ListNode reverseKGroup(ListNode head, int k) {
    if (head == null || k==1){
        return head;
    }
    ListNode prev=null;
    ListNode curr=head;
    ListNode next=curr.next;

    ListNode last=prev;
    ListNode currLast=curr;

    while(curr != null){

        ListNode kNode=curr;
        for(int i=0;i<k ;i++){

            if(kNode==null){
                return head;
            }
            kNode=kNode.next;
        }

        for(int i=0;i<k;i++){

            if (i==0){
                currLast=curr;
            }
            System.out.println("currlast: "+currLast.val);
            if (last != null)
                System.out.println("last: "+last.val);
            else System.out.println("last: null");
            System.out.println("i: "+i);
            if (prev !=null)
                System.out.println("prev: "+prev.val);
            if (curr !=null)
                System.out.println("curr: "+curr.val);

            if(i==k-1 && last==null){
                head=curr;
                last=currLast;
                currLast.next=next;
            }else if(i==k-1){
                last.next=curr;
                last=currLast;
                currLast.next=next;
            }
            curr.next=prev;
            prev=curr;
            curr=next;
            if(next != null){
                next=next.next;
            }
        }
        System.out.println("............................");

    }

    return head;
}
    public static void main(String[] args) {

        ListNode a= new ListNode(10);
        ListNode b= new ListNode(20);
        ListNode c= new ListNode(30);
        ListNode d= new ListNode(40);
        ListNode e= new ListNode(50);
        ListNode f= new ListNode(60);
        ListNode g= new ListNode(70);
        ListNode h= new ListNode(80);
        ListNode i= new ListNode(90);
        ListNode j= new ListNode(100);
        ListNode k= new ListNode(200);

//        ListNode d = new ListNode();
        //10 20 30 40 50 60


        a.next=b;
        b.next=c;
        c.next=d;
        e.next=f;
        f.next=g;
        g.next=h;
        h.next=i;
        i.next=j;
        d.next=e;
        j.next=k;

        ListNode temp=reverseKGroup(a,3);
        displayr(temp);
//        e.next=b;
//        e.next=f;
//        reverseList(a);
//middleNode(a);
//  ListNode temp= removeNthFromEnd(a,1);
//  displayr(temp);
//        displayr(a);
//        System.out.println(isPalindrome(a));

//        System.out.println(hasCycle(a));

    }
}

