package T9;

public class DigitsWithSpace {
    public static void main(String[] args) {
        printDigits(123456789);
    }
    public static void printDigits(int number) {
        // base case  is here, prints single digit
        if (number < 10) {
            System.out.print(number + " ");
            return;
        }
        // recursive case, prints it from left to right
        printDigits(number / 10); // recursively call the method with the number excluding the last digit
        System.out.print(number % 10 + " "); // print the last digit
    }
}
