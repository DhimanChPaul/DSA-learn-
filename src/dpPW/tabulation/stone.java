package dpPW.tabulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class stone {

    // one frog can jump 0 to kth jump to the stone so find the minimum energy

    private static int rec(int i, List<Integer> heights, int k, int[] dp){
        if(i==0){
            return 0;
        }
        if (dp[i] !=-1){
            return dp[i];
        }
        int minCost=10000;

        for (int j = 1; j <= k  ; j++) {
            if (i-j>=0){
                int jump=Math.abs(heights.get(i)- heights.get(i-j)) + rec(i-j,heights,k,dp);
                minCost=Math.min(minCost,jump);
            }
        }

        // this is for only recursion

//        int jump1=Math.abs(heights.get(i)- heights.get(i-1))+rec(i-1,heights,0);
//        int jump2=10000;
//        if(i>1){
//            jump2=Math.abs(heights.get(i)- heights.get(i-2))+rec(i-2,heights,0);
//        }
//        return Math.min(jump1,jump2);
//
        return dp[i]=minCost;
    }

    public static void main(String[] args){
        List<Integer> li= List.of(10,30,40,50,20);
        int n= li.size();
//        int[] dp = new int[n];
//        dp[0]=0; //base case of dp
        int k=3;
        List<Integer> dp= new ArrayList<>();
        dp.add(0);

//        for (int i = 0; i < n; i++) {
//            dp[i]=-1;
//        }
//        Arrays.fill(dp, -1);
//        int ans= rec(li.size()-1,li,3,dp);
//        System.out.println(ans);



        //here in this we only need last k dp value so n number of dp can create more space
        // to reach the last steps we only need the last k th dp only
        for (int i = 1; i < n; i++) {
            int minCost=10000;
            for (int j = 1; j <= k; j++) {
                if (i-j>=0){
                    int jump=Math.abs(li.get(i)- li.get(i-j))+dp.get(dp.size()-j) ;
                    minCost=Math.min(minCost,jump);
                }

            }
            if (dp.size() == k){
                dp.remove(0);
            }
            dp.add(minCost);
        }
        System.out.println(dp.get(k-1));



    }

}
