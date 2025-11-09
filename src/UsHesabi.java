import java.util.Scanner;
public class UsHesabi {


    public static int usHesapla(int taban, int us){


        if (us == 0) {
            return 1;
        }
        return taban * usHesapla(taban, us - 1);
    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int taban, us;

        System.out.print("Taban değerini giriniz: ");
        taban = inp.nextInt();
        System.out.print("Üs değerini giriniz: ");
        us = inp.nextInt();

        int sonuc = usHesapla(taban, us);
        System.out.println("Sonuç : " + sonuc);


    }
}
