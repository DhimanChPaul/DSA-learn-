package bitManupulation;

public class magicNumber {
    public static void main(String[] args) {
        int n=6;
        int base=5;
        int ans=0;
        while(n>0){
            int last=n&1;
            System.out.println("lasst"+last);
            n=n>>1;
            System.out.println("n"+n);
            ans+=last*base;
            base*=5;
            System.out.println("ans"+ans);
        }
        System.out.println(ans);

    }
}
