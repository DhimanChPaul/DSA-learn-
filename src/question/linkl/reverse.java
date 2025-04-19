package question.linkl;



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
        e.next=b;
//        e.next=f;
//        reverseList(a);
//middleNode(a);
//  ListNode temp= removeNthFromEnd(a,1);
//  displayr(temp);
//        displayr(a);

        System.out.println(hasCycle(a));

    }
}

