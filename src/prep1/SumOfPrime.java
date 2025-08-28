package prep1;

public class SumOfPrime {
    static boolean isPrime(int n){

        if(n==2) return true;

        if(n%2==0)
            return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }

        return true;
    }
    public static void main(String[] args) {
        int n=14;
        for (int i = 2; i < n/2; i++) {
//            if(isPrime(i)){
//                if (isPrime(n-i)){
//                    System.out.println("numbers are: "+i+" ,"+ (n-i));
//                }
//            }
            if (isPrime(i) && isPrime(n - i)) {
                System.out.println("Numbers are:\n " + i + "+" + (n - i)+" = "+n);

            }
        }
    }
}
