import java.util.Scanner;

public class tugas3_p8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char pilihan;
        int total = 0;
        int jumlahData = 0;

        do {
            System.out.print("Masukkan nilai mahasiswa: ");
            int nilai = input.nextInt();

            total += nilai;
            jumlahData++;

            System.out.print("Input lagi? (y/t): ");
            pilihan = input.next().charAt(0);
        }while (pilihan == 'y');

        double rataRata = (double) total / jumlahData;
        System.out.println("Rata-rata nilai: " + rataRata);
        input.close();
    }
    
}
