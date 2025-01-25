package basic;

import java.util.Scanner;

public class marks_persentage {
    public static void main(String[] args) {
        System.out.println("enter your marks out of 100");
        Scanner a1 = new Scanner(System.in);
        // i use int also but int can't show decimale number
        float a = a1.nextByte();
        float b = a1.nextByte();
        float c = a1.nextByte();
        float d = a1.nextByte();
        float e = a1.nextByte();
        /*float f = a + b + c + d + e;
        System.out.println("total number "+f);
        float g = f / 5;
        System.out.println("total percentage of this number is "+ g +"%");*/

        // or use
         float h=(a+ b + c + d + e)/5;
         System.out.println("total percentage of this number is "+ h +"%");
    }
}