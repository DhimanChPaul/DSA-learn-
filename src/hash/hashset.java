package hash;

import java.util.Arrays;
import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        if (hs.add(1)){
            System.out.println();
        }else {
            System.out.println("1 already present");
        }


    }
}
