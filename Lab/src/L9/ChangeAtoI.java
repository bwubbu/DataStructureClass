package L9;

public class ChangeAtoI {
    public static void main(String[] args) {
        String result = wordChanger("flabbergasted");
        System.out.println(result); // Output: "flibbergisted"

        String result2 = wordChanger("Astronaut");
        System.out.println(result2); // Output: " Astroniut"
    }
    public static String wordChanger(String str) {
        // Base case: if the string is empty, return an empty string
        if (str.isEmpty()) {
            return "";
        }
            // Recursive case: substitute "a" with "i" if it is a lowercase "a"
        char firstChar = str.charAt(0);
        char substituteChar = (firstChar == 'a') ? 'i' : firstChar;

            // Recursively call the function with the remaining substring and concatenate the substituted character
        return substituteChar + wordChanger(str.substring(1));
    }
}

