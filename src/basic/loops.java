package basic;

public class loops{
    public static void main(String[] args) {
//        // while first check condition then print if condition satisfy
//        int a=0;
//        while (a<=10){
//            System.out.println( a);
//            a++;
//        }
//        // but do while first print then check condition
//        int b =100;
//        do {
//            System.out.println(b);
//            b++;
//        }
//        while (b<5);
//    }
        for (int a=1; a<5; a++){
            System.out.print(a);
            System.out.println(" I am lerning java");
            if(a==3){
                System.out.println("ok bey");
                //break lopp a dile loop kaj kora bondho kore dey jokhon e condition satisfy hobe
                break;
            }


        }
        for (int b=1; b<5; b++){
            System.out.print(b);
            System.out.println(" I am lerning");
            if(b==2){
                System.out.println("anything");
                continue;
// jokhan continu dibe tokhn condition satisfy hole tar pore ja kichu thakbe ta print hobe na
                //kintu pore aber loop suru hobe
            }
            System.out.println(" plz print my sentence after 2");

}
}}
