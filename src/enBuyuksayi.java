import java.util.Scanner;
public class enBuyuksayi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz? ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Lütfen 1 veya daha büyük bir sayı giriniz.");
            return;
        }

        int sayac = 0;
        int enBuyuk = Integer.MIN_VALUE;
        int enKucuk = Integer.MAX_VALUE;

        System.out.println("Sayıları giriniz:");

        while (sayac < n) {
            System.out.print((sayac + 1) + ". sayı: ");
            int sayi = scanner.nextInt();

            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }

            if (sayi < enKucuk) {
                enKucuk = sayi;
            }

            sayac++;
        }

        System.out.println("\n--- SONUÇLAR ---");
        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);
        System.out.println("Sayıların farkı: " + (enBuyuk - enKucuk));

        scanner.close();
    }
}
