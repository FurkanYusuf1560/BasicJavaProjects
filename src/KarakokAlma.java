import java.util.Scanner;

public class KarakokAlma {
    public static void main(String[] args) {

        Double a,b,c;
        Scanner girdi =  new Scanner(System.in);

        System.out.println("Birinci kenarı giriniz ");
        a = girdi.nextDouble();
        System.out.println("ikinci  kenarı giriniz ");
        b = girdi.nextDouble();


        c = Math.sqrt(a*a + b*b);

        System.out.println("Sonuc :" + c);



    }
}
