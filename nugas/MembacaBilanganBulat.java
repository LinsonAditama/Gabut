import java.util.Scanner;

public class MembacaBilanganBulat {
    public static void main(String[] args) {

        int x;
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Masukkan Bilangan Bulat = ");
        x = sc.nextInt();

        if (x % 2 == 0){
        System.out.println("Bilangan Genap");
        } else {
        System.out.println("Bilangan Ganjil");
        }
        
        sc.close();
    }
}