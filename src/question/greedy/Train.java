package question.greedy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Train {
    static class Time{
        int arr;
        int dept;
        Time(int arr,int dept){
            this.arr=arr;
            this.dept=dept;
        }
    }

    static int findPlatform(int arr[], int dep[]) {
        // add your code here
        List<Time> li= new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            li.add(new Time(arr[i],dep[i] ));
        }
        li.sort((a, b) -> a.dept - b.dept);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(li.get(i).arr);
            System.out.println(li.get(i).dept);
            System.out.println("................");
        }
        int count=1;
        int lastTime=li.get(0).dept;
        for (int i = 1; i < arr.length; i++) {
            if (lastTime>li.get(i).arr){
                count++;
                if (li.get(i).dept<lastTime){
                    lastTime=li.get(i).dept;
                    continue;
                }
            }
            else {
                lastTime=li.get(i).dept;
            }
            System.out.println("lastTime "+lastTime);

        }
        System.out.println(count);
//        System.out.println(li.);
        return 0;
    }
    public static void main(String[] args) {
        int[] arr={900, 940, 950, 1100, 1500, 1800};
        int[] dept={910, 1200, 1120, 1130, 1900, 2000};
//        int[] arr={1000, 935, 1100,1243};
//        int[] dept={1200, 1240, 1130,1259};
        findPlatform(arr,dept);
    }
}
