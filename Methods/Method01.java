/*  1. Write a Java method to find the smallest number among three numbers.
Test Data:
Input the first number: 25
Input the Second number: 37
Input the third number: 29
Expected Output:

The smallest value is 25.0  */

import java.util.Scanner;

public class Method01 {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.print("Input the first number: ");
        double num1 = get.nextDouble();
        System.out.print("Input the second number: ");
        double num2 = get.nextDouble();
        System.out.print("Input the third number: ");
        double num3 = get.nextDouble();

        double smallest = findSmallest(num1, num2, num3);
        System.out.printf("\nThe Smallest Value is %.1f",smallest);
    }
    /* public static double largest(double n1, double n2, double n3){
        double smallest = 0;
        if(n1<n2 && n1<n3)
            smallest = n1;
        else if (n2<n3)
            smallest = n2;
        else
            smallest = n3;
        return smallest;
    }*/

    public static double findSmallest(double n1, double n2, double n3){
        double smallest = Math.min(n1, n2);
        smallest = Math.min(smallest, n3);
        return smallest;
    }

}
