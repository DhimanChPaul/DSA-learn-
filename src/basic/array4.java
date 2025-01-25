package basic;



import java.util.Scanner;

public class array4 {

    static int[] reversearray(int arr[]){

        int j = 0;
        int n = arr.length;
        int [] ans = new int[n];
        for (int i = n-1; i >=0; i--) {
            ans[j++] = arr[i];

        }
//        System.out.println("reverse array is: ");
//        for (int i = 0; i < n; i++) {
//            System.out.println(ans[i]);
//        }
        return ans;


    }







    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the arr size");
        int n = sc.nextInt();

        int arr[]= new int[n];
        int arr1[]= new int[n];
        System.out.println("enter the element");
        for (int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }

       arr1=reversearray(arr);

        System.out.println("reverse array is: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr1[i]);
        }

    }
}