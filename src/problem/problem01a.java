package problem;

import java.util.Scanner;
public class problem01a {
    static int pair(int[]arr, int target){
        int n= arr.length;
        int ans=0;
        for (int j = 0; j <n; j++) {
            for (int l = j+1; l <n ; l++) {
                for (int i = l+1; i <n; i++) {
                int k=arr[j]+arr[i]+arr[l];
                if (k==target){
                   ans++;
                }

            }
            }
        }
//        System.out.println(ans);
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
        System.out.println("enter terget sum");
        int target= sc.nextInt();


        System.out.println(pair(arr,target));
    }
}
