package L9;
public class Exponentiation {
    public static void main(String[] args) {
        long result = exponent(5, 3);
        System.out.println(result);
    }
    public static long exponent(int x, int y) {
        // Base case: if y is 0, return 1 (x^0 = 1)
        if (y == 0) {
            return 1;
        }

        // Recursive case: compute x^(y-1) and multiply it by x
        return x * exponent(x, y - 1);
    }
}
