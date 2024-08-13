/*  20. Write a Java program to convert a decimal number to a hexadecimal number.
Input Data:
Input a decimal number: 15
Expected Output

Hexadecimal number is : F  */

import java.util.Scanner;

public class Problem020 {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.print("Input a Decimal Number: ");
        int decimalNumber = get.nextInt();

        int remainder;
        String hexNumber = "";
        char[] hex = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        while(decimalNumber > 0){
            remainder = decimalNumber % 16;
            hexNumber =  hex[remainder] + hexNumber;
            decimalNumber /= 16;
        }

        System.out.println("Hexadecimal Number is: " + hexNumber);

    }
}
