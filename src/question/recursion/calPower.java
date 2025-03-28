package question.recursion;

public class calPower {
    public static double pow1(double ans,  double x, long n){
        if(n==0){
            return 1;
        }
        if (n==1){
            return ans*x;
        }
        if(n%2 ==1){
            return pow1(ans*x,x,n-1);
        }

        return pow1(ans,x*x,n/2);
    }

    public static double myPow(double x, int n) {
        double ans=1.00;
        long N= (long) n;
        if (N<0){
            N=N*(-1);
            return 1/pow1(ans,x,N);
        }
        return pow1(ans,x,N);
    }
    public static void main(String[] args) {
        double x=2.000;
        int n=-2147483648;
//        int n=-200000000;
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(n);
//        System.out.println(Double.MIN_VALUE);
//        int n=-2;
        System.out.println(myPow(x,n));
    }
}

//public static double pow1(double ans,  double x, long n){
//    if(n==0){
//        return 1;
//    }
//    if (n==1){
//        return ans*x;
//    }
//    return pow1(ans*x,x,n-1);
//}
//
//public static double myPow(double x, int n) {
//    double ans=1.00;
//    long N= (long) n;
//    if (N<0){
//        N=N*(-1);
//        return 1/pow1(ans,x,N);
//    }
//    return pow1(ans,x,N);
//}
