package Jobsheet11;

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
    }
}
