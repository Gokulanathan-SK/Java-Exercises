/*
21. Write a Java program to convert a decimal number to an octal number.
Input Data:
Input a Decimal Number: 15
Expected Output

Octal number is: 17
*/
import java.util.Scanner;

public class Problem021 {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.print("Input a Decimal Number: ");
        int decimalNumber = get.nextInt();

        int remainder,octalNumber = 0, placeValue = 1;

        while(decimalNumber > 0){
            remainder = decimalNumber % 8;
            octalNumber += remainder * placeValue;
            decimalNumber /= 8;
            placeValue *= 10; // 1, 10, 100, 1000,...
        }
        System.out.println("Octal Number is: " + octalNumber);
    }
}
