package problem;

import java.util.Scanner;

public class problem06a {
    static int[] reverse(int[] arr, int k){
        int n= arr.length;
        k=k%n;

        for (int i = 0; i <k ; i++) {
            int temp= arr[i];
            arr[i]= arr[k-1];
            arr[k-1]=temp;
            k--;
        }
        for (int i = k; i <n ; i++) {
            int temp= arr[i];
            arr[i]= arr[n-1];
            arr[n-1]=temp;
            n--;
        }
        for (int i = 0; i <n ; i++) {
            int temp= arr[i];
            arr[i]= arr[n-1];
            arr[n-1]=temp;
            n--;
        }
  return arr;
    }
//    static void rotateplace(int[] arr, int k){
//        k=k% arr.length;
//
//        reverse(arr);
//
//    }
    static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

        }
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        System.out.println("enter target element");
        Scanner sc=new Scanner(System.in);
        int k= sc.nextInt();
       reverse(arr,k);
       print(arr);
    }
}
