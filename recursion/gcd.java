public class gcd {
    public static void main(String[] args) {
        int x=12,y=60,i;
//        if (x>y){
//             i=y;
//        }
//        else i=x;
        i=Math.min(x,y);
//        i=(x<y)?x:y;

        for (int j=i ; j >0; j--) {
            if (x%j==0 && y%j==0){
                System.out.println(j);
                break;
            }


        }
    }
}
