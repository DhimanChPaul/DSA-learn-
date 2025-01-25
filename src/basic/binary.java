package basic;

import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("enter a basic.binary number");
        int b= sc.nextInt();
        int ans=0,rem,a=1;
       while(b>0){
            rem=b%10;
            ans=ans+(rem*a);
            a=a*2;
            b=b/10;
        }
       // decimle to basic.binary
       /* while(b>0){
            rem=b%2;
            ans=ans+(rem*a);
            a=a*10;
            b=b/2;
        }*/

        System.out.println("your decimle number is "+ ans);
    }
}
