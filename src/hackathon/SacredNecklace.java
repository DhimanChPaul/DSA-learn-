package hackathon;
import java.util.*;

public class SacredNecklace {
    private static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }

    // Recursive function to find combinations of beads that form a perfect square
    private static void findCombinations(int[] beads, boolean[] used, int start, List<Integer> current, List<List<Integer>> result) {
        int sum = current.stream().mapToInt(Integer::intValue).sum();

        if (sum > 0 && isPerfectSquare(sum)) {
            result.add(new ArrayList<>(current));
            for (int i = 0; i < current.size(); i++) {
                used[Arrays.asList(beads).indexOf(current.get(i))] = true;
            }
            current.clear();
        }

        for (int i = start; i < beads.length; i++) {
            if (!used[i]) {
                used[i] = true;
                current.add(beads[i]);
                findCombinations(beads, used, i + 1, current, result);
                used[i] = false;
                current.remove(current.size() - 1);
            }
        }
    }

    // Function to find all valid combinations
    public static List<List<Integer>> findSacredNecklace(int[] beads) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[beads.length];
        findCombinations(beads, used, 0, new ArrayList<>(), result);
        return result;
    }

    // Main method to test the function
    public static void main(String[] args) {
        int[] beads = {1, 6, 2, 8, 8, 9};
        List<List<Integer>> result = findSacredNecklace(beads);

        // Print the result
        System.out.println("Output: " + result);
    }
}
