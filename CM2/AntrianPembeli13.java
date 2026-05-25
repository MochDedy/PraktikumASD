package CM2;

public class AntrianPembeli13 {
    NodePembeli13 head;
    NodePembeli13 tail;
    int counterAntrian;

    public AntrianPembeli13() {
        head = null;
        tail = null;
        counterAntrian = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahAntrian(String namaPembeli, String noHp) {
        counterAntrian++;
        Pembeli13 pembeli = new Pembeli13(counterAntrian, namaPembeli, noHp);
        NodePembeli13 newNode = new NodePembeli13(pembeli);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + counterAntrian);
    }

    public void cetakAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("==============================");
        System.out.printf("%-12s %-20s %s%n", "No Antrian", "Nama", "No HP");
        System.out.println("==============================");
        NodePembeli13 current = head;
        while (current != null) {
            System.out.printf("%-12d %-20s %s%n",
                    current.data.noAntrian,
                    current.data.namaPembeli,
                    current.data.noHp);
            current = current.next;
        }
    }

    public String hapusAntrian(int noAntrian) {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }

        NodePembeli13 current = head;
        while (current != null && current.data.noAntrian != noAntrian) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Nomor antrian " + noAntrian + " tidak ditemukan.");
            return null;
        }

        String nama = current.data.namaPembeli;

        if (head == tail) {
            head = tail = null;
        } else if (current == head) {
            head = head.next;
            head.prev = null;
        } else if (current == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        return nama;
    }
}