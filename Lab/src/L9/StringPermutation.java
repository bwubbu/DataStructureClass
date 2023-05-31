package L9;

public class StringPermutation {
    public static void main(String[] args) {
        permuteString("why");
    }
    public static void permuteString(String str) {
        permuteString("", str);
    }

    private static void permuteString(String prefix, String suffix) {
        // Base case: if the suffix is empty, we have found a permutation
        if (suffix.isEmpty()) {
            System.out.println(prefix);
            return;
        }

        // Recursive case: take out the first character and permute the remaining characters
        for (int i = 0; i < suffix.length(); i++) {
            char currentChar = suffix.charAt(i);
            String newPrefix = prefix + currentChar;
            String newSuffix = suffix.substring(0, i) + suffix.substring(i + 1);
            permuteString(newPrefix, newSuffix);
        }
    }
}
