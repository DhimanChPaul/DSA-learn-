package hackathon;

public class fourDigit {
    public static void main(String[] args) {
        int[] digits = new int[4];

        for (digits[0] = 0; digits[0] <= 9; digits[0]++) {
            for (digits[1] = 0; digits[1] <= 9; digits[1]++) {
                for (digits[2] = 0; digits[2] <= 9; digits[2]++) {
                    int remaining = 15 - (digits[0] + digits[1] + digits[2]);
                    if (remaining >= 0 && remaining <= 9) {
                        digits[3] = remaining;
                        System.out.printf("%d%d%d%d\n", digits[0], digits[1], digits[2], digits[3]);
                    }
                }
            }
        }
    }
}

