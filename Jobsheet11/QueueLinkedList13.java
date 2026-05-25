package Jobsheet11;

public class QueueLinkedList13 {

    private NodeAntrian13 head; // antrian terdepan
    private NodeAntrian13 tail; // antrian paling akhir
    private int size;
    private final int MAX_SIZE = 5;

    public QueueLinkedList13() {
        head = null;
        tail = null;
        size = 0;
    }

    // Cek antrian kosong
    public boolean isEmpty() {
        return head == null;
    }

    // Cek antrian penuh
    public boolean isFull() {
        return size >= MAX_SIZE;
    }

    // Mengosongkan antrian
    public void clearQueue() {
        head = null;
        tail = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    // Menambahkan antrian (enqueue)
    public void enqueue(MahasiswaAntrian13 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh! Mahasiswa tidak dapat masuk antrian.");
            return;
        }
        NodeAntrian13 newNode = new NodeAntrian13(mhs);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        System.out.println("Mahasiswa [" + mhs.nama + "] berhasil masuk antrian nomor " + size + ".");
    }

    // Memanggil antrian (dequeue)
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong! Tidak ada mahasiswa yang bisa dipanggil.");
            return;
        }
        System.out.println("\n=== Memanggil Antrian ===");
        System.out.printf("%-10s %-12s %-20s%n", "Nama", "NIM", "Keperluan");
        System.out.println("------------------------------------------");
        head.data.tampilInformasi();
        head = head.next;
        if (head == null)
            tail = null;
        size--;
        System.out.println("Sisa antrian: " + size + " mahasiswa.\n");
    }

    // Tampilkan antrian terdepan
    public void peekFront() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("\n=== Antrian Terdepan ===");
            System.out.printf("%-10s %-12s %-20s%n", "Nama", "NIM", "Keperluan");
            System.out.println("------------------------------------------");
            head.data.tampilInformasi();
        }
    }

    // Tampilkan antrian paling akhir
    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("\n=== Antrian Paling Akhir ===");
            System.out.printf("%-10s %-12s %-20s%n", "Nama", "NIM", "Keperluan");
            System.out.println("------------------------------------------");
            tail.data.tampilInformasi();
        }
    }

    // Jumlah mahasiswa yang masih mengantri
    public void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa yang masih mengantri: " + size + " orang.");
    }

    // Tampilkan seluruh isi antrian
    public void tampilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("\n=== Daftar Antrian ===");
        System.out.printf("%-5s %-10s %-12s %-20s%n", "No.", "Nama", "NIM", "Keperluan");
        System.out.println("--------------------------------------------------");
        NodeAntrian13 tmp = head;
        int no = 1;
        while (tmp != null) {
            System.out.printf("%-5d ", no);
            tmp.data.tampilInformasi();
            tmp = tmp.next;
            no++;
        }
        System.out.println();
    }
}