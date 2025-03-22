package problem;

public class q1781 {
    public static int beautySum(String s) {

    int sum=0;
    int len=s.length();
    System.out.println(len);
   /*
    for (int i=0;i<len;i++){
        int max=0, min=0;
        String sub=s.substring(i,len);
        System.out.println("sub------> "+sub);
        for(int j = 3; j <=sub.length(); j++) {
            String part=sub.substring(0,j);
            System.out.println(part);


        }
    }

    */

        int i=0, j=3;
        while(i<s.length()-2){
         String sub=s.substring(i,j);
         System.out.println(sub);
         int max=0,min=0,temp=0;
         int k=0,l=0;

         while(k<sub.length()){
             if (sub.charAt(k)==sub.charAt(l)){
                 temp++;
             }
             if (temp==1){
                 min=temp;
             }

         }




         if (j==len){
             i++;
             j=i+3;
             System.out.println("---------------");
         }
         else{
             j++;
         }
        }



        return sum;
    }
    public static void main(String[] args) {
        String s="aabcbaa";
        System.out.println(beautySum(s));

    }
}
