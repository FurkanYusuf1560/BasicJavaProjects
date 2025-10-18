import java.util.Scanner;
public class HavaDurumu {
    public static void main(String[] args) {

        int Heat;

        System.out.print("Sıcaklık Değerini giriniz: ");

        Scanner inp = new Scanner(System.in);

        Heat = inp.nextInt();

        if (Heat <= 5) {
            System.out.println("Kayak yapabilirsiniz");
        } else if (Heat > 5 && Heat < 15) {
            System.out.println("Sinamaya gidebilirsiniz");
        } else if (Heat > 15 &&  Heat < 25) {
            System.out.println("Pikniğe gidebilirsiniz");
        } else System.out.println("Denize git");




    }
}
