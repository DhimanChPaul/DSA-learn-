package prep1;

import java.util.Scanner;

public class numberToWord {
    private static final String[] units = {
            "", "One", "Two", "Three", "Four", "Five",
            "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen",
            "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] tens = {
            "", "", "Twenty", "Thirty", "Forty",
            "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    private static String convert(int n) {
        if (n < 20) return units[n];
        if (n < 100) return tens[n / 10] + (n % 10 != 0 ? " " + units[n % 10] : "");
        if (n < 1000) return units[n / 100] + " Hundred" + (n % 100 != 0 ? " " + convert(n % 100) : "");
        if (n < 1000000) return convert(n / 1000) + " Thousand" + (n % 1000 != 0 ? " " + convert(n % 1000) : "");
        if (n < 1000000000) return convert(n / 1000000) + " Million" + (n % 1000000 != 0 ? " " + convert(n % 1000000) : "");
        return convert(n / 1000000000) + " Billion" + (n % 1000000000 != 0 ? " " + convert(n % 1000000000) : "");
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num = sc.nextInt();
        int num=1000000;
        System.out.println(num);

        if (num == 0) {
            System.out.println("Zero");
        } else {
            System.out.println(convert(num));
        }
    }
}
