package question.recursion;

public class goodNum {
    private static final int MOD = 1_000_000_007;

    public static long count(long ans, long n){
        if(n==0){
            return 1;
        }
        if(n%2==1){
            return ans*count(ans,n-1)%MOD;
        }

        return count(ans*ans %MOD,n/2);

    }


public static int countGoodNumbers(long n) {
    // count good number for this length of number
    long ans = 1;
    long temp=n/2;

    ans=count(5,temp+n%2)*count(4,temp);
    ans=ans%MOD;


    return (int) ans;

}
    public static void main(String[] args) {
        long n=4;

        System.out.println(countGoodNumbers(50));
        System.out.println(564908303);
    }
}
