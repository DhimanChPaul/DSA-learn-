package basic;

public class hacathon01 {
    public static void main(String[] args) {
       int []arr= {8,5,4,2};
       int temp;
//       int i=0;



        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
               if (arr[i]>arr[j]){
                   temp= arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
            }

        }


        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]);

        }

    }
}
