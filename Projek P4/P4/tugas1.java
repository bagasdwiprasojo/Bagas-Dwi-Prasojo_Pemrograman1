import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double[] makan = new double[7];
        double[] transport = new double[7];
        double[] belanja = new double[7];
        double tMakan = 0, tTransport = 0, tBelanja = 0, tKeseluruhan = 0;

        System.out.println("============================================");
        System.out.println("    PROGRAM PENCATATAN KEUANGAN MINGGUAN    ");
        System.out.println("============================================");

        for (int i = 0; i < 7; i++) {
            System.out.println("\n> Data Harian ke-" + (i+1));
            System.out.print(" Biaya Konsumsi  : Rp ");
            makan[i] = sc.nextDouble();
            System.out.print(" Biaya Transport : Rp ");
            transport[i] = sc.nextDouble();
            System.out.print(" Biaya Belanja   : Rp ");
            belanja[i] = sc.nextDouble();

            tMakan += makan[i];
            tTransport += transport[i];
            tBelanja += belanja[i];
        }

        tKeseluruhan = tMakan + tTransport +tBelanja;

       
        System.out.println("\n\nREKAPITULASI PENGELUARAN");
        System.out.println("=================================================================================================");
        System.out.printf("%-8s %-12s %-12s %-12s %-12s \n", "HARI", "MAKAN", "TRANSPORT", "BELANJA", "TOTAL");
        System.out.println("==================================================================================================");

        for(int i = 0; i < 7; i++){
            double totalHarian = makan[i] + transport[i] + belanja[i];
            System.out.printf(" Hari %-2d Rp%,10.0f Rp%,10.0f Rp%,10.0f Rp%,10.0f \n",
                (i + 1), makan[i], transport[i], belanja[i], totalHarian);
        }

        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        System.out.printf(" %-8s Rp%,10.0f Rp%,10.0f Rp%,10.0f Rp%,10.0f \n", "TOTAL", tMakan, tTransport, tBelanja, tKeseluruhan);
        System.out.println("=======================================================================================================================");

        System.out.println("\nKOMPOSISI PENGELUARAN: ");
        System.out.printf("- Makan      : %.1f%%\n", (tMakan / tKeseluruhan) * 100);
        System.out.printf("- Transport  : %.1f%%\n", (tTransport / tKeseluruhan) * 100);
        System.out.printf("- Belanja    : %.1f%%\n", (tBelanja / tKeseluruhan) * 100);

        sc.close();
    }
}











        

