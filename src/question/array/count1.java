package question.array;

public class count1 {
    public static int longestOnes(int[] nums, int k) {
        int ans=0;
        // int count=k;
        // int temp=0;
        for(int i=0;i<nums.length;i++){
            int count=k;
            int j=i;
            int temp=0;
            while(j<nums.length){
                if(count ==0 && nums[j]==0){
                    break;
                }
                if(nums[j]==0){
                    count--;
                }
                temp++;
                j++;
                System.out.println(j);
            }
            System.out.println("........");
            System.out.println("temp: "+temp);
            ans= Math.max(ans,temp);
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] nums={0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int ans=longestOnes(nums,3);
        System.out.println(ans);
        
    }
}

//this is two pointer aproach
//
//public static int longestOnes(int[] nums, int k) {
//    int left = 0, right = 0;
//    int zeroCount = 0;
//    int maxLen = 0;
//
//    while (right < nums.length) {
//        if (nums[right] == 0) {
//            zeroCount++;
//        }
//
//        // If we have more than k zeros, shrink window from left
//        while (zeroCount > k) {
//            if (nums[left] == 0) {
//                zeroCount--;
//            }
//            left++;
//        }
//
//        maxLen = Math.max(maxLen, right - left + 1);
//        right++;
//    }
//
//    return maxLen;
//}
//
//public static void main(String[] args) {
//    int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
//    int ans = longestOnes(nums, 3);
//    System.out.println(ans); // Output: 10
//}
//
