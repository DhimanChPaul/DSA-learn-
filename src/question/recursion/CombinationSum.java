package question.recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void pick(int[] arr,int target,int idx,int sum, List<Integer> temp,List<List<Integer>>list){

        if (sum>target || idx >= arr.length){
            return;
        }
        if (sum==target){
//            System.out.println("sum: "+sum);
//            for (int i = 0; i < temp.size(); i++) {
//                System.out.println(temp.get(i));
//            }
            list.add(temp);
            return;
        }
//        List<Integer> NewTemp = temp;

        sum=sum+arr[idx];
        temp.add(arr[idx]);

        //pick itself
        pick(arr,target,idx,sum,temp,list);

        temp.remove(temp.size()-1);
        sum=sum-arr[idx];
        //not pick
        pick(arr,target,idx+1,sum,temp,list);


    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> li = new ArrayList<>();

        List<Integer> temp = new ArrayList<>();

        pick(candidates,target,0,0,temp,li);

        return li;
    }


    public static void main(String[] args) {
        int[] candidates={2,3,5};
        int target=8;

        List<List<Integer>> li = new ArrayList<>();
        li=combinationSum(candidates,target);
//        System.out.println(li.size());

//        for (int i = 0; i <=  li.size(); i++) {
////            li.get();
//            for (int j = 0; j < li.get(i).size(); j++) {
//                System.out.println(li.get(j));
//            }
//        }
    }
}
