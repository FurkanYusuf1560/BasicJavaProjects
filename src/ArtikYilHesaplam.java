import java.util.Scanner;

public class ArtikYilHesaplam {
    public static void main(String[] args) {

        System.out.print("YIL giriniz : ");
        Scanner inp = new Scanner(System.in);

        int kalan = inp.nextInt();

        if(kalan % 4 ==0){
            System.out.println("Girdiğiniz yıl bir ARTIK yıldır");
        } else System.out.println("Girdiğiniz yıl bir ARTIK yıl değildir");


    }
}
