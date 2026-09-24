import java.util.Scanner;
 
public class NilaiSkripsiMultiMahasiswa {
 
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
 
        double totalNilaiAkhir = 0;
        int jumlahMahasiswa = 0;
        String jawaban = "Y";
 
        while (jawaban.equalsIgnoreCase("Y")) {
            System.out.println();
            System.out.print("Nama Mahasiswa      : ");
            String nama = sc.nextLine();
            System.out.print("NIM                 : ");
            String nim = sc.nextLine();
            System.out.print("Nama Pembimbing I   : ");
            String namaPembimbing1 = sc.nextLine();
            System.out.print("Nama Pembimbing II  : ");
            String namaPembimbing2 = sc.nextLine();
            System.out.print("Nama Penguji I      : ");
            String namaPenguji1 = sc.nextLine();
            System.out.print("Nama Penguji II     : ");
            String namaPenguji2 = sc.nextLine();
            System.out.print("Nilai Pembimbing I  : ");
            double nilaiPembimbing1 = sc.nextDouble();
            System.out.print("Nilai Pembimbing II : ");
            double nilaiPembimbing2 = sc.nextDouble();
            System.out.print("Nilai Penguji I     : ");
            double nilaiPenguji1 = sc.nextDouble();
            System.out.print("Nilai Penguji II    : ");
            double nilaiPenguji2 = sc.nextDouble();
            sc.nextLine(); // buang sisa newline setelah nextDouble()
 
            double rataPembimbing = (nilaiPembimbing1 + nilaiPembimbing2) / 2;
            double rataPenguji = (nilaiPenguji1 + nilaiPenguji2) / 2;
            double nilaiAkhir = (rataPembimbing * 0.4) + (rataPenguji * 0.6);
            String nilaiHuruf = tentukanHuruf(nilaiAkhir);
 
            System.out.println("Nama : " + nama + " | NIM : " + nim);
            System.out.println("Nilai Akhir : " + nilaiAkhir + " | Huruf : " + nilaiHuruf);
 
            totalNilaiAkhir += nilaiAkhir;
            jumlahMahasiswa++;
 
            System.out.print("Apakah ingin input data lagi (Y/T)? ");
            jawaban = sc.nextLine();
        }
 
        double rataRataAkhir = totalNilaiAkhir / jumlahMahasiswa;
        System.out.println();
        System.out.println("Rata-rata Nilai Akhir seluruh mahasiswa = " + rataRataAkhir);
 
        sc.close();
    }
}