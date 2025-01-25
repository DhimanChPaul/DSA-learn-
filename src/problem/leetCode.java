package problem;

public class leetCode {
    public static void main(String[] args) {
        int x=-121;
        int sum= 0,a,temp;
        temp=x;
        while(x!=0){
            a=x%10;
            sum=sum*10+a;
            x=x/10;
        }
//        if(temp == sum){
//            return true;
//        }
//        else{
//            return false;
//        }
        System.out.println(sum);
    }
    }


