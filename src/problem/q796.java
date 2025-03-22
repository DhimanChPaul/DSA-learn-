package problem;

import java.util.ArrayList;
import java.util.List;

public class q796 {
    public static void main(String[] args) {
           String s="defdefdefabcabc";
        String goal="defdefabcabcdef";
        List<Integer> li = new ArrayList<>();

        int i=0;
        while(i<s.length()){
            if(s.charAt(i)==goal.charAt(0)){
                li.add(i);
            }
            i++;
        }
        System.out.println(li);
//        int j=0;
        for (int k = 0; k < li.size(); k++) {
            i= li.get(k);
            System.out.println("list of i: "+i);
            for (int j = 0; j < s.length(); j++) {
                System.out.println("i: "+i);
                System.out.println("j : "+j);
                if (j==s.length()-1){
                    System.out.println("true");
                }
                if (s.charAt(i) != goal.charAt(j)){
                    if (k == li.size()-1){
                        System.out.println(false);
                    }

                    break;
                }
//                j++;
                i=(i+1)%s.length();
            }
        }




    }
}
