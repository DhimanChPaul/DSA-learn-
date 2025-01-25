package bitManupulation;

public class bit01 {
    public static void main(String[] args) {
        int n=46;
        System.out.println(isOdd(n));
    }

    private static boolean isOdd(int n) {
        return (n&1) ==1;
    }
}
