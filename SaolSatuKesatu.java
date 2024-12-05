import java.util.Scanner;

public class SaolSatuKesatu {
    public static double hitungVolume(double panjang, double lebar, double tinggi) {
        double volume = panjang * lebar * tinggi;
        return volume;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan berat paket (kg): ");
        double berat = input.nextDouble();

        System.out.print("Masukkan jarak tempuh (km): ");
        double jarak = input.nextDouble();

        System.out.print("Masukkan panjang paket (cm): ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar paket (cm): ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan tinggi paket (cm): ");
        double tinggi = input.nextDouble();

        double volume = hitungVolume(panjang, lebar, tinggi);
        System.out.println("");
        

        double biayaDasarPerKg;
        if (jarak <= 10) {
            biayaDasarPerKg = 4250;
            System.out.println("Biaya ongkir: Rp."+biayaDasarPerKg);
        } else {
            biayaDasarPerKg = 6000;
            System.out.println("Biaya ongkir: Rp."+biayaDasarPerKg);
        }

        double biayaTambahanVolume = 0;
        if (volume>100) {
            System.out.println("Total volume: "+volume+"cm3");
            biayaTambahanVolume = 50000;
            System.out.println("Paket dikenakan Biaya Rp,50.000 karena melebihi batas");
        }

        double totalBiaya = (berat * biayaDasarPerKg) + biayaTambahanVolume;

        System.out.println("");
        System.out.println("Total biaya pengiriman: Rp " + totalBiaya); 
    }
}