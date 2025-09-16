package cogni;

public class countNumber {
    public static String countAndSay(int n) {
        StringBuilder ans= new StringBuilder();
        int count=1;
        int temp=0;
        while(n>0){
            temp=n%10;
            n=n/10;
            if(n%10 == temp){
                count++;
            }
            else{
                ans.append(temp).append(count);
                count=1;
            }

        }
//        ans.append(temp).append(count);
        ans.reverse();

        return ans.toString();
    }
    public static void main(String[] args) {
        System.out.println(countAndSay(337222255));
    }
}

//public String countAndSay(int n) {
//
//    int num=1;
//
//    for(int i=1;i<n;i++){
//        int count=1;
//        StringBuilder ans= new StringBuilder();
//
//        while(num>0){
//            int temp=num%10;
//            num=num/10;
//            if(num%10 == temp){
//                count++;
//            }
//            else{
//                ans.append(temp).append(count);
//                count=1;
//            }
//
//        }
//        // ans.append(temp).append(count);
//        num =Integer.parseInt(ans.reverse().toString());
//
//    }
//    System.out.println(num);
//
//
//    return num+"";
//}
