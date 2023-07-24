package TeacherGPT;

import java.util.Scanner;

public class R11_substring {

    // Write a Java program that asks the user to enter a
    // sentence and prints the characters of the sentence in a certain range on the screen.
    // You can use the substring() method.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a sentence: ");
        String input = scan.nextLine();

        int uzunluk = input.length();
        String output = input.substring(2 , uzunluk);
        System.out.println(output);

    }
}
