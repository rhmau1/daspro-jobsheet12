import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan nilai bulan: ");
        int bulan = sc.nextInt();
        if (bulan <= 0) {
            return;
        }
        System.out.println(
                "jumlah pasangan marmut yang ada pada akhir bulan ke-" + bulan + " adalah " + fibonacci(bulan));
        cetakDeretFibonacci(bulan);
    }

    public static int fibonacci(int bulan) {
        if (bulan == 1 || bulan == 2) {
            return 1;
        } else {
            return fibonacci(bulan - 1) + fibonacci(bulan - 2);
        }
    }

    public static void cetakDeretFibonacci(int n) {
        System.out.print("deret total pasangan marmut tiap bulannya: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
