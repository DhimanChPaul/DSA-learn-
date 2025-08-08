package question.stackQueue;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    static class ListNode{
        int key;
        int value;
        ListNode next;
        ListNode prev;
        ListNode(int key,int value){
            this.key=key;
            this.value=value;
            this.next=null;
            this.prev=null;
        }
//        ListNode(int key,int value, ListNode next, ListNode prev){
//            this.key=key;
//            this.value=value;
//            this.next=next;
//            this.prev=prev;
//        }
    }

    ListNode head= new ListNode(0, 0);
    ListNode tail= new ListNode(0, 0);
    Map<Integer,ListNode> map=new HashMap<>();
    int cap;

    public LRUCache(int capacity) {
    cap=capacity;
    head.next=tail;
    tail.prev=head;
    }

    public int get(int key) {

//        if (map.containsKey(key)){
//            ListNode node=map.get(key);
//            int val=node.value;
//            if (node.prev != head){
//                ListNode temp=node.prev;
//                temp.next=node.next;
//                node.next.prev=temp;
//
//                node.next=head.next;
//                head.next.prev=node;
//                node.prev=head;
//                head.next=node;
//            }
//            System.out.println(map.keySet());
//            return val;
//        }
        if (map.containsKey(key)){
            ListNode node=map.get(key);
            delete(node);
            insert(node);
            return node.value;
        }
    return -1;
    }

    public void put(int key, int value) {
//        if (map.containsKey(key) && tail.prev.key==key){
//            tail.prev.prev.next=tail;
//            tail.prev=tail.prev.prev;
//        }
//        ListNode curr= new ListNode(key, value);
//        curr.next=head.next;
//        head.next.prev=curr;
//        curr.prev=head;
//        head.next=curr;
//
//        map.put(key,curr);
//        System.out.println(map.get(key).value);
//
//        if (map.size() >cap){
//          ListNode temp=tail.prev;
//          temp.prev.next=tail;
//          tail.prev=temp.prev;
//          map.remove(temp.key);
//        }
            if (map.containsKey(key)){
                delete(map.get(key));
            }
            if (map.size()>cap){
                delete(tail.prev);
            }
            insert(new ListNode(key, value));

    }
    private void insert(ListNode curr){
        curr.next=head.next;
        head.next.prev=curr;
        curr.prev=head;
        head.next=curr;
        map.put(curr.key,curr);
    }
    private void delete(ListNode temp){
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
        map.remove(temp.key);
    }
}

//class LRUCache {
//    class Node{
//        int key;
//        int value;
//
//        Node prev;
//        Node next;
//
//        Node(int key, int value){
//            this.key= key;
//            this.value= value;
//        }
//    }
//
//    public Node[] map;
//    public int count, capacity;
//    public Node head, tail;
//
//    public LRUCache(int capacity) {
//
//        this.capacity= capacity;
//        count= 0;
//
//        map= new Node[10_000+1];
//
//        head= new Node(0,0);
//        tail= new Node(0,0);
//
//        head.next= tail;
//        tail.prev= head;
//
//        head.prev= null;
//        tail.next= null;
//    }
//
//    public void deleteNode(Node node){
//        node.prev.next= node.next;
//        node.next.prev= node.prev;
//
//        return;
//    }
//
//    public void addToHead(Node node){
//        node.next= head.next;
//        node.next.prev= node;
//        node.prev= head;
//
//        head.next= node;
//
//        return;
//    }
//
//    public int get(int key) {
//
//        if( map[key] != null ){
//
//            Node node= map[key];
//
//            int nodeVal= node.value;
//
//            deleteNode(node);
//
//            addToHead(node);
//
//            return nodeVal;
//        }
//        else
//            return -1;
//    }
//
//    public void put(int key, int value) {
//
//        if(map[key] != null){
//
//            Node node= map[key];
//
//            node.value= value;
//
//            deleteNode(node);
//
//            addToHead(node);
//
//        } else {
//
//            Node node= new Node(key,value);
//
//            map[key]= node;
//
//            if(count < capacity){
//                count++;
//                addToHead(node);
//            }
//            else {
//
//                map[tail.prev.key]= null;
//                deleteNode(tail.prev);
//
//                addToHead(node);
//            }
//        }
//
//        return;
//    }
//
//}
