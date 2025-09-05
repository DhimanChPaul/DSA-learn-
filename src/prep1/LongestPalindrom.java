package prep1;

import java.util.Objects;

public class LongestPalindrom {

    static boolean checkPalindrom(String s, int l, int r){
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    static String shift(String s, int l, int r){
        if (Objects.equals(s, "") || s.length() == 1){
            return s;
        }
        if (s.charAt(l) == s.charAt(r) && checkPalindrom(s,l,r)){
            return s.substring(l,r+1);
        }
//        return shift(s,l,r-1)+shift(s,l+1,r);
        String left = shift(s, l, r-1);
        String right = shift(s, l+1, r);
        return left.length() > right.length() ? left : right;


    }

    public static String longestPalindrome(String s) {

        return shift(s,0,s.length()-1);
    }

    public static void main(String[] args) {
        String s= "babad";

        System.out.println(longestPalindrome(s));
    }
}
