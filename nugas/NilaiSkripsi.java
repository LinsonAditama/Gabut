import java.util.Scanner;
 
public class NilaiSkripsi {
 
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
 
       double rataPembimbing = (nilaiPembimbing1 + nilaiPembimbing2) / 2;
       double rataPenguji = (nilaiPenguji1 + nilaiPenguji2) / 2;
       double nilaiAkhir = (rataPembimbing * 0.4) + (rataPenguji * 0.6);
       String nilaiHuruf = tentukanHuruf(nilaiAkhir);
 
       System.out.println();
       System.out.println("Nama Mahasiswa : " + nama);
       System.out.println("NIM            : " + nim);
       System.out.println("Pembimbing I   : " + namaPembimbing1 + " (" + nilaiPembimbing1 + ")");
       System.out.println("Pembimbing II  : " + namaPembimbing2 + " (" + nilaiPembimbing2 + ")");
       System.out.println("Penguji I      : " + namaPenguji1 + " (" + nilaiPenguji1 + ")");
       System.out.println("Penguji II     : " + namaPenguji2 + " (" + nilaiPenguji2 + ")");
       System.out.println("Nilai Akhir    : " + nilaiAkhir);
       System.out.println("Nilai Huruf    : " + nilaiHuruf);
 
       sc.close();
   }
}
