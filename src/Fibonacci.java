import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== FİBONACCİ SERİSİ BULMA PROGRAMI ===");
        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        int elemanSayisi = scanner.nextInt();

        // Geçerlilik kontrolü
        if (elemanSayisi <= 0) {
            System.out.println("Lütfen pozitif bir sayı giriniz!");
            return;
        }

        System.out.println("\n" + elemanSayisi + " Elemanlı Fibonacci Serisi:");
        fibonacciYazdir(elemanSayisi);

        scanner.close();
    }

    // Fibonacci serisini yazdıran metod
    public static void fibonacciYazdir(int n) {
        int onceki = 0, simdiki = 1;

        // İlk elemanı yazdır
        if (n >= 1) {
            System.out.print(onceki);
        }

        // İkinci elemanı yazdır
        if (n >= 2) {
            System.out.print(" " + simdiki);
        }

        // Diğer elemanları hesapla ve yazdır
        for (int i = 3; i <= n; i++) {
            int sonraki = onceki + simdiki;
            System.out.print(" " + sonraki);

            // Değerleri güncelle
            onceki = simdiki;
            simdiki = sonraki;
        }

        System.out.println(); // Satır sonu
    }
}
