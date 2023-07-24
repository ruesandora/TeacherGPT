package TeacherGPT;

public class R16_forLoop {
    public static void main(String[] args) {

        int num = 1;
        int num2 = 100;

        /*for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        } // 1'den 10'a kadar olan sayıları yazdır.*/

        /* for (int i = num; i <= 10; i++) {
            if (i % 2 == 0){
                System.out.println("Çift sayı: " + i);
            }  else {
            System.out.println("Tek sayı: " + i);
            }
        } // 1'den 10'a kadar olan sayıları çift ve tek olarak ayır.*/

        /* for (int i = num; i <= num2 ; i++) {
            int kare = i * i;
            System.out.println(kare);
        }*/ // 1'den 100'e kadar olan sayıların karelerini hesapla.


        /*        int toplam = 0;
        for (int i = 1; i <= 100; i++) {
            toplam += i;
        }

        System.out.println("1'den 100'e kadar olan sayıların toplamı: " + toplam);*/ // 1'den 100'e kadar olan sayıların toplamını hesapla.

        boolean asal = true;
        for (int i = 2; i <= 100; i++) {
            asal = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    asal = false;
                    break;
                }
            }
            if (asal) {
                System.out.println(i);
            }
        }

    }
}
