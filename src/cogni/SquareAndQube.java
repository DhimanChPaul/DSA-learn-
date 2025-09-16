package cogni;

public class SquareAndQube {
//    public static void main(String[] args) {
//        int n=64;
//        int maxSq=0;
//        int maxQu=0;
//
//        for (int i = n; i >0; i--) {
//            if (maxSq !=0 && maxQu!=0){
//                break;
//            }
//            if (Math.sqrt(i) %1==0 && maxSq == 0){
//                maxSq=i;
//            }
//
//            if (Math.cbrt(i) %1==0 && maxQu == 0){
//                maxQu=i;
//            }
//        }
//        System.out.println(maxSq+maxQu);
//    }

    public static void main(String[] args) {
        int n=4;

        int maxSq= (int) Math.sqrt(n);
        maxSq=maxSq*maxSq;
        int maxQu= (int) Math.cbrt(n);
        maxQu=maxQu*maxQu*maxQu;

        System.out.println(maxSq);
        System.out.println(maxQu);
        System.out.println(maxSq+maxQu);


    }
}
