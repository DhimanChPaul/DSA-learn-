package bitManupulation;

public class singleElement {
    public static void main(String[] args) {
        int arr[] ={1,3,5,2,6,7,4,3,2,1,5,7,4};
        int ans=0;

        for (int i = 0; i < arr.length; i++) {
            ans=ans^arr[i];
        }

        System.out.println(ans);
        System.out.println(8^10);
        System.out.println(Integer.toBinaryString(8));
        System.out.println(Integer.toBinaryString(10));
        System.out.println(0b1000^0b1010);

    }
}
