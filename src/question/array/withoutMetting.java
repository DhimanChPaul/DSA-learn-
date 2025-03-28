package question.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class withoutMetting {
    public static int countDays(int days, int[][] meetings) {
        int ans=days;

//        System.out.println("val: "+meetings[2][1]);
        System.out.println("len: "+meetings.length);
        HashMap<Integer, Integer> hm = new HashMap<>();
        HashMap<Integer, Integer> newhm = new HashMap<>();

//        int s=0;
//        int end=1;
        for (int j=0;j< meetings.length;j++){
            int min=meetings[j][0];
            int max=meetings[j][1];

            for (int i = 0; i < meetings.length; i++) {
                int s=meetings[i][0];
                int e=meetings[i][1];
                if (s<min && e>min){
                    min=s;
                }
                if (s<max && e>max) {
                    max=e;
                } else if (s<min && e> max) {
                    min=s;
                    max=e;
                }
            }
            System.out.println("min= "+min +"   max= "+max);
            hm.put(min, max);

        }
        for (Integer key : hm.keySet()) {
            int val=hm.get(key);
            System.out.println("Key: " + key + ", Value: " + hm.get(key));
            if (hm.containsKey(val)){
                newhm.put(key,hm.get(val));
                hm.remove(val);
            }else {
                newhm.put(key, val);
            }


        }

        System.out.println("newhm keys"+newhm.keySet());
//
//        System.out.println(hm.keySet());
        System.out.println(ans);
        for (Map.Entry<Integer, Integer> e : newhm.entrySet()) {
            System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
            ans=ans-(e.getValue()-e.getKey()+1);
            System.out.println(ans);
        }

        return ans;
    }

    public static void main(String[] args) {
//        int[][] arr=[[6,11],[7,13],[8,9],[5,8],[3,13],[11,13],[1,3],[5,10],[8,13],[3,9]];
        int[][] arr={{1,1},{6,11},{7,13},{8,9},{14, 16}};
//        [[6,11],[7,13],[8,9],[5,8],[3,13],[11,13],[1,3],[5,10],[8,13],[3,9]]
        int[][] arr1= {{6,11},{7,13},{8,9},{5,8},{3,13},{11,13},{1,3},{5,10},{8,13},{3,9}};

        int day=14;
        System.out.println("final ans: "+countDays(day, arr1));
    }
}

//perfect solution

//class Solution {
//    public int countDays(int days, int[][] meetings) {
//        int freeDays = 0;
//        int prevEnd = 0;
//
//        Arrays.sort(meetings, Comparator.comparingInt(meeting -> meeting[0]));
//
//        for (int[] meeting : meetings) {
//            final int start = meeting[0];
//            final int end = meeting[1];
//            if (start > prevEnd)
//                freeDays += start - prevEnd - 1;
//            prevEnd = Math.max(prevEnd, end);
//        }
//
//        return freeDays + Math.max(0, days - prevEnd);
//    }
//}
