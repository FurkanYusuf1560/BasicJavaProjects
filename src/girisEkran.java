import  java.util.Scanner;

public class girisEkran {
    public static void main(String[] args) {
        String password,kullanici, newPassword;

       Scanner inp = new Scanner(System.in);
       System.out.print("Şifrenizi Giriniz: ");
       password = inp.nextLine();

        if (password.equals("patika")) {
            System.out.println("şifre doğru");
        } else  {
            System.out.println("Şifreyi yanlış girdiniz Sıfırlamak istermisiniz?");
            kullanici = inp.nextLine();
            if (kullanici.equals("evet")) {
                System.out.print("Yeni şifrenizi giriniz: ");
                newPassword = inp.nextLine();
                if (password.equals(newPassword)) {
                    System.out.println("şifre oluşturulamadı");
                }
            } else if (kullanici.equals("hayır")) {
                System.out.println("peki");
            }
        }


    }
}
