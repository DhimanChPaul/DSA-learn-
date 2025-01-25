package basic;

public class ar1 {
    public static void main(String[] args) {
        int arr[]={5,7,8,9,1,3,4};
        int max=arr[0];

        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }
        System.out.println("max= "+max);
    }
}
