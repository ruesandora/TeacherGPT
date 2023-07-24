package TeacherGPT;

import java.util.Scanner;

public class R14_forLoop {

     //   for (başlangıç_değeri; koşul; artış_ifadesi) {
     //       - Döngü gövdesi - tekrarlanacak işlem(ler)
     //   }


    // Başlangıç Değeri:

    // Başlangıç değeri, döngünün başlamadan önce hangi değerle başlayacağını belirler.
    // Tipik olarak bir değişkenin ilk değeri atanır.

    //Koşul:

    // Koşul, döngünün her bir tekrarında kontrol edilen bir ifadedir.
    // Eğer koşul doğru (true) ise, döngü devam eder. Koşul yanlış (false) ise,
    // döngü sonlanır ve döngüden çıkılır.

    //Artış İfadesi:

    // Artış ifadesi, her bir döngü tekrarından sonra yapılacak olan bir işlemi belirler.
    // Bu genellikle bir değişkenin değerini artırmak veya azaltmak için kullanılan bir ifadedir.

    //Döngü Gövdesi:

    //Döngü gövdesi, for loop'un her bir tekrarında gerçekleştirilen işlemleri içerir.
    // Döngü gövdesi süslü parantezler arasında yer alır ve tekrarlanacak işlem(ler) burada yazılır.
    public static void main(String[] args) {

        // Bir kullanıcıdan pozitif bir tamsayı girmesini isteyen ve
        // girilen sayıya kadar olan tüm çift sayıları ekrana yazdıran
        // bir Java programı yazın.
        // (Hint: for loop'un artış ifadesini 2 olarak ayarlayarak çift sayıları kontrol edebilirsin.)

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz: ");
        int input = scan.nextInt();

        String output = "" + 0;

        for (int i = 2; i <= input; i += 2) {
            int ciftSayi = i;
            output += " " + ciftSayi + " ";
        }

        System.out.println("Girilen sayınızın tüm cift sayıları: " + output);
    }

    static class R14_forLoop_01{

        // Kullanıcıdan bir kelime girmesini isteyen ve girilen
        // kelimenin tersini ekrana yazdıran bir Java programı yazın.
        // (Hint: for loop'u tersten çalışacak şekilde ayarlayarak
        // karakterleri ters sırayla alabilirsin.)
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Lütfen bir kelime girin: ");
            String input = scan.next();

            for (int i = input.length()-1; i >= 0 ; i--) {
                System.out.println(i);
            }

        }
    }

    static class R14_forLoop_02{

        // Bir kullanıcıdan pozitif bir tamsayı girmesini isteyen
        // ve girilen sayının faktöriyelini hesaplayan bir Java programı yazın.
        // (Hint: for loop'u kullanarak çarpmayı her bir adımda bir artırarak
        // faktöriyel hesaplayabilirsin.)
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Lütfen bir pozitif tamsayi girin: ");
            int input = scan.nextInt();

            int carpma = 1;
            int output;
            for (int i = 1; i < input ; i*=i) {
               output = i * carpma;
               carpma++;
                System.out.println(output);
            }

        }
    }
}


