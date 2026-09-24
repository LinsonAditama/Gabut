import java.util.Scanner;

public class EmpatPersegiPanjang{
    public static void main(String[] args) {

        int nomerMenu;
        double panjang, lebar, luas, keliling, diagonal;

        Scanner sc = new Scanner(System.in);

        System.out.println("Menu Empat Persegi Panjang");
        System.out.println(" 1. Hitung Luas");
        System.out.println(" 2. Hitung keliling");
        System.out.println(" 3. Hitung Diagonal");
        System.out.println(" 4. Keluar Program");
        System.out.println("Masukkan Pilihan Anda (1/2/3/4)");
        nomerMenu = sc.nextInt();

        switch (nomerMenu) {
            case 1:
                System.out.println("Masukkan Panjang:");
                panjang = sc.nextDouble();
                System.out.println("Masukkan Lebar:");
                lebar = sc.nextDouble();

                luas = panjang*lebar;
                System.out.println("Luas = " +luas);
                break;
            case 2:
                System.out.println("Masukkan Panjang:");
                panjang = sc.nextDouble();
                System.out.println("Masukkan Lebar:");
                lebar = sc.nextDouble();

                keliling = 2*(panjang+lebar);
                System.out.println("Keliling = " +keliling);
                break;
            case 3:
                System.out.println("Masukkan Panjang:");
                panjang = sc.nextDouble();
                System.out.println("Masukkan Lebar:");
                lebar = sc.nextDouble();

                diagonal = Math.sqrt((panjang * panjang) + (lebar * lebar));
                System.out.println("Diagonal = " +diagonal);
                break;     
            case 4:
                System.out.println("Keluar Program");
                break;
            default:
                System.out.println("Pilihan tidak ditemukan");
                break;
        }
        sc.close();
    }
}
