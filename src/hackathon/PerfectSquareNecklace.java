package hackathon;
import java.util.*;

public class PerfectSquareNecklace {
    public static void main(String[] args) {
        int[] beads = {1, 6, 2, 8, 8, 9};
        List<List<Integer>> result = findPerfectSquareCombinations(beads);
        System.out.println("Output: " + result);
    }

    public static List<List<Integer>> findPerfectSquareCombinations(int[] beads) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[beads.length]; // Track used beads
        findCombinations(beads, 0, new ArrayList<>(), result, used);
        return result;
    }

    private static void findCombinations(int[] beads, int start, List<Integer> current, List<List<Integer>> result, boolean[] used) {
        int sum = current.stream().mapToInt(Integer::intValue).sum();

        if (sum > 0 && isPerfectSquare(sum)) {
            result.add(new ArrayList<>(current));
            for (int i = 0; i < beads.length; i++) {
                if (current.contains(beads[i])) {
                    used[i] = true;
                }
            }
            return;
        }

        for (int i = start; i < beads.length; i++) {
            if (!used[i]) {
                current.add(beads[i]);
                findCombinations(beads, i + 1, current, result, used);
                current.remove(current.size() - 1);
                used[i] = false; // Reset usage for the backtracking process
            }
        }
    }

    private static boolean isPerfectSquare(int num) {
        if (num <= 0) return false;
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
}
//    public static void main(String[] args) {
//        int[] beads = {1, 6, 2, 8, 8, 9};
//        List<List<Integer>> result = findPerfectSquareCombinations(beads);
//        System.out.println("Output: " + result);
//    }
//
//    public static List<List<Integer>> findPerfectSquareCombinations(int[] beads) {
//        List<List<Integer>> result = new ArrayList<>();
//        findCombinations(beads, 0, new ArrayList<>(), result);
//        return result;
//    }
//
//    private static void findCombinations(int[] beads, int start, List<Integer> current, List<List<Integer>> result) {
//        int sum = current.stream().mapToInt(Integer::intValue).sum();
//
//        if (sum > 0 && isPerfectSquare(sum)) {
//            result.add(new ArrayList<>(current));
//        }
//
//        for (int i = start; i < beads.length; i++) {
//            current.add(beads[i]);
//            findCombinations(beads, i + 1, current, result);
//            current.remove(current.size() - 1);
//        }
//    }
//
//    private static boolean isPerfectSquare(int num) {
//        if (num <= 0) return false;
//        int sqrt = (int) Math.sqrt(num);
//        return sqrt * sqrt == num;
//    }
//    public static void main(String[] args) {
//        int[] beads = {1, 6, 2, 8, 8, 9};
//        List<List<Integer>> result = findPerfectSquareCombinations(beads);
//
//        System.out.println("Output: " + result);
//    }
//
//    public static List<List<Integer>> findPerfectSquareCombinations(int[] beads) {
//        List<List<Integer>> result = new ArrayList<>();
//        Arrays.sort(beads); // Sort beads for optimization
//        backtrack(beads, 0, new ArrayList<>(), result, new boolean[beads.length]);
//        return result;
//    }
//
//    private static void backtrack(int[] beads, int start, List<Integer> current, List<List<Integer>> result, boolean[] used) {
//        int sum = current.stream().mapToInt(Integer::intValue).sum();
//
//        if (sum > 0 && isPerfectSquare(sum)) {
//            result.add(new ArrayList<>(current));
//            markUsed(current, beads, used);
//        }
//
//        for (int i = start; i < beads.length; i++) {
//            if (used[i] || (i > start && beads[i] == beads[i - 1] && !used[i - 1])) {
//                continue; // Skip duplicates and already used beads
//            }
//
//            current.add(beads[i]);
//            used[i] = true;
//            backtrack(beads, i + 1, current, result, used);
//            used[i] = false;
//            current.remove(current.size() - 1);
//        }
//    }
//
//    private static boolean isPerfectSquare(int num) {
//        if (num <= 0) return false;
//        int sqrt = (int) Math.sqrt(num);
//        return sqrt * sqrt == num;
//    }
//
//    private static void markUsed(List<Integer> combination, int[] beads, boolean[] used) {
//        for (int value : combination) {
//            for (int i = 0; i < beads.length; i++) {
//                if (beads[i] == value && !used[i]) {
//                    used[i] = true;
//                    break;
//                }
//            }
//        }
//    }
//    public static void main(String[] args) {
//        int[] beads = {1, 6, 2, 8, 8, 9};
//        List<List<Integer>> result = findPerfectSquareCombinations(beads);
//
//        System.out.println("Output: " + result);
//    }
//
//    public static List<List<Integer>> findPerfectSquareCombinations(int[] beads) {
//        List<List<Integer>> result = new ArrayList<>();
//        boolean[] used = new boolean[beads.length]; // Track used beads
//        backtrack(beads, 0, new ArrayList<>(), result, used);
//        return result;
//    }
//
//    private static void backtrack(int[] beads, int start, List<Integer> current, List<List<Integer>> result, boolean[] used) {
//        int sum = current.stream().mapToInt(Integer::intValue).sum();
//        if (isPerfectSquare(sum)) {
//            result.add(new ArrayList<>(current));
//            markUsed(current, beads, used); // Mark current beads as used
//        }
//
//        for (int i = start; i < beads.length; i++) {
//            if (!used[i]) { // Skip already used beads
//                current.add(beads[i]);
//                backtrack(beads, i + 1, current, result, used);
//                current.remove(current.size() - 1);
//            }
//        }
//    }
//
//    private static boolean isPerfectSquare(int num) {
//        if (num <= 0) return false;
//        int sqrt = (int) Math.sqrt(num);
//        return sqrt * sqrt == num;
//    }
//
//    private static void markUsed(List<Integer> combination, int[] beads, boolean[] used) {
//        for (int value : combination) {
//            for (int i = 0; i < beads.length; i++) {
//                if (beads[i] == value && !used[i]) {
//                    used[i] = true;
//                    break;
//                }
//            }
//        }
//    }

