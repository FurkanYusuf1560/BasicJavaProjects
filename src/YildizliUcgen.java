import java.util.Scanner;
public class YildizliUcgen {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        /*  System.out.println("Bir Sayı Giriniz :");
        int n = klavye.nextInt();

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        */
        System.out.print("Lütfen Tekrar bir Sayı Giriniz: ");
        int o = klavye.nextInt();
        int m =0;
        while(m<o){
            int l = 0; // Her satırda sıfırlanmalı
            int p = 1; // Her satırda sıfırlanmalı
            while(l<(o-m)){
                System.out.print(" ");
                l++;
            }
            while(p<=(2*m+1)){
                System.out.print("*");
                p++;
            }
            System.out.println();
            m++;
        }

    }
}
