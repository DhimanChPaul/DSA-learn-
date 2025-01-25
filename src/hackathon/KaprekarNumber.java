package hackathon;

public class KaprekarNumber {
    public static void main(String[] args) {
        int number=46;
        if (number == 1) {
//            return true; // 1 is a Kaprekar number
            System.out.println("True");
        }

        long square = (long) number * number; // Calculate square of the number
        String squareStr = Long.toString(square); // Convert square to string

        for (int i = 1; i < squareStr.length(); i++) {
            String leftPart = squareStr.substring(0, i); // Left part of the square
            String rightPart = squareStr.substring(i); // Right part of the square

            // Parse parts to integers
            int left = Integer.parseInt(leftPart);
            int right = Integer.parseInt(rightPart);

            // If the sum of parts equals the original number
            if (right > 0 && left + right == number) {
//                return true;
                System.out.println("true");
            }
        }

//        return false;
        System.out.println("False");
    }
}
