package question.recursion;

import java.util.ArrayList;
import java.util.Collections;

public class subsetSum {
    public static void pick(ArrayList<Integer> list, int[] arr, int idx,int sum){

        if (idx == arr.length){
            list.add(sum);
//            System.out.println("size: "+list.size());
            System.out.println(list.get(list.size() - 1));

//            System.out.println(list.get(list.size())-1);

            System.out.println("sum: "+sum);
            return;
        }
        int newSum=sum+arr[idx];

        //pick
        pick(list,arr,idx+1,newSum);

        //not pick
        pick(list,arr,idx+1,sum);

    }
    public static ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();

        pick(list,arr,0,0);
        Collections.sort(list);

        return list;

    }
    public static void main(String[] args) {
        int[] arr ={1,2,1};
        ArrayList<Integer> list = new ArrayList<>();

        list=subsetSums(arr);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
