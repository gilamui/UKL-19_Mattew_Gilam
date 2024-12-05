import java.util.Scanner;

public class SoalDuaKesatu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat positif: ");
        double bilangan = scanner.nextDouble();

        if (bilangan < 0) {
            System.out.println("Bilangan harus positif.");
        } else {
            long faktorial = 1;
            for (int i = 1; i <= bilangan; i++) {
                faktorial *= i;
            }
            System.out.println("Faktorial dari " + bilangan + " adalah " + faktorial);
        }
    }
}