public class PenjumlahanRekursif {
    public static void main(String[] args) {
        System.out.println(penjumlahanRekursif(1));
    }

    public static int penjumlahanRekursif(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + penjumlahanRekursif(n - 1);
        }
    }
}
