import java.util.Scanner;

public class SIAKAD07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] nilai = new int [4][3];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Input nilai mahasiswa ke-" + (i + 1));
            double totalperSiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = input.nextInt();
                totalperSiswa += nilai[i][j];                
            }
            System.out.print("Nilai rata-rata: " + totalperSiswa/3);
    
        }
        System.out.println("===================================");
        System.out.println("Rata-rata nilai setiap mata kuliah: ");
        
        for (int j = 0;j < 3; j++) {
            double totalperSiswa = 0;

            for (int i = 0; i < 4; i++) {
                totalperSiswa += nilai[i][j];
            }
            System.out.print("Mata kuliah " + (j + 1) + ": " + totalperSiswa/4);
        }
    }
}