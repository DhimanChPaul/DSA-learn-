package basic;

import java.util.Scanner;

public class ftyufyufvh {
    public static int sum(int a){
        if(a==0){
            return 0;
        }
            System.out.println(a);
            sum(a-1);
            return a;


    }
    public static void main(String[] args) {
        int n,a,su=0;
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
//        sum(n);
//        su=su+n;
        System.out.println(sum(n));
    }
}
