import java.util.Scanner;

public class percobaan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan bilangan yang ingin dihitung: ");
        int bilangan = sc.nextInt();
        System.out.print("masukkan pangkat: ");
        int pangkat = sc.nextInt();

        System.out.println(hitungPangkat(bilangan, pangkat));
        cetakDeretPerhitungan(bilangan, pangkat);
    }

    public static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return (1);
        } else {
            return (x * hitungPangkat(x, y - 1));
        }
    }

    public static void cetakDeretPerhitungan(int x, int y) {
        String deret = "";
        for (int i = 1; i <= y; i++) {
            deret += x + "x";
        }
        System.out.print(deret + "1 = " + hitungPangkat(x, y));
    }

}
