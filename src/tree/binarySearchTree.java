package tree;

public class binarySearchTree {

    public  binarySearchTree(){

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

        return node;
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

    private void pretyDisplay(Node node, int level){

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

    private void display(Node node, String s) {
        if (root == null) {
            return;
        }
        System.out.println(s+node.value);
        display(node.left,"left child of "+node.value+" is : ");
        display(node.right,"Right child of "+node.value+" is : ");
    }

    public static void main(String[] args) {

        binarySearchTree tree= new binarySearchTree();

        int []arr= new int[] {15,20,10,18,12,5,22,21,13,7,3,33,1};
        int []arr1= {1,2,3,4,5,6,7,8,9,10};
        tree.populateSorted(arr1);
//        tree.populate(arr);
        tree.pretyDisplay();
        tree.display();
    }

}
