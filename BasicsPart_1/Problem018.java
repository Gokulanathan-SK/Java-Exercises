/*  18. Write a Java program to multiply two binary numbers.
Input Data:
Input the first binary number: 10
Input the second binary number: 11
Expected Output:

Product of two binary numbers: 110  */

import java.util.Scanner;

public class Problem018 {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.print("Input First Binary Number: ");
        int binNumber1 = get.nextInt();
        System.out.print("Input Second Binary Number: ");
        int binNumber2 = get.nextInt();

        int decimalNum1 = binaryToDecimal(binNumber1);
        int decimalNum2 = binaryToDecimal(binNumber2);

        int multiplyOfDecimals = decimalNum1 * decimalNum2;
        int binaryProduct = decimalToBinary(multiplyOfDecimals);

        System.out.println("\nProduct of Two Binary Numbers: "+ binaryProduct);
        }

        public static int binaryToDecimal(int binaryNumber){
            int decimalNumber = 0;
            int base = 1; // 2^0

            while(binaryNumber > 0){
                int lastDigit = binaryNumber % 10;
                decimalNumber += lastDigit * base;
                base *= 2;
                binaryNumber /= 10;
            }
            return decimalNumber;
        }

        public static int decimalToBinary(int decimalNumber){
            int binaryNumber = 0;
            int base = 1; //2^0

            while(decimalNumber > 0){
                int remainder = decimalNumber % 2;
                decimalNumber /= 2;
                binaryNumber += remainder * base;
                base *= 10;
            }
            return binaryNumber;
        }
}
