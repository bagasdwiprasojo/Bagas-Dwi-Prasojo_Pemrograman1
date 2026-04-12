import java.util.Scanner;

public class latihan1_p6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai Anda: ");
        int grade = input.nextInt();

        if (grade == 100) {
            System.out.println("Kategori Sempurna!");
        } else if (grade >= 95) {
            System.out.println("Kategori Sangat Memuaskan!");
        } else if (grade >= 80) {
            System.out.println("Kategori Memuaskan!");
        } else if (grade >= 75) {
            System.out.println("Kategori Cukup (Lulus)");
        } else {
            System.out.println("Maaf Anda Belum Lulus!");
        }

        input.close();
    }
    
}
