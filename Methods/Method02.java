/*  2. Write a Java method to compute the average of three numbers.
Test Data:
Input the first number: 25
Input the second number: 45
Input the third number: 65
Expected Output:

The average value is 45.0  */

import java.util.Scanner;

public class Method02 {
    public static void main(String[] args){
        Scanner get = new Scanner(System.in);

        System.out.print("Input the first number: ");
        double num1 = get.nextDouble();
        System.out.print("Input the second number: ");
        double num2 = get.nextDouble();
        System.out.print("Input the third number: ");
        double num3 = get.nextDouble();

        System.out.printf("The Average value is %.1f",findAverage(num1, num2, num3));
    }

    public static double findAverage(double n1, double n2, double n3){
        return (n1+n2+n3)/3;
    }
}
