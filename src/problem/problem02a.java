package problem;

import java.util.Scanner;

public class problem02a {
        static int same(int[]arr){
            int ans=0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i+1; j < arr.length ; j++) {
                    if(arr[i]==arr[j]){
                        arr[i]=arr[j]=-1;

                    }

                }

            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]!=-1){
//                    System.out.println("unique number is "+ arr[i]);
                    ans= arr[i];
                }

            }
            System.out.println(ans);
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



            System.out.println(same(arr));
        }
    }


