package TeacherGPT;

import java.util.Scanner;

public class R17_nestedForLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz: ");

            int n = scan.nextInt();

            // İlk for loop, dış döngü
            for (int i = 1; i <= n; i++) {
                // İç içe geçmiş for loop, iç döngü
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                // İç döngü tamamlandığında bir alt satıra geçin
                System.out.println();
            }
        }
    }

    class R17_nestedForLoop_01{
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Lütfen pozitif bir tamsayı giriniz: ");
            int input = scan.nextInt();

            for (int i = 1; i <= input ; i++) {
                System.out.println();
                for (int j = i; j <= input ; j++) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }

class R17_nestedForLoop_02{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz: ");
        int input = scan.nextInt();

        for (int i = 1; i <= input ; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
        }
    }
}
