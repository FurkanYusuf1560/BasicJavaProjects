import java.util.Scanner;

public class KDVtutar {
    public static void main(String[] args) {


        Double tutar, kdvOran = 0.15, kdvTutar, kdvliFiyat;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen tutar giriniz: ");

        tutar = input.nextDouble();
        kdvTutar = tutar * kdvOran;
        System.out.println("kdv tutarı  " + kdvTutar);

        kdvliFiyat = kdvTutar + tutar;

        System.out.println("Kdvli fiyat  " + kdvliFiyat);




    }
}
