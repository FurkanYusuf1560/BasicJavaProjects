import java.util.Scanner;

public class diziEnbuyukEleman {
    public static void main(String[] args) {

        int[] Dizi = {15,12,788,1,-1,-778,2,0};
        Scanner inp = new Scanner(System.in);
        int k = inp.nextInt();

        int i=0;
        while(i< Dizi.length){
            if(Dizi[i] == k){
                System.out.println("hee");
            }
            i++;
        }


    }
}
