package basic;

import java.util.ArrayList;

public class arrli {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.set(2,40);

        int num =5;
        System.out.println(Integer.toBinaryString(num));

        System.out.println(list.size());
        System.out.println(list.get(1));
        System.out.println(list.remove(0));
        System.out.println(list.get(1));
    }
}
