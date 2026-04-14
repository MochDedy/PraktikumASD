package Praktikum05;

import java.util.Scanner;

public class DosenMain13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen13 data = new DataDosen13();

        int pilih;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Bubble)");
            System.out.println("4. Sorting DSC (Selection)");
            System.out.println("5. Insertion Sort");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Kode: ");
                    String kd = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (true=L / false=P): ");
                    boolean jk = sc.nextBoolean();
                    System.out.print("Usia: ");
                    int usia = sc.nextInt();

                    Dosen13 d = new Dosen13(kd, nama, jk, usia);
                    data.tambah(d);
                    break;

                case 2:
                    data.tampil();
                    break;

                case 3:
                    data.sortingASC();
                    System.out.println("Data diurutkan ASC (termuda → tertua)");
                    data.tampil();
                    break;

                case 4:
                    data.sortingDSC();
                    System.out.println("Data diurutkan DSC (tertua → termuda)");
                    data.tampil();
                    break;

                case 5:
                    data.insertionSort();
                    System.out.println("Data diurutkan dengan Insertion Sort");
                    data.tampil();
                    break;

                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 0);
    }
}