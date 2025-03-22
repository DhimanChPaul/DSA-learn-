package problem;

import java.util.HashMap;
import java.util.Hashtable;

public class q242 {
    public static boolean sol(String s, String t){

        if(s.length() != t.length()){
            return false;
        }

//        Hashtable<Character, Integer> ht= new Hashtable<>();
        HashMap<Character, Integer> ht1 = new HashMap<>();
//        HashMap<Character, Integer> ht2 = new HashMap<>();

//        int count=0;

        for(int i=0 ; i<s.length(); i++){
//            for(int j=0; j<s.length(); j++){
//                if(s.charAt(i)==s.charAt(j)){
//                    count++;
//                }
//            }
            if(ht1.containsKey(s.charAt(i))){
                ht1.put(s.charAt(i), ht1.get(s.charAt(i))+1);
            }
            ht1.put(s.charAt(i), 1);
//            count=0;
        }

        for(int i=0; i<t.length(); i++){
//            for(int j=0; j<t.length(); j++){
//                if(t.charAt(i)==t.charAt(j)){
//                    count++;
//                }
//            }
//            ht2.put(t.charAt(i), count);
//            count=0;
            if (ht1.containsKey(t.charAt(i))){
                ht1.put(t.charAt(i), ht1.get(t.charAt(i))-1);
            }
//            else {
//                return false;
//            }
        }
        System.out.println(ht1.entrySet());

        for ( var pair: ht1.entrySet()){
            if ((pair.getValue() != 0)){
                return false;
            }
        }

//        for(int i=0; i<s.length();i++){
//            if(ht2.containsKey(s.charAt(i) )){
//                if(ht1.get(s.charAt(i)) != ht2.get(s.charAt(i) )){
//                    return false;
//                }
//            }
//            else {
//                return false;
//            }
//        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println(sol("rat", "car"));
    }
}
