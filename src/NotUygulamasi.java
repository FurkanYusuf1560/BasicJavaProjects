import java.util.Scanner;
public class NotUygulamasi {
    public static void main(String[] args) {

        int Mat, Fizik, Türkçe, Kimya, Müzik;
        Scanner al = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        Mat = al.nextInt();
        System.out.print("Fizik notunuzu giriniz: ");
        Fizik = al.nextInt();
        System.out.print("Türkçe notunuzu giriniz: ");
        Türkçe = al.nextInt();
        System.out.print("Kimya notunuzu giriniz: ");
        Kimya = al.nextInt();
        System.out.print("Müzik notunuzu giriniz: ");
        Müzik = al.nextInt();

        double avarage = (Mat + Fizik + Türkçe + Müzik + Kimya) / 5;

        if (avarage <= 55) {
            System.out.println("Dersten kaldınız");
        } else {
            System.out.println("geçtiniz");
        }




    }
}
