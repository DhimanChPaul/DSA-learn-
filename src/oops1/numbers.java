package oops1;

public class numbers {
    int  sum(int a, int b){
        System.out.println(a+b);

        return a+b;
     }
      int sum( int a, int b, int c){
        System.out.println(a+b+c);
        
        return a+b+c;
     }

    public static void main(String[] args) {
        numbers a= new numbers();
        a.sum(54,69);
        a.sum(536, 67,78);

    }
}


