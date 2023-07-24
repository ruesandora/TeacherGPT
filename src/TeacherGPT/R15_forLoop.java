package TeacherGPT;

import java.util.Scanner;

public class R15_forLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayi giriniz: ");
        int input = scan.nextInt();

        for (int i = 2; i <= input; i+=2) {
            System.out.println(i + " ");
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }


    }
}
