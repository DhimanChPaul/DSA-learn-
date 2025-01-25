package basic;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
       // int age= 9;
        Scanner a= new Scanner(System.in);
        int age= a.nextInt();
        System.out.println(" your age is "+ age);
        if (age>15) {
            System.out.println("you can go");
        }else {
            System.out.println("you can not go");
        }

    }
}
