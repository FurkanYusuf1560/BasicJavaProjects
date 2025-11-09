import java.util.Scanner;

public class RecursiveDesen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== RECURSIVE DESEN OLUŞTURMA ===");
        System.out.print("N Sayısı : ");
        int n = scanner.nextInt();

        System.out.print("Çıktısı : ");
        desenOlustur(n, n, true);

        scanner.close();
    }

    public static void desenOlustur(int n, int current, boolean azalt) {
        System.out.print(current + " ");

        // Sayı pozitifken ve azaltma modundaysak 5 çıkar
        if (azalt && current > 0) {
            desenOlustur(n, current - 5, true);
        }
        // Sayı negatif veya 0 oldu, artırma moduna geç
        else if (current <= 0) {
            desenOlustur(n, current + 5, false);
        }
        // Artırma modunda ve orijinal sayıya ulaşmadıysak 5 ekle
        else if (!azalt && current < n) {
            desenOlustur(n, current + 5, false);
        }
        // Orijinal sayıya ulaştık, işlem tamam
    }
}