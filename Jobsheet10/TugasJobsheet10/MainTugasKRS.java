package Jobsheet10.TugasJobsheet10;

import java.util.Scanner;

public class MainTugasKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Instansiasi dengan kapasitas antrian maksimal 10
        AntrianKRS antrian = new AntrianKRS(10);
        int pilihan;

        do {
            System.out.println("\n=== LAYANAN PERSETUJUAN KRS OLEH DPA ===");
            System.out.println("1. Daftar Antrian KRS");
            System.out.println("2. Proses KRS (Panggil 2 Antrian)");
            System.out.println("3. Lihat Seluruh Antrian");
            System.out.println("4. Lihat 2 Antrian Terdepan");
            System.out.println("5. Lihat Antrian Paling Belakang");
            System.out.println("6. Cek Info Rekap Jumlah");
            System.out.println("7. Kosongkan Antrian (Clear)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    antrian.prosesKRS();
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.lihatDuaTerdepan();
                    break;
                case 5:
                    antrian.lihatAkhir();
                    break;
                case 6:
                    antrian.infoJumlah();
                    break;
                case 7:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem layanan KRS.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}
