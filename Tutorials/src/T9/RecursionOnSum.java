package T9;

public class RecursionOnSum {
    public static void main(String[] args) {
        int sum = calculateSum(5);
        System.out.println(sum); // Output: 15
    }
    public static int calculateSum(int n) {
        // Base case: if n is 1, return 1
        if (n == 1) {
            System.out.println("Step: " + n);
            return 1;
        }

        // Recursive case: add n to the sum of numbers from (n-1) recursively
        int sum = n + calculateSum(n - 1);
        System.out.println("Step: " + n + ", Partial sum: " + sum);
        return sum;
    }
}
