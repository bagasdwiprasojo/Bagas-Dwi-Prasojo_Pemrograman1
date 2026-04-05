import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] namaBarang = new String[5];
        double[] hargaBeli = new double[5];
        double[] hargaJual = new double[5];
        double totalModal = 0, totalPendapatan = 0;
        
        System.out.println("=== SISTEM MANAJEMEN STOK TOKO ===");
         for (int i = 0; i<5; i++) {
            System.out.println("\nBarang ke-" + (i + 1));
            System.out.print("Nama Barang   : ");
            namaBarang[i] = input.next();
            System.out.print("Harga Beli    : Rp ");
            hargaBeli[i] = input.nextDouble();
            System.out.print("Harga Jual    : Rp ");
            hargaJual[i] = input.nextDouble();

            totalModal += hargaBeli[i];
            totalPendapatan += hargaJual[i];
        }

        double totalProfit = totalPendapatan - totalModal;

        System.out.println("\n\nLaporan Laba Rugi Toko");
        System.out.println("========================================================================");
        System.out.printf("%-15s %-15s %-15s\n", "NAMA BARANG", "HARGA BELI", "HARGA JUAL", "PROFIT");
        System.out.println("------------------------------------------------------------------------");

        for (int i = 0; i < 5; i++) {
            double profitPerBarang = hargaJual[i] - hargaBeli[i];
            System.out.printf("%-15s Rp%,13.0f Rp%,13.0f Rp%,13.0f\n", namaBarang[i], hargaBeli[i], hargaJual[i], profitPerBarang);
        }
        
        System.out.println("--------------------------------------------------------------------------");
        System.out.printf("%-31s TOTAL MODAL      : Rp%,13.0f\n", "", totalModal);
        System.out.printf("%-31s TOTAL PENDAPARAN : Rp%,13.0f\n", "", totalPendapatan);
        System.out.printf("%-31s TOTAL PROFIT     : Rp%,13.0f\n", "", totalProfit);
        System.out.println("==========================================================================");

        if (totalModal > 0) {
            double persenMargin = (totalProfit / totalModal) * 100;
            System.out.printf("\nMargin Keuntungan Global: %.2f%%\n", persenMargin);
        }
        input.close();
    }
}
