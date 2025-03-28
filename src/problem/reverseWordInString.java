package problem;

public class reverseWordInString {
    public static String reverseWords(String s) {
    String ans="";
    s=s.trim();
    s=s.replaceAll("\\s+"," ");
    System.out.println(s);

    if (s.isEmpty()){
        return ans;
    }
    System.out.println("len= "+s.length());
    int i=s.length()-1;
    int j=i;
    int temp=0;

        while(j >= 0){
        if (Character.isLetter(s.charAt(j)) || Character.isDigit(s.charAt(j))){
            j--;
            System.out.println(j);
            temp=j;
            System.out.println("t = "+temp);
        }
        else{
//            if (!Character.isLetter(s.charAt(j-1))){
//            j--;
//            continue;
//        }
            temp=j;
            System.out.println("temp= "+temp);
            System.out.println("i= "+i+" "+"j= "+ j);
            ans=ans + s.substring(temp+1,i+1)+" ";
            i=j-1;
            j=i-1;
        }
        }
        System.out.println(i+ " "+j);
        ans=ans + s.substring(j+1,i+1)+" ";



    return ans.trim();

    }
    public static void main(String[] args) {
       String s="  Hello    World sky  ";
//       String s="F R  I   E    N     D      S      ";
        System.out.println(reverseWords(s));
    }
}

//class Test
//{
//    static private String result(String s)
//    {
//        int left = 0;
//        int right = s.length() - 1;
//
//        String temp = "";
//        String ans = "";
//
//        //Iterate the string and keep on adding to form a word
//        //If empty space is encountered then add the current word to the result
//        while (left <= right)
//        {
//            char ch = s.charAt(left);
//            if (ch != ' ')
//            {
//                temp += ch;
//            }
//            else if (ch == ' ')
//            {
//                if (!ans.equals(""))
//                {
//                    ans = temp + " " + ans;
//                }
//                else
//                {
//                    ans = temp;
//                }
//                temp = "";
//            }
//            left++;
//        }
//
//        //If not empty string then add to the result(Last word is added)
//        if (!temp.equals(""))
//        {
//            if (!ans.equals(""))
//            {
//                ans = temp + " " + ans;
//            }
//            else
//            {
//                ans = temp;
//            }
//        }
//
//        return ans;
//    }
//    public static void main(String[] args)
//    {
//        String st = "TUF is great for interview preparation";
//        System.out.println("Before reversing words: ");
//        System.out.println(st);
//        System.out.println("After reversing words: ");
//        System.out.print(result(st));
//    }
//}





//
////        System.out.println(Character.isLetter(s.charAt(0)));
////        System.out.println(Character.isLetter(s.charAt(5)));


//class Solution {
//    public String reverseWords(String s) {
//        String words[] = s.trim().split("\\s+");
//        StringBuilder str = new StringBuilder();
//        for(int i=words.length-1;i>0;i--){
//            str.append(words[i]);
//            str.append(" ");
//        }
//        str.append(words[0]);
//
//        return str.toString();
//    }
//}
