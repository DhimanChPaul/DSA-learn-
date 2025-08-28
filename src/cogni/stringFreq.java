package cogni;

import java.util.HashMap;
import java.util.TreeMap;

public class stringFreq {
    public static int solve(String s) {
        int[] charFreq = new int[26];   // for A-Z
        int[] freqOfFreq = new int[s.length() + 1]; // max freq can be N

        int maxCount = 0;
        int result = Integer.MAX_VALUE;

        for (char ch : s.toCharArray()) {
            int idx = ch - 'A';

            // remove old frequency contribution
            if (charFreq[idx] > 0) {
                freqOfFreq[charFreq[idx]]--;
            }

            // update new frequency
            charFreq[idx]++;
            freqOfFreq[charFreq[idx]]++;

            // track max in real-time
            int newFreq = charFreq[idx];
            int count = freqOfFreq[newFreq];

            if (count > maxCount || (count == maxCount && newFreq < result)) {
                maxCount = count;
                result = newFreq;
            }
        }

        return result;
    }

    public static int count(String s){
        int len=s.length();
        System.out.println(len);
        HashMap<Character, Integer> map= new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map.values());
        System.out.println(map.entrySet());

        TreeMap<Integer, Integer> freq= new TreeMap<>();
        for (int i: map.values() ) {
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        System.out.println(freq.values());
        System.out.println(freq.entrySet());


        int maxCount = 0;
        int result = Integer.MAX_VALUE;

        for (var entry : freq.entrySet()) {
            int freq1 = entry.getKey();   // e.g., 2, 3, 4
            int count = entry.getValue(); // how many chars had this freq

            if (count > maxCount || (count == maxCount && freq1 < result)) {
                maxCount = count;
                result = freq1;
            }
        }

        System.out.println("result: "+result);


        return result;
    }
    public static void main(String[] args) {
        String s="ABBCADABDDACCDFGG";
        int ans=count(s);
        System.out.println(ans);

    }
}
