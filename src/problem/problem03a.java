package problem;

import java.util.Scanner;

public class problem03a {
    static int max(int[]arr){
        int mi=Integer.MIN_VALUE;
    int ans=Integer.MIN_VALUE;
    int n=0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[i]>arr[j]) {
//                    arr[j]=0;
//
//                }
//            }
//
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] !=0 ) {
//                ans=arr[i];
//
//            }
//
//        }
        for (int i = 0; i < arr.length; i++) {
            if(mi<arr[i]){
                mi=arr[i];

            }

        }

        for (int i = 0; i < arr.length; i++) {
            if(mi==arr[i]){
                arr[i]=Integer.MIN_VALUE;

            }

        }
        for (int i = 0; i < arr.length; i++) {
            if(ans<arr[i]){
                ans=arr[i];

            }

        }

    return ans;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n= sc.nextInt();
        int[]arr=new int[n];
        System.out.println("enter "+n+" element");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }



        System.out.println(max(arr));
    }
}

