package problem;

public class pr2308 {
    public static void main(String[] args) {
        String expression = "1/3-1/2";
        int mul=1;
        int sum=0;
        String[] nums = expression.split("/|(?=[-+])");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        for (int i = 1; i < nums.length ; i+=2) {
            mul=mul*Integer.parseInt(nums[i]);
        }
        System.out.println("mul= "+mul);
        for (int i = 0; i < nums.length; i+=2) {
            sum+=Integer.parseInt(nums[i])*(mul/Integer.parseInt(nums[i+1]));

        }
        System.out.println("sum= "+sum);

        int Num1=mul, Num2=sum, Temp, GCD=0;
        while(Num2 != 0)
        {
            Temp = Num2;
            Num2 = Num1 % Num2;
            Num1 = Temp;
        }
        GCD = Num1;

        System.out.println("\n GCD =  " + GCD);
        System.out.println("\n GCD =  " + Math.abs(GCD));
        GCD=Math.abs(GCD);

        mul=mul/GCD;
        sum=sum/GCD;


        String mul1=Integer.toString(mul);
        String sum1=Integer.toString(sum);
        System.out.println(mul1);
        System.out.println(sum1);

        String ans=sum1+"/"+mul1;
        System.out.println(ans);

    }
}
