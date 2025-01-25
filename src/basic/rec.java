package basic;

public class rec {

    public static int pri(int n){
        if (n==101){
            return 101;
        }
        System.out.println(n);
        return pri(n+1);
    }

    public static void main(String[] args) {
        pri(1);
    }
}
