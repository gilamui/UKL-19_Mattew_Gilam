import java.util.Scanner;

public class SoalTigaKetiga {
    public static void hitungFrekuensi(int[] angka, int number) {
        boolean[] sudahDihitung = new boolean[number];

        for (int i = 0; i < number; i++) {
            if (!sudahDihitung[i]) { 
                int jumlah = 1; 

                for (int j = i + 1; j < number; j++) {
                    if (angka[i] == angka[j]) {     
                        jumlah++;
                        sudahDihitung[j] = true; 
                    }
                }
                System.out.println(angka[i] + " muncul " + jumlah + " kali");
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan total angka:");
        int number = s.nextInt();
        int[] angka = new int[number];

        System.out.println("Masukkan nilai:");
        for (int i = 0; i < number; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            angka[i] = s.nextInt();
        }

        hitungFrekuensi(angka, number);
    }
}