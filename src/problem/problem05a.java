package problem;

public class problem05a {
    static void print(int []ans){
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
    static void swap(int[] arr){
        int i=0,j= arr.length-1;
        int temp;
        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
//        return arr;
    }
  /*  static int[] reverse(int[]arr){
        int n= arr.length;
        int []ans=new int[n];
        int j=0;
        for (int i = n-1; i >=0 ; i--) {
            ans[j]=arr[i];
            j++;
            for (int j = 0; j < n; j++) {
                ans[j]=arr[i];

            }

        }

        return ans;
    }
    */
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
//        System.out.println(reverse(arr));
//        int [] ans= reverse(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(ans[i]+" ");
//
//        }
       swap(arr);
        print(arr);
//        System.out.println(print(ans));

    }
}
