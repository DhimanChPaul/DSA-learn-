package problem;

import basic.string;

import java.util.HashMap;
import java.util.Map;

public class q451 {
    public static void main(String[] args) {
        String s="ccAabcb";
        int time=0;
        String ans="";
        Map<Character, Integer> hm= new HashMap<>();
        int j=0;
        System.out.println(s.length());
        int i=j;
//        while(j < s.length()){
//
////        for(int i=j;i<s.length();i++){
//            if(s.charAt(j)==s.charAt(i)){
//                time++;
//            }
////            System.out.println(i);
//            if(i == (s.length()-1) && !hm.containsKey(s.charAt(j))){
//                hm.put(s.charAt(j),time);
//                j++;
//                System.out.println(i);
//            }
//            i=(i+1)%(s.length()-1);
//        }
        for (int k = 0; k < s.length(); k++) {
            for (int l = k; l < s.length(); l++) {
                if (s.charAt(k)==s.charAt(l)){
                    time++;
                }
            }
            if (!hm.containsKey(s.charAt(k))){
                hm.put(s.charAt(k),time);
            }
               time=0;
        }

        System.out.println(hm.keySet());
        System.out.println(hm.values());
        System.out.println(hm.entrySet());
//        System.out.println(hm.keySet().[hm.size()-1]);

        Character key[] =hm.keySet().toArray(new Character[0]);
        Integer value[] =hm.values().toArray(new Integer[0]);
        for (int k = 0; k < key.length; k++) {
            System.out.println(key[k]);
            System.out.println(value[k]);
        }
//        return ans;

    }
}
