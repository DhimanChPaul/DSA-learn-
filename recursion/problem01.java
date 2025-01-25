public class problem01 {

    static int count(int n){
        int c=1;

        if(n/10!=0){
            return c +count(n/10);

        }
        return c;
    }
     static int sumofDigit(int n){
        int sum=(n%10);
        if (n==0){
            return sum;
        }

        return sum+sumofDigit(n/10);
    }
    public static void main(String[] args) {
        int n=523567;
        System.out.println(sumofDigit(n));
        System.out.println(count(n));

    }
}
