package question.heapQ;

import java.util.HashMap;

public class taskSedular {
    public static int leastInterval(char[] tasks, int n) {
        int ans=0;
        HashMap<Character, Integer> map= new HashMap<>();
//        for (int i = 0; i < tasks.length; i++) {
//            map.put(tasks[i], map.getOrDefault(tasks[i], 0)+1);
//        }
        for (char task : tasks) {
            map.put(task, map.getOrDefault(task, 0) + 1);
        }
        System.out.println(map.entrySet());


        return ans;
    }
    public static void main(String[] args) {
        char[] arr={'a','c','b','a','b','a'};
//        leastInterval(arr,2);'c','c','d','d','d','d','d'
        System.out.println(leastInterval(arr,2));
    }
}
