package problem;

public class q1903 {
    public static void main(String[] args) {
//        char ch='3';
//        int a= Character.getNumericValue(ch);
//        int b=Integer.parseInt(String.valueOf(ch));
//        int c= ch- '0';
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//
//        String num= "dhiman";
//        System.out.println(num.substring(0,3));
        System.out.println(0%2);

        String num="4206";
        System.out.println(num.length());


        for(int i=num.length()-1;i>=0;i--){

            int last= num.charAt(i)-'0';
            System.out.println(last);
            if(last%2 !=0 ){
//                return num.substring(0,i+1);
                System.out.println("sub: "+ num.substring(0,i+1));
//                break;
            }
        }
    }
}
