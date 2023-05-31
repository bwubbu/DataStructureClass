package T9;

public class T9Ans {
    /*
    1. Explain the problem that occurs when executing the recursive method f(0).
        public static int f(int n) {
            if (n == 1)
                return n;
            else
                return n * f(n-1);
        }

        The recursive method calls itself with a decreasing value of n,
        but it lacks a condition to stop the recursion when n reaches a specific value.
        As a result, the recursive calls continue indefinitely, consuming stack memory until it exceeds its limit,
        causing stack overflow error.

    2. Explain the problem that occurs when executing the recursive method f().
        public static int f(int n) {
            if (n == 0)
                return n;
        else
            return f(n+1) + n;
        }

        The recursive method f() has two cases:
        Base case: When the input n is 0, the method returns 0.
        Recursive case: For any other value of n, the method makes a recursive call to itself with n+1 as the input and adds n to the result.

        The problem occurs because the method doesn't have a stopping condition to end the recursion.
        As a result, the recursive calls keep happening indefinitely, causing the method to run forever.


    3. Write a recursive method to reverse a string.
        String → gnirts

        public static String reverseString(String str) {
        // Base case: if the string is empty or has only one character, return the string itself
        if (str.isEmpty() || str.length() == 1) {
            return str;
        }

        // Recursive case: reverse the substring starting from the second character and concatenate the first character at the end
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    4. Write a recursive method to calculate the following :
        5 + 4 + 3 + 2 + 1.
       State the base case and recursive case. Trace your solution using number, N of 5.
       Algorithm :
       1. Base case = 1
       2. Recursive case = n + sum(n-1)

    5. Write a recursive method printDigit that prints an integer argument as its constituent digits,
       with a blank space separates each digit with the next. For example, if the argument is 4567,
       this method will print 4 5 6 7 on the screen.

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
    */
}
