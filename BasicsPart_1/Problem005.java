/*  5. Write a Java program that takes two numbers as input and displays the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output : 25 x 5 = 125  */

import java.util.Scanner;

public class Problem005 {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.print("Input First Number: ");
        int num1 = get.nextInt();
        System.out.print("Input Second Number: ");
        int num2 = get.nextInt();

        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
    }
}
