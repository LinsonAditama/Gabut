import java.util.Scanner;

public class HitungRataRata {
    public static void main(String[] args) {
        
        int N, x, i;
        int jumlah;
        double rerata;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan banyaknya data: ");
        N = scanner.nextInt();

        jumlah = 0;

        for (i = 1; i <= N; i++) {
            System.out.print("Masukkan data ke-" + i + ": ");
            x = scanner.nextInt();
            jumlah = jumlah + x;
        }

        rerata = (double) jumlah / N;

        System.out.println("Rata-rata: " + rerata);

        scanner.close();
    }
}