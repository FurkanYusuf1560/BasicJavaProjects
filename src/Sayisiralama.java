import java.util.Scanner;

public class Sayisiralama {
    public static void main(String[] args) {

        int a,b,c;

        Scanner inp =  new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        a = inp.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        b = inp.nextInt();

        System.out.print("Üçüncü sayıyı giriniz: ");
        c = inp.nextInt();

        if (a<b && a<c){
            if (b<c){
                System.out.println("a<b<c");
            } else {
                System.out.println("a<c<b");
            }
        }

        if (b<a && b<c){
            if (a<c){
                System.out.println("b<a<c");
            } else {
                System.out.println("b<c<a");
            }
        }
        if (c<a && c<b){
            if (b<a){
                System.out.println("c<b<a");
            } else {
                System.out.println("c<a<b");
            }
        }






    }
}
