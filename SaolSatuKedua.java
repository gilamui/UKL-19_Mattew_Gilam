import java.util.Scanner;

public class SaolSatuKedua {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan bilangan");
        double bilangan = s.nextDouble();

        if(bilangan % 2.0 == 0) {
            System.out.println("Bilangan "+bilangan+" genap");
        } else {
            System.out.println("Bilangan "+bilangan+" ganjil");
        }
    }
}