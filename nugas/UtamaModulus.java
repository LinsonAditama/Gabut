import java.util.Scanner;
 
public class UtamaModulus {
 
    static int modulus(int a, int b) {
        int sisa = a % b;
        return sisa;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Masukkan bilangan pertama  : ");
        int bil1 = sc.nextInt();
        System.out.print("Masukkan bilangan kedua    : ");
        int bil2 = sc.nextInt();
 
        System.out.println("Sisa hasil bagi = " + modulus(bil1, bil2));
 
        sc.close();
    }
}