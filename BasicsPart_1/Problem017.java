/*  17. Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output:

Sum of two binary numbers: 101  */

import java.util.Scanner;

public class Problem017 {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.print("Input First Binary Number: ");
        long binNumber1 = get.nextLong();
        System.out.print("Input Second Binary Number: ");
        long binNumber2 = get.nextLong();

        int[] sum = new int[20];
        int carry = 0, i = 0;

        // Adding the two Binary Numbers with Carry
        while(binNumber1 != 0 || binNumber2 != 0){
            sum[i++] = (int)(binNumber1%10 + binNumber2%10 + carry) % 2;
            carry = (int)(binNumber1%10 + binNumber2%10 + carry) / 2;
            binNumber1 /= 10;
            binNumber2 /= 10;
        }

        // if we have carry, then add it to the sum[]
        if(carry != 0){
            sum[i++] = carry;
        }

        // Decrement the i, because it starts from sum[0] - (preparing for printing)
        --i;

        // Display the Sum of Binary Numbers
        System.out.print("\nSum of Two Binary Numbers: ");
        while(i>=0){
            System.out.print(sum[i--]);
        }
    }
}
