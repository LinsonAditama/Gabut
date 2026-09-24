import java.util.Scanner;
 
public class NilaiAkhirMultiMahasiswa {
 
    static String tentukanHuruf(double nilaiAkhir) {
        if (nilaiAkhir >= 80) return "A";
        else if (nilaiAkhir >= 75) return "B+";
        else if (nilaiAkhir >= 70) return "B";
        else if (nilaiAkhir >= 65) return "C+";
        else if (nilaiAkhir >= 60) return "C";
        else if (nilaiAkhir >= 50) return "D";
        else return "E";
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Nama          : ");
        String nama = sc.nextLine();
        System.out.print("NIM           : ");
        String nim = sc.nextLine();
        System.out.print("Nilai Formatif: ");
        double nilaiFormatif = sc.nextDouble();
        System.out.print("Nilai UTS     : ");
        double nilaiUTS = sc.nextDouble();
        System.out.print("Nilai UAS     : ");
        double nilaiUAS = sc.nextDouble();
 
        // formatif 30%, UTS 30%, UAS 40%
        double nilaiAkhir = (nilaiFormatif * 0.3) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
        String nilaiHuruf = tentukanHuruf(nilaiAkhir);
 
        System.out.println();
        System.out.println("Nama           : " + nama);
        System.out.println("NIM            : " + nim);
        System.out.println("Nilai Formatif : " + nilaiFormatif);
        System.out.println("Nilai UTS      : " + nilaiUTS);
        System.out.println("Nilai UAS      : " + nilaiUAS);
        System.out.println("Nilai Akhir    : " + nilaiAkhir);
        System.out.println("Nilai Huruf    : " + nilaiHuruf);
 
        sc.close();
    }
}