/*
23. Write a Java program to convert a binary number to a hexadecimal number.
Input Data:
Input a Binary Number: 1101
Expected Output

HexaDecimal value: D
*/

import java.util.Scanner;

public class Problem023 {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.print("Input a Binary Number: ");
        int binaryNumber = get.nextInt();

        char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int lastDigit, hexNumber;
        int base; //2^0

        String result = "";
        while (binaryNumber > 0) { //11
            hexNumber = 0;
            base = 1;

            for (int i = 0; i < 4 && binaryNumber > 0; i++) { //11
                lastDigit = binaryNumber % 10;
                hexNumber += lastDigit * base;
                binaryNumber /= 10;
                base *= 2;
            }
            if(hexNumber >=0 && hexNumber <=15)
                result = hexDigits[hexNumber] + result;
        }

        System.out.println("HexDecimal Number: " + result);
    }
}

// Note: This program runs correctly only for 10 digit long Binary Number, more than that - use String Method.