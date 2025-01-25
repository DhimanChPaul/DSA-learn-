package problem;

public class removeDuplicate {
    public static void main(String[] args) {
        int nums[]={1,2};
        int len = nums.length;
        int j = 0;
        int arr[] = new int[len - 1];
        if(len==1){
//            return 1;
            // arr[j]=nums[0];
        }
        else{
            for (int i = 0; i < len-1; i++) {
                if (nums[i] != nums[i + 1]) {
                    arr[j]=nums[i];
                    j++;

                }
            }
            // System.out.println(len);
            if(len-1 >0 ){
                arr[j] = nums[len-1];
                j++;
            }

        }

        // if(nums[len-1] != nums[len-2]){
        //     arr[j]=nums[len-1];
        //     j++;
        // }
        for(int i=0; i<j;i++){
            nums[i]=arr[i];
            System.out.println(arr[i]);
        }
//        return j;
    }

}
