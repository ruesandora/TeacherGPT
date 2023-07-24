package TeacherGPT;

import java.util.Scanner;

public class H01_Homework {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir cümle girin: ");
        String input = scan.nextLine();

        System.out.println(input.equals(input.toUpperCase()));
        System.out.println("#####################");

        int bosluk = input.length() - input.replace( " " , "").length();
        System.out.println(bosluk);


    }
}
