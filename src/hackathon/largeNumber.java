package hackathon;
import java.util.*;

public class largeNumber {
    public static void main(String[] args) {
        int number=3241;
        char[] digits = Integer.toString(number).toCharArray();
        Arrays.sort(digits);
        StringBuilder largestNumber = new StringBuilder(new String(digits)).reverse();

        System.out.println(Integer.parseInt(largestNumber.toString()));
//         Integer.parseInt(largestNumber.toString());
    }
}
