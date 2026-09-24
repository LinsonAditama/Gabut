import java.util.Scanner;

public class HitungRataRata3 {
    public static void main(String[] args) {
        
        int N, x, i, jumlah;
        double rerata;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        N = scanner.nextInt();

        jumlah = 0;
        i = 1;

        do {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            x = scanner.nextInt();

            jumlah = jumlah + x;
            i = i + 1;          
        } while (i <= N);     

        rerata = (double) jumlah / N;

        System.out.println("Rata-rata: " + rerata);

        scanner.close();
    }
}