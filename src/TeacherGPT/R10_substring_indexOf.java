package TeacherGPT;

import java.util.Scanner;

public class R10_substring_indexOf {

    // Write a Java program that asks the user to enter a
    // sentence and prints the first word of the sentence on the screen.
    // You can use substring() and indexOf() methods.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scan.nextLine();

        int gapIndex = input.indexOf(" ");
        String firstWord = input.substring(0, gapIndex);

        System.out.println("First sentence: " + firstWord);
    }
}