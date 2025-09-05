package prep1;

public class LongPalindrom {

    public static String longestPalindrome(String s) {
        if (s.length() < 1){
            return s;
        }
        String ans="";
        for (int i = 1; i < s.length(); i++) {
            //odd length
            int low=i;
            int high=i;


            while (s.charAt(low) == s.charAt(high)){
                low--;
                high++;
                if (low == -1 || high == s.length()){
                    break;
                }
            }
            String temp= s.substring(low+1,high);

            if (temp.length() > ans.length()){
                ans=temp;
            }
            // even length

            low=i-1;
            high=i;


            while (s.charAt(low) == s.charAt(high)){
                low--;
                high++;
                if (low == -1 || high == s.length()){
                    break;
                }
            }
            temp= s.substring(low+1,high);

            if (temp.length() > ans.length()){
                ans=temp;
            }




        }

        return ans;
    }


    public static void main(String[] args) {
        String s= "babad";
        System.out.println(longestPalindrome(s));
    }
}
