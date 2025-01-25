package problem;

import java.util.Scanner;
public class patternProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row");
        int r=sc.nextInt();
//        System.out.println("enter coloum");
//        int c=sc.nextInt();
        for(int i=1;i<=r;i++)
        {

                for (int k=1;k<=(r-i);k++)
                {
                    System.out.print(" ");
                }

                for(int j=1;j<=i;j++)
                {
                System.out.print(j);
                }
                for (int l=(i-1);l>0;l--){
                    System.out.print(l);
                }

            System.out.println();
        }

    }
}
