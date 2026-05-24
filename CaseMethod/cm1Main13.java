package CaseMethod;

import java.util.Scanner;

public class cm1Main13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih;

        MahasiswaCM13[] daftarMhs = {
                new MahasiswaCM13("22001", "Andi", "Teknik Informatika"),
                new MahasiswaCM13("22002", "Budi", "Teknik Informatika"),
                new MahasiswaCM13("22003", "Citra", "Sistem Informasi Bisnis")
        };

        BukuCM13[] daftarBuku = {
                new BukuCM13("B001", "Algoritma", 2020),
                new BukuCM13("B002", "Basis Data", 2019),
                new BukuCM13("B003", "Pemrograman", 2021),
                new BukuCM13("B004", "Fisika", 2024)
        };

        PeminjamanCM13[] daftarPmnjmn = {
                new PeminjamanCM13(daftarMhs[0], daftarBuku[0], 7),
                new PeminjamanCM13(daftarMhs[1], daftarBuku[1], 3),
                new PeminjamanCM13(daftarMhs[2], daftarBuku[2], 10),
                new PeminjamanCM13(daftarMhs[2], daftarBuku[3], 6),
                new PeminjamanCM13(daftarMhs[0], daftarBuku[1], 4)
        };

        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("Daftar Mahasiswa: ");
                    for (MahasiswaCM13 m : daftarMhs)
                        m.tampilMahasiswa();
                    break;
                case 2:
                    System.out.println("Daftar Buku: ");
                    for (BukuCM13 b : daftarBuku)
                        b.tampilBuku();
                    break;
                case 3:
                    System.out.println("Data Peminjaman: ");
                    for (PeminjamanCM13 p : daftarPmnjmn)
                        p.tampilPeminjaman();
                    break;
                case 4:
                    for (int i = 1; i < daftarPmnjmn.length; i++) {
                        PeminjamanCM13 temp = daftarPmnjmn[i];
                        int j = i - 1;
                        while (j >= 0 && daftarPmnjmn[j].denda < temp.denda) {
                            daftarPmnjmn[j + 1] = daftarPmnjmn[j];
                            j--;
                        }
                        daftarPmnjmn[j + 1] = temp;
                    }
                    System.out.println("Setelah diurutkan (Denda terbesar): ");
                    for (PeminjamanCM13 p : daftarPmnjmn)
                        p.tampilPeminjaman();
                    break;
                case 5:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();

                    for (int i = 1; i < daftarPmnjmn.length; i++) {
                        PeminjamanCM13 temp = daftarPmnjmn[i];
                        int j = i - 1;
                        while (j >= 0 && daftarPmnjmn[j].mhs.nim.compareTo(temp.mhs.nim) > 0) {
                            daftarPmnjmn[j + 1] = daftarPmnjmn[j];
                            j--;
                        }
                        daftarPmnjmn[j + 1] = temp;
                    }

                    int left = 0, right = daftarPmnjmn.length - 1;
                    int foundIdx = -1;

                    while (left <= right) {
                        int mid = (left + right) / 2;
                        int cmp = daftarPmnjmn[mid].mhs.nim.compareTo(nim);
                        if (cmp == 0) {
                            foundIdx = mid;
                            break;
                        } else if (cmp < 0) {
                            left = mid + 1;
                        } else {
                            right = mid - 1;
                        }
                    }

                    if (foundIdx != -1) {
                        System.out.println("Data ditemukan:");
                        int tempIdx = foundIdx;
                        while (tempIdx >= 0 && daftarPmnjmn[tempIdx].mhs.nim.equals(nim)) {
                            daftarPmnjmn[tempIdx].tampilPeminjaman();
                            tempIdx--;
                        }
                        tempIdx = foundIdx + 1;
                        while (tempIdx < daftarPmnjmn.length && daftarPmnjmn[tempIdx].mhs.nim.equals(nim)) {
                            daftarPmnjmn[tempIdx].tampilPeminjaman();
                            tempIdx++;
                        }
                    } else {
                        System.out.println("Data tidak ditemukan");
                    }
                    break;
            }
        } while (pilih != 0);
    }
}
