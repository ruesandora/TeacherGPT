package TeacherGPT;

public class R18_MethodCall {
  public static class MethodCallExample {
    // Method tanımı
    public static void greetUser(String name) {
      System.out.println("Merhaba, " + name + "! Hoş geldiniz.");
    }

    public static int addNumbers(int a, int b) {
      int result = a + b;
      return result;
    }

    public static void main(String[] args) {
      // Method call
      greetUser("Ahmet"); // Merhaba, Ahmet! Hoş geldiniz.

      int sum = addNumbers(5, 3);
      System.out.println("Toplam: " + sum); // Toplam: 8
    }
  }

}
