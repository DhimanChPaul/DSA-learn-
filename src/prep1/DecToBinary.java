package prep1;

import java.lang.reflect.Array;

public class DecToBinary {
    public static void main(String[] args) {
        int n=7;
        int ans=0;
        int i=1;
        while (n>0){
            ans=ans+i*(n%2);
            n=n/2;
            i=i*10;
        }
        System.out.println(ans);

    }
}
