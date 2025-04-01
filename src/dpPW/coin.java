package dpPW;

import java.util.List;

public class coin {
    public static int rec(List<Integer> coins, int sum, int idx, int dp[][]){

        if(dp[idx][sum] != -1){
            return dp[idx][sum];
        }
        if(idx==0){
            if(sum% coins.get(idx)==0){
                return 1;
            }
            else {
                return 0;
            }
        }

        int pick=0;
        if(sum>= coins.get(idx)){
            pick=rec(coins,sum- coins.get(idx),idx, dp);
        }
        int notPick=rec(coins,sum,idx-1, dp);



        return dp[idx][sum]=pick+notPick;
    }


    public static void main(String[] args) {
        List<Integer> coin= List.of(2,5,3,6);
        int n= coin.size();
        int sum=10;
        int dp[][]= new int[coin.size()][sum+1];

        for (int i = 0; i <= sum; i++) {
            if (i%coin.get(0)==0){
                dp[0][i]=1;
            }
            else {
                dp[0][i]=0;
            }
        }

        for (int idx = 1; idx <=n ; idx++) {
            for (int needSum=0; needSum<=sum; needSum++){

                int pick=0;
                if(sum>= coin.get(idx)){
                    pick=rec(coin,sum- coin.get(idx),idx, dp);
                }
                int notPick=rec(coin,sum,idx-1, dp);
               dp[idx][sum]=pick+notPick;
            }
        }
        System.out.println(rec(coin, sum, coin.size()-1, dp));
    }
}
