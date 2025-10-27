import java.util.Random;
import java.util.Scanner;

public class P10_24FTT1804 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        

        //10.1 GreatestCommonDivisor
        // System.out.print("Enter first integer: ");
        // int num1 = input.nextInt();
        // System.out.print("Enter second integer: ");
        // int num2 = input.nextInt();

        // int gcd = findGCD(num1, num2);
        // System.out.println("The greatest common divisor for " + num1 + " and " + num2 + " is " + gcd);
        

        //10.2 - IsPalindromeReverse
        

        Random rand = new Random();
        int number = rand.nextInt(900) + 100;

        System.out.print("Enter the reverse of " + number + ": ");
        int userInput = input.nextInt();

        while (userInput < 100 || userInput > 999) {
            System.out.print("Please enter a 3-digit reverse number of " + number + ": ");
            userInput = input.nextInt();
        }

        int reversed = reverse(number);
        boolean isPalin = isPalindrome(userInput, reversed);

        System.out.println("The digit " + userInput + " is palindrome of " + number + " is " + isPalin + ".");
    }


    // 10.1
    public static int findGCD(int a, int b) {
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0)
                gcd = i;
        }
        return gcd;
    }


    // 10.2
    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

  
    public static boolean isPalindrome(int userInput, int reversed) {
        return userInput == reversed;
    }
}

