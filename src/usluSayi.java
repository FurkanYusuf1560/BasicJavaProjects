import java.util.Scanner;

public class usluSayi {
    public static void main(String[] args) {

        int n,k;
        Scanner inp = new Scanner(System.in);
        System.out.print("üssü alınacak değeri giriniz : ");
        n = inp.nextInt();

        System.out.print("üs değerini giriniz : ");
        k= inp.nextInt();

        int toplam =1;

        for (int i = 1; i<=k; i++){
            toplam *= n;

        }

        System.out.println(toplam);

    }
}
