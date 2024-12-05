import java.util.Scanner;

public class SoalDuaKetiga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float jawabanBenar, jawabanUser;
        boolean lanjut = true;
        char operator;

        while (lanjut == true) {
            double[] bilangan = { (int) (Math.random() * 100), (int) (Math.random() * 100) };
            int[] operatorInt = { (int) (Math.random() * 3) };
            switch (operatorInt[0]) {
                case 0:
                    operator = '*';
                    jawabanBenar = (float) (bilangan[0] * bilangan[1]);
                    break;
                case 1:
                    while (bilangan[1] == 0) {
                        bilangan[1] = (float) (Math.random() * 100) + 1;
                    }
                    operator = '/';
                    jawabanBenar = (float) (bilangan[0] / bilangan[1]);
                    break;
                default:
                    operator = '%';
                    jawabanBenar = (float) (bilangan[0] % bilangan[1]);
            }

            System.out.print(bilangan[0] + " " + operator + " " + bilangan[1] + " = ");
            jawabanUser = scanner.nextFloat();

            if (jawabanUser == jawabanBenar) {
                System.out.println("Jawaban Anda benar!");
            } else {
                System.out.println("Jawaban Anda salah. Jawaban yang benar adalah " + jawabanBenar);
            }

            System.out.print("Ingin melanjutkan kuis? (y/n): ");
            String pilihan = scanner.next();
            if (pilihan.equalsIgnoreCase("n")) {
                lanjut = false;
            }

        }

        System.out.println("Terima kasih telah memainkan kuis!");
    }
}