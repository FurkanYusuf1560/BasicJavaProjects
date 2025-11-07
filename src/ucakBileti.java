import java.util.Scanner;

public class ucakBileti {
    public static void main(String[] args){

        System.out.println("---------Hoşgeldiniz İyi Uçuşlar Dileriz---------");
        int km, yas, tip;

        Scanner inp = new Scanner(System.in);


        System.out.print("Lütfen Mesafe Bilgisini giriniz: ");
        km = inp.nextInt();
        System.out.print("Lütfen Yaş Bilgisini giriniz: ");
        yas = inp.nextInt();
        System.out.print("Lütfen Yolculuk tipi Bilgisini giriniz 1. Tek Yön    2.Çift Yön : ");
        tip = inp.nextInt();

        Double kmBucret = 0.10;

        double biletFiyati;
        biletFiyati = km * kmBucret;

        System.out.println("ödeyeceğiniz Tutar : " + biletFiyati);

        if (km > 0 && yas > 0 && (tip ==1 || tip==2)) {
            if (yas < 12){
                double n = biletFiyati * 0.5;
                System.out.println("ödeyeceğiniz Tutar : " + n);
            } else if (12<yas && yas <24) {
                double k  = biletFiyati * 0.9;
                System.out.println("ödeyeceğiniz Tutar : " + k);
            } else if (yas >65) {
                double m = biletFiyati * 0.7;
                System.out.println("ödeyeceğiniz Tutar : " + m);
            }


        } else System.out.println("Hatalı Bilgi Girdiniz");

        double toplamFiyat = biletFiyati;
        if (tip == 2) {
            // Gidiş-dönüş için %20 indirim
            toplamFiyat = biletFiyati * 0.8 * 2; // 2 katı çünkü gidiş-dönüş
        }





    }
}
