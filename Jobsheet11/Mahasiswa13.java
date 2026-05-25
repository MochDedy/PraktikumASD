package Jobsheet11;

public class Mahasiswa13 {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa13() {

    }

    public Mahasiswa13(String name, String nm, String kls, double ip) {
        nama = name;
        nim = nm;
        kelas = kls;
        this.ipk = ip;
    }

    public void tampilInformasi() {
        System.out.println(nama + "\t\t" + nim + "\t\t" + kelas + "\t\t" + ipk);
    }
}
