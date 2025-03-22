package problem;

public class q27 {
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        if (nums.length == 0) {
            return 0;
        }
        int j= nums.length-1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==val){
                if (nums[j]==val ){
                    j--;
                    i--;
                    continue;
                }
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                k++;
            }
        }
        for (int num : nums) {
            System.out.print(num+" ");
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums ={2,0,1,2,2,3,0,4,2};
        int val=2;
        System.out.println("ans : "+removeElement(nums,val));
    }
}
