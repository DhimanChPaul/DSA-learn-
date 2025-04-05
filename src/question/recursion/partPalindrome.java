package question.recursion;

import basic.string;

import java.util.ArrayList;
import java.util.*;

public class partPalindrome {

    public static boolean isPalindrom(String s, int start, int end){

        while(start<end){
            System.out.println(start+ " char: "+s.charAt(start));
            System.out.println(end+ " char: "+s.charAt(end));
            if (s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void part(List<List<String>> list,List<String> temp, String s, int idx){

        if (idx==s.length()){
            list.add(new ArrayList<>(temp));
            return;
        }
        for (int i = idx; i < s.length(); i++) {
            if (isPalindrom(s,idx,i)){
                temp.add(s.substring(idx,i+1));
                part(list,temp,s,i+1);//this is for first partiton and it go for next partition
                temp.remove(temp.size()-1);// and this is for that anything add with them using for loop

            }
        }

    }


    public static List<List<String>> partition(String s) {

        List<List<String>> list= new ArrayList<>();
        List<String> temp= new ArrayList<>();

        part(list,temp,s,0);

        return list;
    }

    public static void main(String[] args) {
        String s="acba";
//        List<List<String>> list= new ArrayList<>();
//        list=partition(s);

        System.out.println(isPalindrom(s,0,2));


    }
}


//public class Solution {
//    public List<List<String>> partition(String s) {
//        List<List<String>> result = new ArrayList<>();
//        backtrack(s, 0, new ArrayList<>(), result);
//        return result;
//    }
//
//    private void backtrack(String s, int start, List<String> path, List<List<String>> result) {
//        // If we've reached the end of the string, add the current partition to the result list
//        if (start == s.length()) {
//            result.add(new ArrayList<>(path));
//            return;
//        }
//        // Explore all possible partitions
//        for (int end = start + 1; end <= s.length(); end++) {
//            // If the current substring is a palindrome, add it to the current path
//            if (isPalindrome(s, start, end - 1)) {
//                path.add(s.substring(start, end));
//                // Recur to find other partitions
//                backtrack(s, end, path, result);
//                // Backtrack to explore other partitions
//                path.remove(path.size() - 1);
//            }
//        }
//    }
//
//    private boolean isPalindrome(String s, int left, int right) {
//        // Check if the substring s[left:right+1] is a palindrome
//        while (left < right) {
//            if (s.charAt(left++) != s.charAt(right--)) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//}
