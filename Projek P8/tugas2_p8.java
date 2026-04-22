import java.util.Scanner;

public class tugas2_p8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char pilihan;
        int total = 0;

        do {
            System.out.print("Masukkan nilai mahasiswa: ");
            int nilai = input.nextInt();

            total += nilai;

            System.out.print("Input lagi (y/t): ");
            pilihan = input.next().charAt(0);
        }while (pilihan == 'y');

        System.out.println("Total nilai: " + total);
        input.close();
    }
    
}
