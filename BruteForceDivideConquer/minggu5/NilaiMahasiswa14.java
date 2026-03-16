package BruteForceDivideConquer.minggu5;

public class NilaiMahasiswa14 {
    public static Mahasiswa14 utsTertinggi(Mahasiswa14[] mhs, int l, int r) {
        if (l == r) {
            return mhs[l];
        }
        int mid = (l + r) / 2;
        Mahasiswa14 kiri = utsTertinggi(mhs, l, mid);
        Mahasiswa14 kanan = utsTertinggi(mhs, mid + 1, r);
        if (kiri.nilaiUTS > kanan.nilaiUTS) {
            return kiri;
        } else {
            return kanan;
        }
    }

    public static Mahasiswa14 utsTerendah(Mahasiswa14[] mhs, int l, int r) {
        if (l == r) {
            return mhs[l];
        }
        int mid = (l + r) / 2;
        Mahasiswa14 kiri = utsTerendah(mhs, l, mid);
        Mahasiswa14 kanan = utsTerendah(mhs, mid + 1, r);
        if (kiri.nilaiUTS < kanan.nilaiUTS) {
            return kiri;
        } else {
            return kanan;
        }
    }

    public static double rataUAS(Mahasiswa14[] mhs) {
        double total = 0;
        for (int i = 0; i < mhs.length; i++) {
            total += mhs[i].nilaiUAS;
        }
        return (double) total / mhs.length;
    }
}
