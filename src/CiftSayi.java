import java.util.Scanner;
public class CiftSayi {
    public static void main(String[] args) {
        int sayı;
        System.out.print("Bir sayı giriniz: ");

        Scanner inp = new Scanner(System.in);

        sayı = inp.nextInt();

        for (int i = 0; i<sayı; i++){
            if (i %2 ==0){
                System.out.println(i);
            }

        }

    }
}
