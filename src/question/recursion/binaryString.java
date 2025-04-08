package question.recursion;

import java.util.ArrayList;
import java.util.List;

public class binaryString {
    public static void generate(int n, int i,String str, List<String> li){

        if (i==n){
            li.add(str);
            return;
        }
        //either pick 0
        generate(n,i+1,str+"0",li);

        //if last character is 1 then did not pick 1
        //either pick 1
        if (i==0 || str.charAt(i-1)!='1'){
            generate(n,i+1,str+"1",li);
        }

    }
    public static List<String> generateBinaryStrings(int n) {
        // code here
        List<String> li= new ArrayList<>();
        generate(n,0,"",li);
        return li;

    }
    public static void main(String[] args) {
        int n=3;

        List<String> li=generateBinaryStrings(4);
        for (String s : li) {
            System.out.println(s);
        }
    }
}
