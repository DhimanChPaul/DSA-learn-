package problem;

public class digit {
    public static void main(String[] args) {
        int n=347584;
        while(n>=100){
            n=n/10;
        }
        System.out.println(n);
    }
}
