/*  6. Write a Java method to compute the sum of digits in an integer.
Test Data:
Input an integer: 25
Expected Output:

The sum is 7  */

import java.util.Scanner;

public class Method06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int inputNumber = scanner.nextInt();

        System.out.println("The sum is "+sumOfDigits(inputNumber));
    }

    public static int sumOfDigits(int num){
        int result = 0;

        while(num != 0){
            result += num % 10;
            num /= 10;
        }
        return result;
    }
}
