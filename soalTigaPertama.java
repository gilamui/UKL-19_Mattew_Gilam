import java.util.Scanner;

public class soalTigaPertama {  
    public static void tampilHasil(int totalNilai, int totalSiswa) {
        double ratarata = totalNilai / totalSiswa;

        System.out.println("Rata-rata: " + ratarata);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan total siswa: ");
        int totalSiswa = s.nextInt();

        int totalNilai = 0;

        for (int i = 0; i < totalSiswa; i++) {
            System.out.print("Masukkan nilai untuk siswa " +(i+1)+ ": ");
            int nilai = s.nextInt();
            totalNilai += nilai;
        }
        tampilHasil(totalNilai, totalSiswa);
        s.close();
    }
}