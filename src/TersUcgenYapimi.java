import java.util.Scanner;
public class TersUcgenYapimi {
    public static void main(String[] args) {
        System.out.print("Basamak Sayısını Giriniz:  ");
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();
        int i=0;
        while (i<n) {
            for (int j = 0; j < 2 * n - 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        n--;
        }
    }
}
