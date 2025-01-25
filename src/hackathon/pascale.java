package hackathon;

public class pascale {
    static int nCr(int n, int r)
    {
        return fact(n) / (fact(r) * fact(n - r));
    }
    static int fact(int n)
    {
        int res = 1;
        for (int i = 2; i <= n; i++)
            res = res * i;
        return res;
    }
    public static void main(String[] args) {
        int n=4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(nCr(i,j));

            }
            System.out.println();
        }
    }
}
