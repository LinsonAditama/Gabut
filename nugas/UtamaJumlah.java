import java.util.Scanner;
 
public class UtamaJumlah {
 
    static int jumlah(int a, int b) {
        int hasil = a + b;
        return hasil;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Masukkan bilangan pertama  : ");
        int bil1 = sc.nextInt();
        System.out.print("Masukkan bilangan kedua    : ");
        int bil2 = sc.nextInt();
 
        int hasilJumlah = jumlah(bil1, bil2);
        System.out.println("Hasil penjumlahan = " + hasilJumlah);
 
        sc.close();
    }
}