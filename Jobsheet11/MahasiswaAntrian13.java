package Jobsheet11;

public class MahasiswaAntrian13 {
    String nim;
    String nama;
    String keperluan;

    public MahasiswaAntrian13() {
    }

    public MahasiswaAntrian13(String nim, String nama, String keperluan) {
        this.nim = nim;
        this.nama = nama;
        this.keperluan = keperluan;
    }

    public void tampilInformasi() {
        System.out.printf("%-10s %-12s %-20s%n", nama, nim, keperluan);
    }
}