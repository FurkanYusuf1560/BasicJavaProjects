import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

        Double kmbasiTutar = 2.20;
        Integer TaksimetreacılısUcreti = 10;

        System.out.print("Kaç kilimetre gidilmiştir : ");
        Scanner girin = new Scanner(System.in);

        Double gidilenYol = girin.nextDouble();



        Double Toplamucret = kmbasiTutar * gidilenYol + TaksimetreacılısUcreti;
        if (Toplamucret <= 20){
            System.out.println(20);
        } else System.out.println(Toplamucret);



    }
}
