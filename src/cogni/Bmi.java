package cogni;

public class Bmi {
    static int calculate(int[] h, int[] w, int k){
        int ans=0;

        int n= h.length;
        for (int i = 0; i < n; i++) {
            double temp=((double) w[i] /h[i])*10;
            System.out.println(temp);
            if (temp<=k) ans++;
        }


        return ans;
    }
    public static void main(String[] args) {
        int[] h={165,172,180,158,190,165,173,183};
        int[] w={68,82,61,91,75,100,113,127};
        int k=4;
//        System.out.println(calculate(h,w,k));

        System.out.println(Math.sqrt(4));
        System.out.println(Math.cbrt(4));

    }
}
