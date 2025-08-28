package prep1;

public class perfectnum {
    public static void main(String[] args){

        int n=28;
        int ans=1;
        for (int i = 2; i < n; i++) {
            if(n%i ==0){
                ans +=i;
            }
        }
        System.out.println(ans);
    }

}
