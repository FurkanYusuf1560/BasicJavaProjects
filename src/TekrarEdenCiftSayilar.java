import java.util.Arrays;

public class TekrarEdenCiftSayilar {

    public static void main(String[] args) {
        // Örnek dizi
        int[] sayilar = {2, 4, 5, 6, 2, 8, 4, 9, 10, 6, 4, 12};

        System.out.println("Dizi: " + Arrays.toString(sayilar));
        System.out.println("\nTekrar eden çift sayılar:");

        boolean tekrarBulundu = false;

        // Her elemanı kontrol et
        for (int i = 0; i < sayilar.length; i++) {
            // Çift sayı mı kontrol et
            if (sayilar[i] % 2 == 0) {
                // Bu sayıyı daha önce işledik mi kontrol et
                boolean dahaOnceYazildi = false;
                for (int k = 0; k < i; k++) {
                    if (sayilar[k] == sayilar[i]) {
                        dahaOnceYazildi = true;
                        break;
                    }
                }

                // Eğer daha önce yazdıysak, atla
                if (dahaOnceYazildi) {
                    continue;
                }

                // Bu sayının kaç kez tekrar ettiğini say
                int tekrarSayisi = 0;
                for (int j = 0; j < sayilar.length; j++) {
                    if (sayilar[j] == sayilar[i]) {
                        tekrarSayisi++;
                    }
                }

                // Eğer birden fazla kez geçiyorsa yazdır
                if (tekrarSayisi > 1) {
                    System.out.println(sayilar[i] + " -> " + tekrarSayisi + " kez tekrar ediyor");
                    tekrarBulundu = true;
                }
            }
        }

        if (!tekrarBulundu) {
            System.out.println("Tekrar eden çift sayı bulunamadı.");
        }
    }
}
