public class SoalSatuKetiga {
    public static void main(String[] args) {
        for (int i = 50; i >= 1; i--) {
            if (i % 3 == 0) {
                System.out.println(i + ". saya angkatan 33");
            } else if (i % 2 == 0) {
                System.out.println(i + ". saya anak suka moklet");
            } else if (i == 1){
                System.out.println(i + ". saya senang");
            } else {
                System.out.println(i + ". saya anak wikusama");
            }
        }
    }
}
