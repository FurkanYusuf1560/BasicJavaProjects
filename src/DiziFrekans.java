import java.util.Scanner;

public class DiziFrekans {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dizi boyutunu al
        System.out.print("Dizi boyutunu giriniz: ");
        int boyut = scanner.nextInt();

        // Diziyi oluştur
        int[] dizi = new int[boyut];

        // Dizi elemanlarını kullanıcıdan al
        System.out.println("Dizi elemanlarını giriniz:");
        for (int i = 0; i < boyut; i++) {
            System.out.print((i + 1) + ". eleman: ");
            dizi[i] = scanner.nextInt();
        }

        // Diziyi göster
        System.out.println("\nDizi:");
        diziYazdir(dizi);

        // Frekansları hesapla ve göster
        System.out.println("\nEleman Frekansları:");
        frekanslariGoster(dizi);

        scanner.close();
    }

    /**
     * Dizideki her elemanın frekansını hesaplar ve gösterir
     */
    public static void frekanslariGoster(int[] dizi) {
        int n = dizi.length;

        // Ziyaret edildi kontrolü için yardımcı dizi
        boolean[] ziyaretEdildi = new boolean[n];

        for (int i = 0; i < n; i++) {
            // Eğer bu eleman daha önce işlendiyse atla
            if (ziyaretEdildi[i]) {
                continue;
            }

            // Bu elemanın frekansını say
            int frekans = 1;
            for (int j = i + 1; j < n; j++) {
                if (dizi[i] == dizi[j]) {
                    frekans++;
                    ziyaretEdildi[j] = true; // Bu elemanı işaretliyoruz
                }
            }

            // Frekansı yazdır
            System.out.println(dizi[i] + " -> " + frekans + " kez");
        }
    }

    /**
     * Diziyi ekrana yazdırır
     */
    public static void diziYazdir(int[] dizi) {
        System.out.print("[");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i]);
            if (i < dizi.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}