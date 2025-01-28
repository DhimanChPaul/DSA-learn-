package dpPW;

import java.util.*;
import java.lang.*;

public class alphabet {
    public static int noOfWay(String number, int index, int dp[]){

        if (index <= 0){
            return 1;
        }
//         if(number.charAt(index)=='0'){
//             return 0;
//
//         }
//        if (dp[index] != -1){
//            return dp[index];
//        }

        int not_combine=0;
         if((number.charAt(index) != '0') )
            not_combine=noOfWay(number, index-1,dp);

         int combine=0;
        if(number.charAt(index-1) == '1' || (number.charAt(index-1)=='2' && number.charAt(index) <= '6')){
            combine=noOfWay(number,index-2,dp);
        }
//        else{
//            not_combine+=1;
//        }
        int temp=0;
//        if (number.charAt(index-1)>'2'){
//            temp=1;
//        }

        return dp[index]=not_combine+combine+temp;


    }
    public static void main(String[] args) {
        String number ="11126";
        int dp[]=new int[number.length()];
        for (int i = 0; i < dp.length; i++) {
            dp[i]=-1;
        }

        System.out.println(noOfWay(number,number.length()-1,dp));

    }
}
