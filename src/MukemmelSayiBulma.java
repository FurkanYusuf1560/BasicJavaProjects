import java.util.Scanner;

public class MukemmelSayiBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== MÜKEMMEL SAYI BULMA PROGRAMI ===");
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        // Negatif sayı kontrolü
        if (sayi <= 0) {
            System.out.println("Lütfen pozitif bir sayı giriniz!");
            return;
        }

        // Mükemmel sayı kontrolü
        if (mukemmelSayiMi(sayi)) {
            System.out.println(sayi + " mükemmel sayıdır.");
        } else {
            System.out.println(sayi + " mükemmel sayı değildir.");
        }

        scanner.close();
    }

    // Mükemmel sayı kontrol metodu
    public static boolean mukemmelSayiMi(int sayi) {
        // 1'den küçük sayılar mükemmel olamaz
        if (sayi < 2) {
            return false;
        }

        int toplam = 0;

        // Sayının yarısına kadar olan bölenleri kontrol et
        for (int i = 1; i <= sayi / 2; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }

        return toplam == sayi;
    }
}