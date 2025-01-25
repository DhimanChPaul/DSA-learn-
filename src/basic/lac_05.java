package basic;

import java.util.Scanner;


public class lac_05 {
    public static void main(String[] args) {
//Scanear use for input user data
        System.out.println("enter a number");
          Scanner a1= new Scanner(System.in);
//user input sum
       /*  System.out.println("enter a number for sum");
        //int a= a1.nextInt();
        float a= a1.nextFloat();
        System.out.println("enter second number");
        //int b= a1.nextInt();
        float b= a1.nextFloat();
        System.out.println("sum of this number is ");
        //int sum= a+b;
        float sum= a+b;
        System.out.println(sum);
         */
// bollean use to chake the input type is
        /*boolean b1= a1.hasNextDouble();
        System.out.println(b1);
         */
// .next use for only one word but next line use for a full line
      //  String scr= a1.next();
        String scr = a1.nextLine();
        System.out.println(scr);

    }
}
