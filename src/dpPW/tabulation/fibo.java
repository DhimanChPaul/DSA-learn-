package dpPW.tabulation;

public class fibo {
    public static int call=0;
    public static int fibo(int n, int dp[]){
        call++;
        if(n==1 || n==2){
            return 1;
        }
        if (dp[n] != -1){
            return dp[n];
        }


        return dp[n]=fibo(n-1,dp)+fibo(n-2,dp);
    }
    public static void main(String[] args) {
        int n=10;
        int dp[]=new int[n+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i]=-1;
        }

        dp[1]=1;
        dp[2]=2;
        for (int i = 3; i < dp.length; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        System.out.println(dp[n-1]);

//        System.out.println(fibo(n,dp));
//        System.out.println("call: "+call);
    }
}
