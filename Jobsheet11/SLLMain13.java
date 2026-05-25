package Jobsheet11;

import java.util.Scanner;

public class SLLMain13 {
    public static void main(String[] args) {
        SingleLinkedList13 sll = new SingleLinkedList13();
        Mahasiswa13 mhs1 = new Mahasiswa13("Alvaro", "24212200", "1A", 4.0);
        Mahasiswa13 mhs3 = new Mahasiswa13("Cintia", "22212202", "3C", 3.5);
        Mahasiswa13 mhs2 = new Mahasiswa13("Bimon", "23212201", "2B", 3.8);
        Mahasiswa13 mhs4 = new Mahasiswa13("Dirga", "21212203", "4D", 3.6);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa yang ingin ditambahkan: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("-- Mahasiswa ke-" + (i + 1) + " --");
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = Double.parseDouble(sc.nextLine());

            Mahasiswa13 mhsBaru = new Mahasiswa13(nama, nim, kelas, ipk);
            sll.addLast(mhsBaru);
            sll.print();
        }
        sc.close();
    }
}
