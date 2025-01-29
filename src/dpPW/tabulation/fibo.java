package dpPW.tabulation;

public class fibo {
    public static int call=0;
    public static int fibo(int n){
        call++;
        if(n==1 || n==2){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(fibo(n));
        System.out.println(call);
    }
}
