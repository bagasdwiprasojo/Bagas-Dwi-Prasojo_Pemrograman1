import java.util.Scanner;

public class tugas1_p8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char pilihan;

        do {
            System.out.print("Masukkan nilai mahasiswa: ");
            int nilai = input.nextInt();

            System.out.println("Input yang diinput: " + nilai);
            
            System.out.print("Input lagi? (y/t): ");
            pilihan = input.next().charAt(0);
        }while (pilihan == 'y');
        System.out.println("Program Selesai.");

        input.close();
    }


}