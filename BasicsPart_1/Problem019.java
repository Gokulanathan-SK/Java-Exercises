/*  19. Write a Java program to convert an integer number to a binary number.
Input Data:
Input a Decimal Number : 5
Expected Output:

Binary number is: 101  */
import java.util.Scanner;

public class Problem019 {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.print("Input a Decimal Number: ");
        int decimalNumber = get.nextInt();

        int binaryNumber = 0;
        int base = 1; // 2^0

        while(decimalNumber > 0){
            int remainder = decimalNumber % 2;
            decimalNumber /= 2;
            binaryNumber += remainder * base;
            base *= 10;
        }

        System.out.println("Binary Number is: " + binaryNumber);
    }
}
