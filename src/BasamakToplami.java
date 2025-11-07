import java.util.Scanner;

public class BasamakToplami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        int toplam = 0;
        int geciciSayi = Math.abs(sayi); // Negatif sayılar için mutlak değer

        while (geciciSayi > 0) {
            toplam += geciciSayi % 10; // Son basamağı al
            geciciSayi /= 10;          // Son basamağı kaldır
        }

        System.out.println(sayi + " sayısının basamakları toplamı: " + toplam);

        scanner.close();
    }
}