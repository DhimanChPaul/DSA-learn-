package prep1;

public class facto {
    static int rec(int n, int ans){
        if(n==0){
            return ans;
        }
        return rec(n-1,(ans*n)) ;
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(rec(n,1));
    }
}
