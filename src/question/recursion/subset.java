package question.recursion;

import java.util.ArrayList;
import java.util.List;

public class subset {
    private void helper(int[] nums, List<List<Integer>> li, List<Integer> temp, int idx) {
        if (idx > nums.length) return;

        li.add(new ArrayList<>(temp));

        for(int i = idx; i < nums.length; i++) {
            temp.add(nums[i]);
            helper(nums, li, temp, i+1);
            temp.remove(temp.size()-1);
        }
    }
    public static void pick(List<List<Integer>> li,List<Integer> temp,int[] arr, int idx){

        if (idx== arr.length){
            li.add(temp);
            for (Integer integer : temp) {
                System.out.println(integer);
            }
            System.out.println("end");
            return;
        }
        //not pick curent
        pick(li,temp,arr,idx+1);
        //pick current
        temp.add(arr[idx]);
        pick(li,temp,arr,idx+1);
        temp.remove(temp.size()-1);
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> li= new ArrayList<>();
        List<Integer> temp= new ArrayList<>();
        pick(li,temp,nums,0);

        return li;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3};
//        Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
        List<List<Integer>> li= subsets(nums);
    }
}
