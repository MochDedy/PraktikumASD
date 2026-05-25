package CM2;

public class DaftarPesanan13 {
    NodePesanan13 head;
    NodePesanan13 tail;

    public DaftarPesanan13() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahPesanan(int kodePesanan, String namaPesanan, int harga) {
        Pesanan13 pesanan = new Pesanan13(kodePesanan, namaPesanan, harga);
        NodePesanan13 newNode = new NodePesanan13(pesanan);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    private void bubbleSortByNama() {
        if (isEmpty())
            return;

        boolean swapped;
        do {
            swapped = false;
            NodePesanan13 current = head;
            while (current != null && current.next != null) {
                if (current.data.namaPesanan.compareToIgnoreCase(
                        current.next.data.namaPesanan) > 0) {
                    
                    Pesanan13 temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    public void laporanPesanan() {
        if (isEmpty()) {
            System.out.println("Belum ada pesanan masuk.");
            return;
        }

        bubbleSortByNama();

        int totalPendapatan = 0;

        System.out.println("======================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("======================================");
        System.out.printf("%-14s %-20s %s%n", "Kode Pesanan", "Nama Pesanan", "Harga");
        System.out.println("--------------------------------------");

        NodePesanan13 current = head;
        while (current != null) {
            System.out.printf("%-14d %-20s %d%n",
                    current.data.kodePesanan,
                    current.data.namaPesanan,
                    current.data.harga);
            totalPendapatan += current.data.harga;
            current = current.next;
        }

        System.out.println("--------------------------------------");
        System.out.println("Total Pendapatan : Rp " + totalPendapatan);
        System.out.println("======================================");
    }
}