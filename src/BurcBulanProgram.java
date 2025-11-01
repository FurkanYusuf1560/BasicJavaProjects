import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {

        int mounth, day;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Hangi ayda  doğduğunuzu giriniz:  ");

        mounth = inp.nextInt();

        if ( 12 >=  mounth   && 1 <= mounth ) {
            if (mounth == 1) {
                System.out.print("Lütfen Ayın kaçında doğduğunuzu giriniz ");
                day = inp.nextInt();
            } else if (mounth == 2) {
                System.out.print("Lütfen Ayın kaçında doğduğunuzu giriniz ");
                day = inp.nextInt();
            } else if (mounth == 3) {
                System.out.print("Lütfen Ayın kaçında doğduğunuzu giriniz ");
                day = inp.nextInt();
            } else if (mounth == 4) {
                System.out.print("Lütfen Ayın kaçında doğduğunuzu giriniz ");
                day = inp.nextInt();
            } else if (mounth == 5) {
                System.out.print("Lütfen Ayın kaçında doğduğunuzu giriniz ");
                day = inp.nextInt();
            } else if (mounth == 6) {
                System.out.print("Lütfen Ayın kaçında doğduğunuzu giriniz ");
                day = inp.nextInt();
            } else if (mounth == 7) {
                System.out.print("Lütfen Ayın kaçında doğduğunuzu giriniz ");
                day = inp.nextInt();
            } else if (mounth == 8) {
                System.out.print("Lütfen Ayın kaçında doğduğunuzu giriniz ");
                day = inp.nextInt();
            } else if (mounth == 9) {
                System.out.print("Lütfen Ayın kaçında doğduğunuzu giriniz ");
                day = inp.nextInt();
            } else if (mounth == 10) {
                System.out.print("Lütfen Ayın kaçında doğduğunuzu giriniz ");
                day = inp.nextInt();
            } else if (mounth == 11) {
                System.out.print("Lütfen Ayın kaçında doğduğunuzu giriniz ");
                day = inp.nextInt();
            } else if (mounth == 12) {
                System.out.print("Lütfen Ayın kaçında doğduğunuzu giriniz ");
                day = inp.nextInt();
            }
        } else System.out.println("1 ile 12 arasında bir sayı giriniz ");


    }
}
