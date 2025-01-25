package tree;

public class segment {

    public static class Node{
         int data;
         int firstInterval;
         int lastInterval;
         Node left;
         Node right;

         public Node(int first,int last){
             this.firstInterval=first;
             this.lastInterval=last;
         }

    }
    Node root;

    public segment(int arr[]){
        this.root= construct(arr, 0, arr.length-1);
    }

    private Node construct (int arr[],int start, int end){
        if (start==end){
            Node leaf =new Node(start,end);
            leaf.data=arr[start];
              return leaf;
        }
        int mid =(start+end)/2;
        Node node =new Node(start,end);

        node.left=construct(arr,start,mid);
        node.right=construct(arr,mid+1,end);

        node.data=node.left.data+node.right.data;

        return node;


    }

    public void display(){
        display(root);
    }

    private void display(Node node) {
        String str= " ";
        if(node.left!=null){
            str=str+"interval=["+node.left.firstInterval+"-"+node.left.lastInterval+"]and data: "+node.left.data+"--->";

        }
        else {
            str=str+"no left child";

        }

        str=str+"interval=["+node.firstInterval+"-"+node.lastInterval+"]and data: "+node.data+"--->";

        if(node.right!=null){
            str=str+"interval=["+node.right.firstInterval+"-"+node.right.lastInterval+"]and data: "+node.right.data;

        }
        else {
            str=str+"no right child";

        }

        System.out.println(str+"\n");

        if(node.left!= null){
            display(node.left);
        }
        if(node.right !=null){
            display(node.right);
        }

    }

    public int quere(int start,int end){
        System.out.println("sum of the interval is: ");
      return quere(root,start,end);
    }

    private int quere(Node node, int start, int end) {
        if (node.firstInterval >= start && node.lastInterval<=end){
            return node.data;
        } else if (node.firstInterval>end || node.lastInterval<start) {
            return 0;
        }
        else {
            return quere(node.left,start,end)+quere(node.right,start,end);
        }



    }

    public static void main(String[] args) {
        int arr[]={3,8,9,-2,-10,7,1};
        segment tree = new segment(arr);
        tree.display();
//        tree.quere(0,4);
        System.out.println(tree.quere(0,4));

    }
}
