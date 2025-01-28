package dpPW;

public class robery {
    private static int rob(int[] arr, int index , int dp[]) {
        if(index == arr.length-1){
            return arr[index];
        }
        if(index >= arr.length){
            return 0;
        }
        if (dp[index] != -1){
            return dp[index];
        }

        int pick= arr[index]+rob(arr,index+2, dp);
        int not_pick= rob(arr,index+1,dp);

        return dp[index]=Math.max(pick,not_pick);

    }
    public static void main(String[] args) {
//        int n=4;
//        int house[]=new int[n];
//        house[0]=8;
//        house[1]=1;
//        house[2]=1;
//        house[3]=9;

        int house[]={8,1,2,9};
        int dp[]=new int[house.length];
        for (int i = 0; i < dp.length; i++) {
            dp[i]=-1;
        }


        System.out.println(rob(house, 0,dp));
    }


}
