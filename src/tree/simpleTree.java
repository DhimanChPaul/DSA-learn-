package tree;

import java.util.Scanner;

public class simpleTree {
    public simpleTree(){

    }
    private static  class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value=value;
        }

    }
private Node root;

    public void populate(Scanner sc){
        System.out.println("enter root node");
        int val=sc.nextInt();
        root= new Node(val);
        populate(sc,root);

    }

    private void populate(Scanner sc,Node node){
        System.out.println("do you enter left of "+node.value);
    boolean left=sc.nextBoolean();
        if (left) {
            System.out.println("enter the value of the left of "+node.value);
            int val=sc.nextInt();
            node.left=new Node(val);
            populate(sc,node.left);
        }

        System.out.println("do you enter right of "+node.value);
        boolean right=sc.nextBoolean();
        if (right) {
            System.out.println("enter the value of the Right of "+node.value);
            int val=sc.nextInt();
            node.right=new Node(val);
            populate(sc,node.right);
        }
    }

    public void display(){
        display(this.root," ");
    }
private void display(Node node,String indent){
        if(node== null){
            return;
        }
    System.out.println(indent+node.value);
        display(node.left,indent+"\t");
    display(node.right,indent+"\t");

}

public  void pretyDisplay(){
      pretyDisplay(root, 0);

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




    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         simpleTree tree = new simpleTree();
         tree.populate(scanner);
         tree.display();
         tree.pretyDisplay();
    }


}

