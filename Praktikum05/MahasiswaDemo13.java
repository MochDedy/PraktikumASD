package Praktikum05;

import java.util.Scanner;
public class MahasiswaDemo13 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Mahasiswa: ");
        int jml = sc.nextInt();
        sc.nextLine();
        MahasiswaBerprestasi13 list = new MahasiswaBerprestasi13();
        for(int i = 0; i < jml; i++ ){
            System.out.println("\nMasukkan data makasiswa ke-" + (i+1));
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = Double.parseDouble(sc.nextLine());
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();

            Mahasiswa13 m = new Mahasiswa13(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("Data mahasiswa sebelum sorting");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();
        
        System.out.println("Data yang sudah terurut menggunakan INSERTION DESCENDING SORT (ASC)");
        list.insertionDescending();
        list.tampil();
    }
}
