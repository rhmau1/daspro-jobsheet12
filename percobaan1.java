public class percobaan1 {
    public static void main(String[] args) {
        System.out.println(faktorialRekursif(5));
        System.out.println(faktorialIteratif(5));
    }

    public static int faktorialRekursif(int i) {
        if (i == 0) {
            return (1);
        } else {
            return (i * faktorialRekursif(i - 1));
        }
    }

    public static int faktorialIteratif(int j) {
        int faktor = 1;

        for (int i = j; i >= 1; i--) {
            faktor = faktor * i;
        }
        return faktor;
    }
}
