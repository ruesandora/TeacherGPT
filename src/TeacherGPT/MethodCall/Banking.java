package TeacherGPT.MethodCall;

import java.util.Scanner;

public class Banking {
  private double balance;

  public Banking() {
    balance = 0;
  }

  public double getBalance() {
    return balance;
  }

  public void deposit(double amount) {
    balance += amount;
    System.out.println(amount + " TL yatırıldı. Yeni bakiye: " + balance + " TL");
  }

  public void withdraw(double amount) {
    if (balance >= amount) {
      balance -= amount;
      System.out.println(amount + " TL çekildi. Yeni bakiye: " + balance + " TL");
    } else {
      System.out.println("Yetersiz bakiye!");
    }
  }

  public void printMenu() {
    Scanner scanner = new Scanner(System.in);
    int choice;

    do {
      System.out.println("--- Banka Uygulaması ---");
      System.out.println("1. Bakiye Sorgula");
      System.out.println("2. Para Yatır");
      System.out.println("3. Para Çek");
      System.out.println("4. Çıkış");
      System.out.print("Seçiminizi yapın (1/2/3/4): ");
      choice = scanner.nextInt();

      switch (choice) {
        case 1:
          System.out.println("Bakiye: " + getBalance() + " TL");
          break;
        case 2:
          System.out.print("Yatırılacak miktarı girin: ");
          double depositAmount = scanner.nextDouble();
          deposit(depositAmount);
          break;
        case 3:
          System.out.print("Çekilecek miktarı girin: ");
          double withdrawAmount = scanner.nextDouble();
          withdraw(withdrawAmount);
          break;
        case 4:
          System.out.println("Çıkış yapılıyor...");
          break;
        default:
          System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
      }

      System.out.println();
    } while (choice != 4);
  }

  public static void main(String[] args) {
    Banking bank = new Banking();
    bank.printMenu();
  }
}