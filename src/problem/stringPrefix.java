package problem;

import basic.string;

public class stringPrefix {
    public static String sol(String strs[]){
        String ans ="";
        char temp=' ';
        int j=0;
        int i=0;
        int len=0;
        while (j< strs.length){

            if(strs[0].charAt(j) == strs[i].charAt(j)){
//                    len++;
//                    i++;
                    i=(i+1)% strs.length;
            }
            else{
                return ans;
            }
            if (i == strs.length-1){
//                temp=strs[0].charAt(j);
                ans=ans+strs[0].charAt(j);
                j++;
            }

        }
        return ans;
    }
    class Solution {

        // Method to find the longest common prefix from an array of strings.
        public String longestCommonPrefix(String[] strs) {
            int numberOfStrings = strs.length; // Total number of strings in the array.

            // Loop through each character of the first string.
            for (int index = 0; index < strs[0].length(); ++index) {
                // Compare the character with the same position in the remaining strings.
                for (int stringIndex = 1; stringIndex < numberOfStrings; ++stringIndex) {
                    // Check two conditions here:
                    // 1. If the current string is shorter than the current character index, or
                    // 2. If the current character does not match the character in the first string.
                    // In either case, that means we've found the end of the common prefix.
                    if (strs[stringIndex].length() <= index || strs[stringIndex].charAt(index) != strs[0].charAt(index)) {
                        // Therefore, we return the substring from the start to the current index from the first string.
                        return strs[0].substring(0, index);
                    }
                }
            }

            // If we manage to check all characters of the first string without finding a mismatch,
            // it means that the entire first string is a common prefix.
            return strs[0];
        }
    }
    public static void main(String[] args) {
        String strs[] = {"flower","flow","flight"};
        System.out.println(sol(strs));

    }
}
