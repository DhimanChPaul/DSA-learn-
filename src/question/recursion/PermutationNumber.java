package question.recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationNumber {

    static void permute(List<List<Integer>> list,List<Integer> temp, int[] arr, int idx){
        if (idx==arr.length){
//            List<Integer> temp =new ArrayList<>(); //no need for external temp
            for (int i = 0; i < arr.length; i++) {
                temp.add(arr[i] );
            }
            list.add(new ArrayList<>(temp));
            return;
        }
        for (int i = idx; i < arr.length; i++) { //loop for find combination
            swap(arr,idx,i);
            permute(list,temp,arr,idx+1); //this is for combination in itself

            swap(arr,idx,i);
        }

    }

    private static void swap(int[] arr, int idx, int i) {
        int temp=arr[idx];
        arr[idx]=arr[i];
        arr[i]=temp;

    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list= new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        permute(list,temp,nums,0);
        return list;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3};
        System.out.println(nums.length);
//        System.out.println(arrToNum(nums));
        swap(nums,0,2);
        for (int num : nums) {
            System.out.println(num);
        }

    }
}
