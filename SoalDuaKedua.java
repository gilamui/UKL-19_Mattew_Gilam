import java.util.Scanner;

public class SoalDuaKedua {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari tabung (cm): ");
        double jariJari = input.nextDouble();

        System.out.print("Masukkan tinggi tabung (cm): ");
        double tinggi = input.nextDouble();

        double volume = hitungVolume(jariJari, tinggi);

        System.out.println("Volume tabung adalah: " + volume + " cm³");
    }

    public static double hitungVolume(double r, double t) {
        final double PI = 3.14;

        double volume = PI * r * r * t;

        return volume;
    }
}