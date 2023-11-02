import java.util.Scanner;

public class BioskopWithScanner22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu: ");
            System.out.println("1. Input Data Penonton");
            System.out.println("2. Tampilkan Daftar Penonton");
            System.out.println("3. Exit");
            System.out.println("Pilih Menu (1/2/3): ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan Baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    penonton[baris-1][kolom-1] = nama;

                    if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                        if (penonton[baris - 1][kolom - 1] == null) {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Data penonton berhasil dimasukkan.");
                        } else {
                            System.out.println("Kursi sudah ditempati oleh " + penonton[baris - 1][kolom - 1] + ". Silakan pilih kursi lain.");
                            System.out.print("Masukkan Baris: ");
                            baris = sc.nextInt();
                            System.out.print("Masukkan kolom: ");
                            kolom = sc.nextInt();
                            sc.nextLine();
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Data penonton berhasil dimasukkan.");
                        }
                    } else {
                        System.out.println("Nomor baris atau kolom tidak tersedia.");
                    }

                    System.out.println("Input penonton lainnya? (y/n): ");
                    next = sc.nextLine();

                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                    break;

                case 2:
                    System.out.println("Daftar Penonton: ");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            String namaPenonton = (penonton[i][j] != null) ? penonton[i][j] : "***";
                                 System.out.println("Penonton baris ke- " + (i+1) + "dan kolom ke- " + (j+1) + ": " + namaPenonton);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Terimakasih Telah Berunjung!");
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("Menu tidak valid.");
                    break;
            }
        }
    }
}