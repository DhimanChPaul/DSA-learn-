public class exponential {
    static int exp(int p,int q){
        if(q==0){
            return 1;
        }
        return p* exp(p,q-1);

    }
    public static void main(String[] args) {
        int p=5,q=3;
        System.out.println(exp(p,q));
    }
}
