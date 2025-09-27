import java.util.Scanner;


public class Test {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Integer Mat, Fizik, Kimya, Türkçe, Tarih, Müzik;

        System.out.println("Ders notlarını girin : ");

         Mat = scan.nextInt();
         Fizik = scan.nextInt();
         Kimya= scan.nextInt();
         Türkçe  = scan.nextInt();
         Tarih = scan.nextInt();
         Müzik = scan.nextInt();

         Integer ortalama = (Mat + Fizik + Kimya + Türkçe + Tarih + Müzik) / 6;
        System.out.println(ortalama);






    }
}
