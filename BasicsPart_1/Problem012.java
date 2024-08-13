/*  12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.  */

import java.util.Scanner;
public class Problem012 {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int num1 = get.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = get.nextInt();
        System.out.print("Enter Third Number: ");
        int num3 = get.nextInt();

        System.out.println("\nAverage of Numbers = "+(num1+num2+num3)/3);
    }
}
