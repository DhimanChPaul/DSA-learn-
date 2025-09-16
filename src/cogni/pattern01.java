package cogni;

public class pattern01 {
    static void print01(int n){
//              1
//            2 1 2
//          3 2 1 2 3
//        4 3 2 1 2 3 4
//      5 4 3 2 1 2 3 4 5
        int sum=0;

        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j >0; j--) {
                System.out.print("  ");

            }
            for (int j = i; j > 0; j--) {
                System.out.print(j+" ");
                sum+=j;
            }
            for (int j = 2; j <=i ; j++) {
                System.out.print(j+" ");
                sum+=j;
            }
            System.out.println(" ");
        }
        System.out.println(sum);

    }

    static void print02(int n){
        int temp=n;
        n=n*2;
        for (int i = 0; i <= n; i++) {
            if (i==n/2 || i== n/2+1){
                continue;
            }
            for (int j = 0; j <= n; j++) {
                if (j==n/2 || j== n/2+1){
                    continue;
                }
                int min=Math.min(Math.min(i,j), Math.min(n-i, n-j));
                System.out.print(temp-min+"  ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int n=7;
//        print01(n);
        print02(4);


    }
}
