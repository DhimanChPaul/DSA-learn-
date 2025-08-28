package dpPW.tabulation;

import java.util.Arrays;

public class Subsequence {

    static int rec(String s1, String s2, int i, int j, int[][] dp){

        if(i==0 || j==0){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }

        if(s1.charAt(i-1)== s2.charAt(j-1)){
            //match
            return dp[i][j]=1+rec(s1,s2,i-1,j-1,dp);
        }
        //not match
        return dp[i][j]= Math.max(rec(s1,s2,i-1,j,dp),rec(s1,s2,i,j-1,dp));

    }


    public static void main(String[] args) {
        String s1="AGGTAB";
        String s2= "GXTXAYB";
        int m=s1.length();
        int n=s2.length();
        int[][] dp= new int[m+1][n+1];

        for (int i = 0; i <= m; i++) {
            dp[i][0] =0;
        }
        for (int i = 0; i <= n; i++) {
            dp[0][i] =0;
        }

//        int ans=rec(a,b,m,n, dp);
//        System.out.println(ans);

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if(s1.charAt(i-1)== s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }

            }
        }
        System.out.println(dp[m][n]);


    }
}
