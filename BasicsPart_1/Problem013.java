/*  13. Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.6 Height = 8.5

Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20  */

public class Problem013 {
    public static void main(String[] args) {
        double width = 5.6, height = 8.5;

        double area = width*height;
        double perimeter = 2 * (width+height);

        System.out.printf("\nArea is %.2f * %.2f = %.2f",width,height,area);
        System.out.printf("\nPerimeter is 2 * (%.2f + %.2f) = %.2f",width,height,perimeter);
    }
}
