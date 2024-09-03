/*  5. Write a Java method to count all the words in a string.
Test Data:
Input the string: The quick brown fox jumps over the lazy dog.
Expected Output:

Number of words in the string: 9  */

import java.util.Scanner;

public class Method05 {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.print("Input the string: ");
        String inputString = get.nextLine();

        int wordCount = findNumberOfWords(inputString);
        System.out.println("Number of words in the string: "+wordCount);
    }

    public static int findNumberOfWords(String str){
        if(str == null || str.isEmpty()){
            return  0;
        }

        int count = 0;
        boolean wordFlag = false;
        str = str.trim(); //Remove leading and trailing spaces

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(Character.isLetter(ch)){
                if(!wordFlag){
                    count++;
                    wordFlag = true;
                }
            }
            else{
                wordFlag = false;
            }
        }
        return count;
    }
}
