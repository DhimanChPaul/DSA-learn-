package hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class impli {
    public static void main(String[] args) {
        HashMap<String, Integer> map=new HashMap<>();

        map.put("dhi",71);
        map.put("ch",72);
        map.put("paul",73);

        System.out.println(map.get("dhi"));
        System.out.println(map.containsKey("dhi"));
        System.out.println(map.containsValue(73));
        System.out.println(map.getOrDefault("paul",74));
        System.out.println(map);


        HashSet<Integer> set=new HashSet<>();
        set.add(30);
        set.add(378);
        set.add(310);
        set.add(130);
        set.add(30);

        System.out.println(set);
        System.out.println(set.hashCode());

    }
}
