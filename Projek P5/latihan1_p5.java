import java.util.Scanner;

public class latihan1_p5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String namaPasien, jenisPoli;
        int biayaLayanan, jumlahPasien, uangBayar, totalTagihan;

        System.out.println("=== SISTEM REGISTRASI PUSKESMAS ===");

        System.out.print("Nama Pasien        : ");
        namaPasien = input.nextLine();

        System.out.print("Poli Tujuan        : ");
        jenisPoli = input.nextLine();

        System.out.print("Biaya Administrasi : ");
        biayaLayanan = input.nextInt();

        System.out.print("Jumlah Pasien      : ");
        jumlahPasien = input.nextInt();

        System.out.print("Uang Diterima      : ");
        uangBayar = input.nextInt();

        totalTagihan = biayaLayanan * jumlahPasien;

        System.out.println("\n=== KATEGORI PASIEN ===");
        System.out.println("1. Pasien BPJS");
        System.out.println("2. Pasien Umumm (Mandiri)");
        System.out.print("Pilih Kategori: ");
        int kategori = input.nextInt();
        System.out.println("=================================");

        if (kategori == 1) {
            System.out.println("Status: Pasien BPJS");
            if (totalTagihan > 50000) {
                totalTagihan = 0;
                System.out.println("Layanan sepenuhnya ditanggung BPJS!");
            } else {
                System.out.println("Biaya Administrasi tercover BPJS.");
            }    
        } else if (kategori == 2) { 
            System.out.println("Status: Pasien Umum");
            if (totalTagihan > 100000) { 
                System.out.println("Mendapatkan subsidi layanan kesehatan daerah!");
                totalTagihan -= 15000;
            }
        } else {
            System.out.println("Kategori tidak valid, input manual.");
        }

        System.out.println("\n=== BUKTI REGISTRASI & ANTREAN ===");
        System.out.println("Pasien      : " + namaPasien);
        System.out.println("Tujuan      : " + jenisPoli);
        System.out.println("Total Biaya : " +totalTagihan);

        if (uangBayar < totalTagihan) {
            System.out.println("Status      : Pembayaran Belum Lunas!");
        } else {
            int kembalian = uangBayar - totalTagihan;
            System.out.println("Kemabalian : " + kembalian);
            System.out.println("Status  : LUNAS - Silahkan Menuju Ruang Tunggu.");
        }
        System.out.println("====================================================");

        input.close();
    }
    
}
