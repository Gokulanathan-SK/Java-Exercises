/*  3. Write a Java method to display the middle character of a string.
Note: a) If the length of the string is odd there will be two middle characters.
b) If the length of the string is even there will be one middle character.
Test Data:
Input a string: 350
Expected Output:

The middle character in the string: 5  */

import java.util.Scanner;

public class Method03 {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.print("Input a String: ");
        String str = get.nextLine();
        System.out.println("The middle character in the string: "+findMiddleCharacter(str));
    }
    public static String findMiddleCharacter(String str){
        int position, length;

        if(str.length()%2 == 0){
            position = (str.length()/2)-1;
            length = 2;
        }
        else{
            position = str.length()/2;
            length = 1;
        }
        return str.substring(position, position+length);
    }
}
