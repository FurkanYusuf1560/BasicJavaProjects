import java.util.Scanner;

public class RecursiveAsalSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== RECURSIVE ASAL SAYI KONTROLÜ ===");

        System.out.print("Sayı Giriniz : ");
        int sayi = scanner.nextInt();

        // Asal sayı kontrolü
        if (asalMi(sayi, 2)) {
            System.out.println(sayi + " sayısı ASALDIR !");
        } else {
            System.out.println(sayi + " sayısı ASAL değildir !");
        }

        scanner.close();
    }

    // Recursive asal sayı kontrol metodu
    public static boolean asalMi(int sayi, int bolen) {
        // Negatif sayılar, 0 ve 1 asal değildir
        if (sayi <= 1) {
            return false;
        }

        // Base case: bölen sayının karekökünden büyükse asaldır
        if (bolen * bolen > sayi) {
            return true;
        }

        // Sayı bölünüyorsa asal değildir
        if (sayi % bolen == 0) {
            return false;
        }

        // Recursive call: bir sonraki böleni kontrol et
        return asalMi(sayi, bolen + 1);
    }
}