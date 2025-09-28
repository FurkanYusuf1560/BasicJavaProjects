import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    int s1, s2, select;

        System.out.print("Lütfen bir sayı giriniz : ");

        Scanner input = new Scanner(System.in);
        s1 = input.nextInt();

        System.out.print("Lütfen ikinci  sayıyı giriniz : ");
        s2 = input.nextInt();

        System.out.println("Lütfen yapmak istediğiniz işlemi seçin");
        System.out.println("1. Toplama \n 2. Çıkarma \n 3. Çarpma \n 4.Bölme ");

        select = input.nextInt();

        switch (select) {
            case 1:
            System.out.println(s1 + s2);
            break;
            case 2:
                System.out.println(s1 - s2);
                break;
            case 3:
                System.out.println(s1 * s2);
                break;
            case 4:
                if (s2 != 0) {
                    System.out.println(s1 / s2);
                } else
                    System.out.println("bölmede payda sıfır olmaz");

                break;
            default:
                System.out.println("d");
        }




    }
}