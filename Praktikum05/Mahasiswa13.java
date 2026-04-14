package Praktikum05;

public class Mahasiswa13 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa13() {
    }

    Mahasiswa13(String nm, String name, String kls, double ip) {
        this.nim = nm;
        this.nama = name;
        this.ipk = ip;
        this.kelas = kls;
    }

    void tampilInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }
}
