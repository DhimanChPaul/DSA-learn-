package tree;

import static java.util.Collections.rotate;

public class avlTree {

    public  avlTree(){

    }
    private  static class Node{

        int value;
        int height;

        Node right;
        Node left;

        public Node(int value) {
            this.value=value;
        }

    }

    private Node root;

 public int height(){
     return height(root);
 }

    private int height(Node node) {
     if (node== null)
         return -1;
     return node.height;
    }

    public boolean isEmpty(){
        return root == null;

    }

    public void insert(int val){
//        if (root==null){
//            root.value=val;
//            return;
//        }
//        else {
        root= insert(val,root);
//        }
    }

    private Node insert(int val, Node node){

        if (node == null) {
            node= new Node(val);
//            return node;
        }
        else if(val < node.value){
            node.left = insert(val, node.left);
        }
        else{
            node.right = insert(val, node.right);
        }
        node.height=Math.max(height(node.left),height(node.right))+1;
        return rotate(node);
    }

    private Node rotate(Node node) {
     if (height(node.left)-height(node.right)>1){
//         left heavy
         if (height(node.left.left)-height(node.left.right)>0){
//            left left case
             return rightRotate(node);

         }
         if (height(node.left.left)-height(node.left.right)<0){
//              left right case
             node.left= leftRotate(node.left);
             return rightRotate(node);

         }
     }
        if (height(node.left)-height(node.right)<-1){
//         right heavy
            if (height(node.right.left)-height(node.right.right)>0){
//            right right case
                return leftRotate(node);

            }
            if (height(node.right.left)-height(node.right.right)<0){
//               right left case
                node.right= rightRotate(node.right);
                return leftRotate(node);

            }


        }
        return node;
    }

    private Node leftRotate(Node p) {
      Node c=null;
        if(p.right==null){
             c=p.left;
            c.left=p;
//            return p.left;
            p.height= Math.max(height(p.left),height(p.right))+1;
            c.height= Math.max(height(c.left),height(c.right))+1;

        }
        else {
            c=p.right;
            Node t=c.left;

            c.left=p;
            p.right=t;

            p.height= Math.max(height(p.left),height(p.right))+1;
            c.height= Math.max(height(c.left),height(c.right))+1;
        }



//        p.height= Math.max(height(p.left),height(p.right))+1;
//        c.height= Math.max(height(c.left),height(c.right))+1;

        return c;


    }

    private Node rightRotate(Node p) {
     Node c=p.left;
//     if(c.){
//
//        }

//        Node c=p.left;
        Node t=c.right;

        c.right=p;
        p.left=t;

        p.height= Math.max(height(p.left),height(p.right))+1;
        c.height= Math.max(height(c.left),height(c.right))+1;

        return c;//because c is the new node
    }


    public void populate(int nums[]){
        for (int i = 0; i < nums.length; i++) {
            insert(nums[i]);
        }
    }

    public  void pretyDisplay(){
        pretyDisplay(root, 0);

    }

    public void populateSorted(int nums[]){

     populateSorted(nums,0,nums.length);
    }

    private void populateSorted(int[] nums, int start , int end) {
        if (start >= end) {
            return;
        }
        int mid=(start+end)/2;
        insert(nums[mid]);
        populateSorted(nums,start,mid);
        populateSorted(nums,mid+1,end);

    }

    private void pretyDisplay(avlTree.Node node, int level){

        if (node == null){
            return;
        }

        pretyDisplay(node.right,level+1);
        if (level != 0) {
            for (int i = 0; i < level-1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|----->"+node.value);
        }
        else {
            System.out.println(node.value);
        }
        pretyDisplay(node.left,level+1);

    }

    public  void display(){
        display(root," root node is : ");
    }

    private void display(avlTree.Node node, String s) {
        if (root == null) {
            return;
        }
        System.out.println(s+node.value);
        display(node.left,"left child of "+node.value+" is : ");
        display(node.right,"Right child of "+node.value+" is : ");
    }

    public static void main(String[] args) {

        avlTree tree= new avlTree();
        avlTree tree1=new avlTree();

        int []arr= new int[] {15,20,10,18,12,5,22,21,13,7,3,33,1};
        int []arr1= {1,2,3,4,5,6,7,8,9,10};
        int []arr3= {1,2};
        int []arr2={10,9,8,7,6,5,4,3,2,1};
//        tree.populateSorted(arr1);
//        for (int i = 0; i < arr.length; i++) {
//            tree.insert(arr[i]);
//        }
//        tree.populate(arr2);
//        tree.pretyDisplay();

        tree1.populate(arr3);
        tree1.pretyDisplay();
//        tree.display();
    }

}




