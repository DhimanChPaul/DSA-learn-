package problem;

import java.util.Scanner;

public class pw_problem {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter a number");
        int num = input.nextInt();
       int a=0;
       while (num>0){
         a=((a*10)+(num%10)) ;
         num/=10;

       }
        System.out.println("your reverse number is:\t"+ a);
    }
}
