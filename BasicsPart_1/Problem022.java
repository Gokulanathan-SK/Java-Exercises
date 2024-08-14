/*
22. Write a Java program to convert a binary number to a decimal number.
Input Data:
Input a binary number: 100
Expected Output

Decimal Number: 4
*/

import java.util.Scanner;

public class Problem022 {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.print("Input a Binary Number: ");
        int binaryNumber = get.nextInt();

        int lastDigit, decimalNumber = 0, base = 1;

        while(binaryNumber > 0){
            lastDigit = binaryNumber % 10;
            decimalNumber += lastDigit * base;
            base *= 2;
            binaryNumber /= 10;
        }

        System.out.println("Decimal Number is: " + decimalNumber);
    }
}
