package question.str;

import java.util.HashMap;
import java.util.Map;

public class stringMatch {
    private static int prime=101;

    public static double hash(String str){
        double hash=0;

        for (int i = 0; i < str.length(); i++) {
            hash= hash+str.charAt(i)*Math.pow(prime,i);
            System.out.println(hash);
        }
        System.out.println("hash: "+hash);

        return hash;
    }

    private static double updateHash(double prevHas,char oldChar, char newChar, int patternLength ){
        double newHash=(prevHas- oldChar)/prime;
        newHash= newHash+newChar* Math.pow(prime, patternLength-1);
        return newHash;
    }

    public static void search(String text, String pattern){
        int patternLength=pattern.length();

        double patternHash=hash(pattern);
        double textHash=hash(text.substring(0,patternLength));

        for (int i = 0; i <= text.length()-patternLength; i++) {
            if (textHash == patternHash){
                if (text.substring(i,i+patternLength).equals(pattern)){
                    System.out.println("found at index : "+i);
                }
            }
            if (i < text.length()-patternLength){
                textHash=updateHash(textHash,text.charAt(i),text.charAt(i+patternLength),patternLength);
            }
        }


    }


    public static void main(String[] args) {
        String str="hello";
//        Map<Character,Integer> key= new HashMap<>();
        search("kbsdvbhellohabsfkbhello",str);

    }
}
