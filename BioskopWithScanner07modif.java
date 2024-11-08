import java.util.Scanner;

public class BioskopWithScanner07modif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println();
            System.out.println("====================================");
            System.out.println("============ PILIH MENU ============");
            System.out.println("====================================");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan data penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            int pilih = input.nextInt();
            input.nextLine();

            if (pilih == 1) {
                while (true) {
                    System.out.println("---- Masukkan data penonton ----");
                    System.out.print("Masukkan nama: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan baris (1-4): ");
                    int baris = input.nextInt();
                    System.out.print("Masukkan kolom (1-2): ");
                    int kolom = input.nextInt();
                    input.nextLine();

                    if (baris <= 0 || baris > 4 && kolom <= 0 || kolom > 2 ) {
                        System.out.println("Maaf kursi tidak tersedia");
                        System.out.println("Mohon masukkan baris antara (1-4)");
                        continue;
                    } else if (penonton[baris - 1][kolom-1] != null) {
                        System.out.println("Maaf kursi di baris " + baris + " kolom " + kolom + " sudah terisi");
                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("kursi dipesan atas nama " + nama);
                    }

                    System.out.print("Input penonton lainnya? (y/n): ");
                    String next = input.nextLine();

                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            } else if (pilih == 2) {
                System.out.println("--- Daftar penonton ---");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        String namaPenonton = penonton[i][j];
                        System.out.println("Baris ke- " + (i + 1) + " kolom ke- " + (j + 1) + ": " + namaPenonton);
                        if (namaPenonton == null) {
                            System.out.print("***");
                        } else {
                            System.out.print(namaPenonton);
                        }
                    }
                }
            } else if (pilih == 3) {
                System.out.println("Program selesai");
                break;
            } else {
                System.out.println("Mohon masukkan input yang valid");
            }
        }
    }
}
