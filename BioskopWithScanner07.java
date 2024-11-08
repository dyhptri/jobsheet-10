import java.util.Scanner;

public class BioskopWithScanner07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String [][] penonton = new String [4][2];

        while (true) {
            System.out.print("Masukkan nama: ");
            String nama = input.nextLine();
            System.out.print("Masukkan baris: ");
            String baris = input.nextLine();
            System.out.print("Masukkan kolom: ");
            String kolom = input.nextLine();

            penonton[0][0] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            String next = input.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
                
            }
            
        }
    }
}
