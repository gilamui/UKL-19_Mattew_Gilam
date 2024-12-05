import java.util.Scanner;

public class SoalTigaKedua {
    public static void tampilHasil(int total, int[] elemen) {
        
        boolean duplikat = false;

        for (int i = 0; i < elemen.length; i++) {
            for (int j = i + 1; j < elemen.length; j++) {
                if (elemen[i] == elemen[j]) {
                    System.out.println("Array memiliki elemen duplikat: " + elemen[i]);
                    duplikat = true;
                }
            }
        }

        if (duplikat = false) {
            System.out.println("Tidak ada elemen duplikat.");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan total banyaknya elemen angka");
        int total = s.nextInt();
        int[] elemen = new int[total];

        System.out.println("Masukkan nilai");
        for (int i = 0; i < total; i++) {
            System.out.println("Elemen ke-"+(i+1)+": ");
            elemen[i]=s.nextInt();
        }

        tampilHasil(total, elemen);
    }
}