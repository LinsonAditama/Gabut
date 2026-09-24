import java.util.Scanner;

public class HitungRataRata2 {
    public static void main(String[] args) {
        // DEKLARASI
        int N, x, i, jumlah;
        double rerata;

        // Scanner untuk membaca input dari papan ketik (keyboard)
        Scanner scanner = new Scanner(System.in);

        // ALGORITMA
        System.out.print("Masukkan nilai N: ");
        N = scanner.nextInt(); // read(N)

        jumlah = 0; // jumlah <- 0
        i = 1;      // I <- 1

        // Perulangan menggunakan while (while I <= N do)
        while (i <= N) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            x = scanner.nextInt(); // read(x)

            jumlah = jumlah + x;   // jumlah <- jumlah + x
            i = i + 1;             // i <- i + 1
        }
        // endwhile

        // Menghitung rata-rata (rerata <- jumlah / N)
        // (double) digunakan agar pembagian menghasilkan bilangan pecahan/real
        rerata = (double) jumlah / N;

        // Menampilkan rata-rata (write(rerata))
        System.out.println("Rata-rata: " + rerata);

        // Menutup scanner
        scanner.close();
    }
}