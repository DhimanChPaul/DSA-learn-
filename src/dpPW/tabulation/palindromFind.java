package dpPW.tabulation;

import java.util.ArrayList;
import java.util.List;

public class palindromFind {

    public static boolean isPalindrom(String s){
        int l=0;
        int r=s.length()-1;
        while(l<=r){
            if (s.charAt(l++) != s.charAt(r--)){
                return false;
            }
        }
        return true;
    }

    public static void rec(int idx, String s, List<List<String>> ans, List<String> temp){

        if(idx== s.length()){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = idx; i < s.length(); i++) {
            String curr=s.substring(idx,i+1);
            if (isPalindrom(curr)){
                temp.add(curr);
                rec(i+1,s,ans,temp);
                temp.remove(temp.size()-1);
            }
        }
    }


    public static void main(String[] args) {
        String s="aab";
        List<List<String>> li= new ArrayList<>();
        List<String> temp= new ArrayList<>();
        rec(0,s,li,temp);
        System.out.println(li);
    }
}
