import java.util.Scanner;

public class tugas_p7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int totalPertemuan, hadir;
        double tugas, uts, uas;
        double presensi, nilaiAkhir;

        //input
        System.out.print("Masukkan jumlah pertemuan: ");
        totalPertemuan = input.nextInt();

        System.out.print("Masukkan jumlah kehadiran: ");
        hadir = input.nextInt();

        System.out.print("Masukkan nilai tugas: ");
        tugas = input.nextDouble();

        System.out.print("Masukkan nilai UTS: ");
        uts = input.nextDouble();

        System.out.print("Masukkan nilai UAS: ");
        uas = input.nextDouble();

        presensi = ((double) hadir / totalPertemuan) * 100;

        nilaiAkhir = (0.10 * presensi) +
                     (0.20 * tugas) +
                     (0.30 * uts) +
                     (0.40 * uas);
        
        //tentukan grade
        String grade;
        if (nilaiAkhir >= 80) {
            grade = "A";
        } else if (nilaiAkhir >= 70 ){
            grade = "B";
        } else if (nilaiAkhir >= 60) {
            grade = "C";
        } else if (nilaiAkhir >= 55) {
            grade = "D";
        } else {
            grade = "E";
        }

        //Syarat kehadiran minimal 75%
        double minimalHadir = totalPertemuan * 0.75;

        // Output
        System.out.println("\n=== HASIL ===");
        System.out.println("Presensi: " + presensi + "%");
        System.out.println("Nilai Akhir: " + nilaiAkhir);

        if (hadir >= minimalHadir) {
            System.out.println("Status: Memenuhi syarat kehadiran");
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Status: Tidak memenuhi syarat kehadiran");

            if (nilaiAkhir >= 55) {
                System.out.println("Nilai Akhir: 55");
                System.out.println("Grade: D");
            } else {
                System.out.println("Grade: E");
            }
        }

        input.close();
    }
    
}
