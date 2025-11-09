import java.util.Scanner;
public class CinZodYagi {
    public static void main(String[] args) {

        System.out.print("Doğum yılınızı giriniz: ");
        Scanner inp = new Scanner(System.in);
        int DogumYili;
        DogumYili = inp.nextInt();

        int kalan = DogumYili % 12;
        switch (kalan){
            case 1:
                  System.out.println("Maymun"); ;
            break;
            case 2:
                 System.out.println("Horoz"); ;
                break;
            case 3:
                 System.out.println("Köpek"); ;
                break;
            case 4:
                 System.out.println("Domuz"); ;
                break;
            case 5:
                 System.out.println("Fare"); ;
                break;
            case 6:
                 System.out.println("Öküz"); ;
                break;
            case 7:
                 System.out.println("Kaplan"); ;
                break;
            case 8:
                 System.out.println("Tavşan"); ;
                break;
            case 9:
                 System.out.println("Ejderha"); ;
                break;
            case 10:
                 System.out.println("Yılan"); ;
                break;
            case 11:
                 System.out.println("At"); ;
                break;
            case 12:
                 System.out.println("Koyun"); ;
                break;

        }

    }
}
