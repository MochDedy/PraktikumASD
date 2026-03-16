package BruteForceDivideConquer.minggu5;

public class MainMahasiswa14 {
    public static void main(String[] args) {
        Mahasiswa14[] data = {
                new Mahasiswa14("Ahmad", "220101001", 2022, 78, 82),
                new Mahasiswa14("Budi", "220101002", 2022, 85, 88),
                new Mahasiswa14("Cindy", "220101003", 2021, 90, 87),
                new Mahasiswa14("Dian", "220101004", 2021, 76, 79),
                new Mahasiswa14("Eko", "220101005", 2023, 92, 95),
                new Mahasiswa14("Fajar", "220101006", 2020, 88, 85),
                new Mahasiswa14("Gina", "220101007", 2023, 80, 83),
                new Mahasiswa14("Hadi", "220101008", 2020, 82, 84)
        };
        Mahasiswa14 tertinggi = NilaiMahasiswa14.utsTertinggi(data, 0, data.length - 1);
        Mahasiswa14 terendah = NilaiMahasiswa14.utsTerendah(data, 0, data.length - 1);
        double rata = NilaiMahasiswa14.rataUAS(data);
        System.out.println("=======================================");
        System.out.println(" HASIL ANALISIS DATA MAHASISWA ");
        System.out.println("=======================================");
        System.out.println("\nNilai UTS Tertinggi: ");
        System.out.println("Nama : " + tertinggi.nama);
        System.out.println("NIM : " + tertinggi.nim);
        System.out.println("Tahun Masuk: " + tertinggi.tahunMasuk);
        System.out.println("Nilai UTS : " + tertinggi.nilaiUTS);
        System.out.println("---------------------------------------");
        System.out.println("Nilai UTS Terendah: ");
        System.out.println("Nama : " + terendah.nama);
        System.out.println("NIM : " + terendah.nim);
        System.out.println("Tahun Masuk: " + terendah.tahunMasuk);
        System.out.println("Nilai UTS : " + terendah.nilaiUTS);
        System.out.println("---------------------------------------");
        System.out.println("Rata-rata Nilai UAS : " + rata);
    }
}
