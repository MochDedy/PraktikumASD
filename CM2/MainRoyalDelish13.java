package CM2;

import java.util.Scanner;

public class MainRoyalDelish13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianPembeli13 antrian = new AntrianPembeli13();
        DaftarPesanan13 pesanan = new DaftarPesanan13();
        int pilihan;

        do {
            System.out.println("\n==============================");
            System.out.println("  SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("==============================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();
                    System.out.print("No HP        : ");
                    String noHp = sc.nextLine();
                    antrian.tambahAntrian(nama, noHp);
                    break;
                case 2:
                    System.out.println("\n==============================");
                    System.out.println("Daftar Antrian Pembeli");
                    antrian.cetakAntrian();
                    break;
                case 3:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong, tidak ada pembeli.");
                        break;
                    }
                    System.out.println("\nAntrian saat ini:");
                    antrian.cetakAntrian();

                    System.out.print("\nMasukkan No Antrian yang dipanggil : ");
                    int noAntrian = sc.nextInt();
                    sc.nextLine();

                    String namaPembeli = antrian.hapusAntrian(noAntrian);
                    if (namaPembeli == null)
                        break;

                    System.out.print("Kode Pesanan  : ");
                    int kodePesanan = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nama Pesanan  : ");
                    String namaPesanan = sc.nextLine();
                    System.out.print("Harga         : ");
                    int harga = sc.nextInt();
                    sc.nextLine();

                    pesanan.tambahPesanan(kodePesanan, namaPesanan, harga);
                    System.out.println(namaPembeli + " telah memesan " + namaPesanan);
                    break;
                case 4:
                    System.out.println();
                    pesanan.laporanPesanan();
                    break;

                case 0:
                    System.out.println("Program selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("Menu tidak valid.");
            }

        } while (pilihan != 0);

        sc.close();
    }
}