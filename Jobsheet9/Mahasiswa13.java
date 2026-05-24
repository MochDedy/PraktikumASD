package Jobsheet9;

public class Mahasiswa13 {
    String nama, nim, kelas;
    int nilai;

    public Mahasiswa13() {
    }

    public Mahasiswa13(String nama, String nim, String kelas, int nilai){
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}
