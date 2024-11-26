public class DeretDescendingRekursif {
    public static void main(String[] args) {
        System.out.print("cetak deret rekursif: ");
        cetakDeretRekursif(7);
        System.out.println();
        cetakDeretIteratif(7);
    }

    public static void cetakDeretRekursif(int n) {
        if (n >= 0) {
            System.out.print(n);
            cetakDeretRekursif(n - 1);
        }
    }

    public static void cetakDeretIteratif(int n) {
        System.out.print("cetak deret iteratif: ");
        for (int i = n; i >= 0; i--) {
            System.out.print(i);
        }
    }
}
