import java.util.Scanner;
public class TUGAS07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] hasilSurvei = new int[10][6];

        System.out.println("Masukkan hasil survei (nilai 1-5) untuk setiap pertanyaan");
        for (int i = 0; i < hasilSurvei.length; i++) {
            System.out.println("Responden ke- " + (i + 1));
            for (int j = 0; j < hasilSurvei[i].length; j++) {
                System.out.print("Pertanyaan ke- " + (j + 1) + ": ");
                hasilSurvei[i][j] = sc.nextInt();
            }
        }
        for (int j = 0; j < hasilSurvei.length; j++) {
            System.out.print("Responden ke-" + (j + 1) + ": ");
            for (int j2 = 0; j2 < hasilSurvei[j].length; j2++) {
                System.out.print(hasilSurvei[j][j2] + " ");
            }
            System.out.println();
        }
        System.out.println("Rata rata untuk setiap responden: ");
        for (int i = 0; i < hasilSurvei.length; i++) {
            double total = 0;
            for (int j = 0; j < hasilSurvei[i].length; j++) {
                total += hasilSurvei[i][j];
            }
            double rata2 = total / hasilSurvei[i].length;
            System.out.println("Responden " + (i + 1) + ": " + rata2);
        }
        System.out.println("Rata rata untuk setiap pertanyaan: ");
        for (int j = 0; j < hasilSurvei[0].length; j++) {
            double total = 0;
            for (int i = 0; i < hasilSurvei.length; i++) {
                total += hasilSurvei[i][j];
            }
            double rata2 = total / hasilSurvei.length;
            System.out.println("Pertanyaan " + (j + 1) + ": " + rata2);
        }

        double totalRata2 = 0;
        int totalKeseluruhan = 0;
        for (int i = 0; i < hasilSurvei.length; i++) {
            for (int j = 0; j < hasilSurvei[i].length; j++) {
                totalRata2 += hasilSurvei[i][j];
                totalKeseluruhan++;
            }
        }
        double rata2Keseluruhan = totalRata2 / totalKeseluruhan;
        System.out.println("Rata-rata Keseluruhan: " + rata2Keseluruhan);
    }
}