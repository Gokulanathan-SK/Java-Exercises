//  15. Write a Java program to swap two variables.

public class Problem015 {
    public static void main(String[] args) {
        //Method-1 -> With Temporary Variable (used to swap all Datatypes: numbers, String, double, etc.,)
        String var1 = "Hello";
        String var2 = "Hey";
        String temp = "";
        System.out.println("Before Swapping: ");
        System.out.println("Variable-1 = "+var1+"\nVariable-2 = "+var2);

        temp = var1;
        var1 = var2;
        var2 = temp;
        System.out.println("\nAfter Swapping: ");
        System.out.println("Variable-1 = "+var1+"\nVariable-2 = "+var2);


        //Method-2 -> Without Temporary Variable (used to swap only NUMBERS not Strings Datatypes)
        int num1 = 10;
        int num2 = 15;
        System.out.println("\n\nBefore Swapping: ");
        System.out.println("Number-1 = "+num1+"\nNumber-2 = "+num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("\nAfter Swapping: ");
        System.out.println("Number-1 = "+num1+"\nNumber-2 = "+num2);
    }
}
