import java.util.Scanner;

public class KuvvetAlma {
    public static void main(String[] args) {

        int a;
        System.out.print("Lütfen Bir sayı giriniz: ");
        Scanner inp = new Scanner(System.in);
        a = inp.nextInt();

        do {
           if(a % 4 == 0 && a % 5 == 0) System.out.println(a);
           a--;
        } while (a>0);


    }
}
