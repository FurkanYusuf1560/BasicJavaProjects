import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {

        String userName, password;
        Scanner inp = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while(right >0){
            System.out.print("Kullanıcı Adınız: ");
            userName = inp.nextLine();
            System.out.print("Şifreniz: ");
            password = inp.nextLine();

            if (userName.equals("Furkan") && password.equals("123456")){
                System.out.println("Merhaba X Bankasına Hoşgeldiniz.");
                do {
                    System.out.println("Lütfen Yapmak istedğiniz işlemi seçiniz");
                    System.out.println("1-Para Yatırma \n" +
                            "2-Para Çekme \n" +
                            "3- Bakiye Sorgula\n"+
                            "4-Çıkış Yap");
                    select = inp.nextInt();
                    if(select == 1){
                        System.out.println("Para Miktarı");
                        int price = inp.nextInt();
                        balance += price;
                        System.out.println(balance);
                    } else if (select == 2){
                        System.out.println("Para miktarı");
                        int price = inp.nextInt();
                        if (price > balance) System.out.println("bakiye yetersiz");
                        else {
                            balance -= price;
                            System.out.println(balance);
                        }
                    }
                    else if(select == 3) {
                        System.out.println("Bakiyeniz " + balance);

                    }

                } while (select != 4);
                System.out.println("Tekrar Görüşmek üzere");
                break;

            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre ");
                if (right == 0){
                    System.out.println("Hesabınız Bloke olmuştur Banka ile iletişime geçiniz");
                } else System.out.println("Kalan Hakkınız " + right);

            }

        }






    }
}
