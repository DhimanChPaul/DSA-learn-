package question.greedy;

import java.util.ArrayList;

public class jobSeq {
    static class job{
        int deadline;
        int profit;

        job(int deadline, int profit){
            this.deadline=deadline;
            this.profit=profit;
        }
    }
    public static ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        // code here
        ArrayList<Integer> ans= new ArrayList<>();
        ArrayList<job> li= new ArrayList<>();

        for (int i = 0; i < deadline.length; i++) {
            li.add(new job(deadline[i], profit[i]));
        }
        li.sort((a,b) -> b.profit- a.profit);

        for (int i = 0; i < deadline.length; i++) {
            System.out.println(li.get(i).deadline);
            System.out.println(li.get(i).profit);
            System.out.println(".............");
        }


        int maxDeadline=0;
        for (int i = 0; i < deadline.length; i++) {
            maxDeadline=Math.max(maxDeadline, deadline[i]);
        }
        System.out.println(maxDeadline);

        int[] arr= new int[maxDeadline];
        int countJob=0;
        int jobProfit=0;
        for (int i = 0; i < deadline.length; i++) {
//
            int num=li.get(i).deadline-1;
            for (int j = num; j>=0; j--) {
                if (arr[j] == 0 ){
                    arr[j]=li.get(i).profit;
                    countJob++;
                    jobProfit +=arr[j];
                    break;
                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("val: "+arr[i]);
        }
        ans.add(countJob);
        ans.add(jobProfit);
        System.out.println("count: "+countJob);
        System.out.println("profit: "+jobProfit);

        return ans;

    }
    public static void main(String[] args) {
        int[] deadline={3, 1, 2, 2};
        int[] profit={50, 10, 20, 30};
        jobSequencing(deadline,profit);

    }
}
