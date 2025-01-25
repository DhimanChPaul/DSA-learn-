package basic;

public class object_parenthesis {
    public static void main(String[] args) {
/*        // first work L then R
        float a=5;
        float b=3;
        float c=2;
        float x= b*a-a/c;
        *//* 3*5-5/2
           15-2.5
           12.5 *//*
        float y= a/c-c*b;
    *//* 2.5-6
    -3.5 *//*
        System.out.println(x);
        System.out.println(y);
        */

        int a=5;
        int b=9;
        System.out.println(a++);
        // here first print 'a' then 'a' valu incriment
        System.out.println(a);
        System.out.println(++b);
        // here first incriment valu of b then print incriment valu of 'b'
        System.out.println(b);
    }
}
