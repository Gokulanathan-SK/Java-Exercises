/*  4. Write a Java method to count all vowels in a string.
Test Data:
Input the string: w3resource
Expected Output:

Number of  Vowels in the string: 4  */

import java.util.Scanner;

public class Method04 {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.print("Input the string: ");
        String str = get.nextLine();

        System.out.println("Number of Vowels in the string: "+calculateVowels(str));
    }
    public static int calculateVowels(String str){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            int temp = str.charAt(i);
            switch(temp){
                case 'a','e','i','o','u','A','E','I','O','U':{
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
