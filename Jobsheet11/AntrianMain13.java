package Jobsheet11;

import java.util.Scanner;

public class AntrianMain13 {

    static Scanner sc = new Scanner(System.in);
    static QueueLinkedList13 antrian = new QueueLinkedList13();

    public static void main(String[] args) {
        System.out.println("================================================");
        System.out.println("  SISTEM ANTRIAN LAYANAN UNIT KEMAHASISWAAN     ");
        System.out.println("================================================");

        boolean running = true;
        while (running) {
            tampilMenu();
            System.out.print("Pilih menu: ");
            int pilihan = Integer.parseInt(sc.nextLine().trim());
            System.out.println();

            switch (pilihan) {
                case 1:
                    daftarAntrian();
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.tampilAntrian();
                    break;
                case 4:
                    antrian.peekFront();
                    break;
                case 5:
                    antrian.peekRear();
                    break;
                case 6:
                    antrian.jumlahAntrian();
                    break;
                case 7:
                    cekStatus();
                    break;
                case 8:
                    System.out.print("Yakin ingin mengosongkan antrian? (y/n): ");
                    if (sc.nextLine().equalsIgnoreCase("y")) {
                        antrian.clearQueue();
                    }
                    break;
                case 0:
                    System.out.println("Terima kasih. Program selesai.");
                    running = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
                    break;
            }
            System.out.println();
        }
        sc.close();
    }

    static void tampilMenu() {
        System.out.println("------------------------------------------------");
        System.out.println("1. Daftar Antrian");
        System.out.println("2. Panggil Antrian (Layani mahasiswa)");
        System.out.println("3. Tampilkan Semua Antrian");
        System.out.println("4. Lihat Antrian Terdepan");
        System.out.println("5. Lihat Antrian Paling Akhir");
        System.out.println("6. Jumlah Mahasiswa dalam Antrian");
        System.out.println("7. Cek Status Antrian");
        System.out.println("8. Kosongkan Antrian");
        System.out.println("0. Keluar");
        System.out.println("------------------------------------------------");
    }

    static void daftarAntrian() {
        if (antrian.isFull()) {
            System.out.println("Antrian sudah penuh! Tidak bisa mendaftar.");
            return;
        }
        System.out.println("--- Form Pendaftaran Antrian ---");
        System.out.print("NIM       : ");
        String nim = sc.nextLine();
        System.out.print("Nama      : ");
        String nama = sc.nextLine();
        System.out.print("Keperluan : ");
        String keperluan = sc.nextLine();

        MahasiswaAntrian13 mhs = new MahasiswaAntrian13(nim, nama, keperluan);
        antrian.enqueue(mhs);
    }

    static void cekStatus() {
        System.out.println("Status Antrian:");
        System.out.println("  Kosong : " + (antrian.isEmpty() ? "Ya" : "Tidak"));
        System.out.println("  Penuh  : " + (antrian.isFull() ? "Ya" : "Tidak"));
    }
}