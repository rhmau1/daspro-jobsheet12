import java.util.Scanner;

public class cekPrimaRekursif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan bilangan yang ingin dicek: ");
        int bilangan = sc.nextInt();
        int faktor = 2;
        System.out.println(
                "apakah bilangan " + bilangan + " adalah bilangan prima? " + CekPrimaRekursif(bilangan, faktor));
    }

    public static boolean CekPrimaRekursif(int n, int faktor) {
        if (n < 2) {
            return false;
        } else if (n == faktor) {
            return true;
        } else if (n % faktor == 0) {
            return false;
        } else {
            return CekPrimaRekursif(n, faktor + 1);
        }
    }
}
