import java.util.Scanner;

public class FaktoriyelHesabi {
    public static void main(String[] args) {

        System.out.print("Lütfen Bir Doğal sayı giriniz: ");
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();
        int mul = 1 ;

        for (int i = 1; i <= n; i++){

            mul = mul *  i;


        }
        System.out.println(mul);

    }
}
