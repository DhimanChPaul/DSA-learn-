package basic;

import java.util.Arrays;


public class arrayLern {
    static void swap(int[] arry,int index1, int index2){
        int temp=arry[index1];
        arry[index1]=arry[index2];
        arry[index2]=temp;
    }
    static int max(int[] arry){
        int maxval=arry[0];
        for (int i = 0; i < arry.length; i++) {
        if (arry[i]>maxval){
          maxval=arry[i];
        }
        }
        return maxval;
    }
    static void reverse(int[] arry){
        int start= 0;
        int end= arry.length-1;
        while(end>start){
            swap(arry,start,end);
            start++;
            end--;

        }
    }
    public static void main(String[] args) {
//        int[] arr= new int[];
        int[] arry={1,2,4,99,12};
        swap(arry, 1,3);
        System.out.println(Arrays.toString(arry));
        System.out.println(max(arry));
        reverse(arry);
        System.out.println(Arrays.toString(arry));
    }

}
