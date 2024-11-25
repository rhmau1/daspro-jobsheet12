public class DeretDescendingRekursif {
    public static void main(String[] args) {
        cetakDeretRekursif(5);
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
        for (int i = n; i >= 0; i--) {
            System.out.print(i);
        }
    }
}
