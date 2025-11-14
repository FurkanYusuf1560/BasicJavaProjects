import java.util.Scanner;
import java.util.Arrays;

public class DizidekiElemanlariSiralama {
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

        // Sıralamadan önce diziyi göster
        System.out.println("\nSıralamadan önce dizi:");
        diziYazdir(dizi);

        // Diziyi küçükten büyüğe sırala (Bubble Sort)
        kucuktenBuyugeSirala(dizi);

        // Sıralamadan sonra diziyi göster
        System.out.println("\nSıralamadan sonra dizi (Küçükten büyüğe):");
        diziYazdir(dizi);

        scanner.close();
    }

    /**
     * Diziyi küçükten büyüğe sıralar (Bubble Sort algoritması)
     */
    public static void kucuktenBuyugeSirala(int[] dizi) {
        int n = dizi.length;

        // Bubble Sort algoritması
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Eğer soldaki eleman sağdakinden büyükse yer değiştir
                if (dizi[j] > dizi[j + 1]) {
                    // Swap (yer değiştirme)
                    int temp = dizi[j];
                    dizi[j] = dizi[j + 1];
                    dizi[j + 1] = temp;
                }
            }
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
