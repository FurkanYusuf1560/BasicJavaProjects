import java.util.Scanner;
public class ebobEkok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== EBOB ve EKOK HESAPLAMA PROGRAMI ===");

        // Kullanıcıdan sayıları al
        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();

        // Negatif sayıları pozitife çevir
        int n1 = Math.abs(sayi1);
        int n2 = Math.abs(sayi2);

        // EBOB'u hesapla
        int ebob = hesaplaEbob(n1, n2);

        // EKOK'u hesapla
        int ekok = hesaplaEkok(n1, n2, ebob);

        // Sonuçları göster
        System.out.println("\n--- SONUÇLAR ---");
        System.out.println("Girilen Sayılar: " + sayi1 + " ve " + sayi2);
        System.out.println("EBOB(" + sayi1 + ", " + sayi2 + ") = " + ebob);
        System.out.println("EKOK(" + sayi1 + ", " + sayi2 + ") = " + ekok);

        // Doğrulama
        System.out.println("\n--- DOĞRULAMA ---");
        System.out.println("EBOB Formülü: " + n1 + " ve " + n2 + " sayılarının ortak bölenlerinin en büyüğü");
        System.out.println("EKOK Formülü: (" + n1 + " * " + n2 + ") / " + ebob + " = " + ekok);

        scanner.close();
    }

    // While döngüsü ile EBOB hesaplama
    public static int hesaplaEbob(int a, int b) {
        // Özel durum: herhangi biri 0 ise
        if (a == 0) return b;
        if (b == 0) return a;

        // Öklid algoritması ile EBOB bulma
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // EKOK hesaplama: (n1 * n2) / EBOB
    public static int hesaplaEkok(int a, int b, int ebob) {
        // Sıfır kontrolü
        if (a == 0 || b == 0) {
            return 0;
        }
        return (a * b) / ebob;
    }
}
