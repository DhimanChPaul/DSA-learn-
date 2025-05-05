package question.heapQ;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;

public class kFrequent {
    static class pair{
        int key;
        int val;
        pair(int key,int val){
            this.key=key;
            this.val=val;
        }
    }

    public static int[] topKFrequent(int[] nums, int k) {
        int[] arr= new int[k];

        HashMap< Integer, Integer> map= new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                int val=map.get(nums[i]);
                map.replace(nums[i],val+1 );
            }
            else{
                map.put(nums[i],1);
            }
        }
        System.out.println(map.entrySet());
        PriorityQueue<pair> pq= new PriorityQueue<>((a,b) -> b.val-a.val);

        for (Map.Entry<Integer, Integer> element : map.entrySet()) {
            pq.add(new pair(element.getKey(), element.getValue()));
        }

//        System.out.println(Objects.requireNonNull(pq.poll()).key);
        assert pq.peek() != null;
        System.out.println(pq.peek().key);
        for (int i = 0; i < k; i++) {
            arr[i]=pq.poll().key;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums={1,1,1,2,2,3,4,4,4,4,4};
        int[] arr=topKFrequent(nums,2);
        System.out.println("array values are: ");
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
