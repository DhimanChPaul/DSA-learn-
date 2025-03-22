package problem;

import java.util.Objects;

public class q8 {
    public static int myAtoi(String s) {

        if(s.trim().isEmpty()){
            return 0;
        }
//        if (s.length()>10){
//            return Integer.MAX_VALUE;
//        }
        int ans=0;
        String temp="";
        // s=s.replaceAll("\\s+","");
        s=s.trim();
        System.out.println("string: "+s);
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' '){
                break;
            }
            if (i==0 && (s.charAt(i)=='-' ||s.charAt(i)=='+' )){
                temp=temp+s.charAt(i);
                if(s.length()==1){
                    return 0;
                }
                if(!Character.isDigit(s.charAt(i+1))){
                    return 0;
                }
            }
            else if (Character.isDigit(s.charAt(i))) {
                temp=temp + s.charAt(i);
            }
            else {
                if(temp.isEmpty()){
                    return 0;
                }
                ans=Integer.parseInt(temp);
                System.out.println(temp);
                return ans;
            }
        }
        if(temp.isEmpty()){
            return 0;
        }
        System.out.println("temp: "+temp);
        if (Integer.MIN_VALUE > Long.parseLong(temp)){
            return Integer.MIN_VALUE;
        }
        if(Integer.MAX_VALUE < Long.parseLong(temp)){
            return Integer.MAX_VALUE;
        }
        ans=Integer.parseInt(temp);

        return ans;


    }
    public static void main(String[] args) {
        // String s=" -112-3u3761867";
        //String s="-91283472332";
        String s="    -0  123";
        System.out.println(myAtoi(s));
    }
}


class Solution {
    public int myAtoi(String s) {
        if (s == null) return 0;
        int n = s.length();
        if (n == 0) return 0;
        int i = 0;
        while (s.charAt(i) == ' ') {

            if (++i == n)
                return 0;
        }
        int sign = 1;
        if (s.charAt(i) == '-') sign = -1;
        if (s.charAt(i) == '-' || s.charAt(i) == '+') ++i;
        int res = 0, flag = Integer.MAX_VALUE / 10;
        for (; i < n; ++i) {

            if (s.charAt(i) < '0' || s.charAt(i) > '9') break;

            if (res > flag || (res == flag && s.charAt(i) > '7'))
                return sign > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            res = res * 10 + (s.charAt(i) - '0');
        }
        return sign * res;
    }
}

class Solution1 {
    public int myAtoi(String z) {
        long result=0;
        int sign=1,i=0;
        String s=z.trim();
        int len=s.length();
        if(i<len && (s.charAt(i)=='+' || s.charAt(i)=='-')){
            sign=(s.charAt(i)=='-')?-1:1;
            i++;
        }
        while(i<len && Character.isDigit(s.charAt(i))){
            int d=s.charAt(i)-'0';
            if(result>(Integer.MAX_VALUE-d)/10){
                return (sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            result=result*10+d;
            i++;
        }
        return (int)(result*sign);
    }
}
