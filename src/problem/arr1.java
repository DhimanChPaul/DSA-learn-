package problem;

public class arr1 {

    public static int maxArea(int[] height) {
        int hi=0;
        int mi=0;
        int len=height.length;
        int temp=0;

        for(int i=0;i<len-2;i++){

            for(int j=i+1;j<len-1;j++){
                mi=Math.min(height[i],height[j]);
                temp=mi*(j-i);
                System.out.print(temp+" ");
                // if(height[i]<=height[j]){
                //     temp=height[i]*(j-i);
                // }
                // else{
                //     temp=height[j]*(j-i);
                // }
                hi=Math.max(hi,temp);
            }
            System.out.println(" ");

            System.out.println("hi= "+hi);


            // if(hi < temp){
            //     hi=temp;
            // }
        }
        return hi;
    }

    public static void main(String[] args) {
        int arr[]={2,3,4,5,18,17,6};
        int a= maxArea(arr);
//        System.out.println(arr[4]);
        System.out.println(a);
    }
}
