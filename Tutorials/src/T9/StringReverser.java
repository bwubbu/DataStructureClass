package T9;

public class StringReverser {
    public static void main(String[] args) {
        String reversed = reverseString("How ya doin");
        System.out.println(reversed); // Output: gnirtS
    }
    public static String reverseString(String str) {
        // Base case: if the string is empty or has only one character, return the string itself
        if (str.isEmpty() || str.length() == 1) {
            return str;
        }

        // Recursive case: reverse the substring starting from the second character and concatenate the first character at the end
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}