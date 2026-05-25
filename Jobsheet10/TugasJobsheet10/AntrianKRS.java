package Jobsheet10.TugasJobsheet10;

public class AntrianKRS {
    Mahasiswa[] data;
    int front, rear, size, max;
    int jumlahDitangani = 0;
    int KUOTA_DPA = 30;

    public AntrianKRS(int max) {
        this.max = max;
        this.data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        if (!isEmpty()) {
            front = 0;
            rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan.");
        } else {
            System.out.println("Antrian masih kosong.");
        }
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh (Maksimal " + max + "), tidak dapat menambah antrian!");
        } else {
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " berhasil masuk ke antrian KRS.");
        }
    }

    // Memanggil 2 mahasiswa sekaligus
    public void prosesKRS() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada yang bisa diproses.");
            return;
        }
        if (jumlahDitangani >= KUOTA_DPA) {
            System.out.println("Mohon maaf, kuota DPA sudah habis (" + KUOTA_DPA + " mahasiswa).");
            return;
        }

        System.out.println("=== Memproses KRS ===");
        for (int i = 0; i < 2; i++) {
            if (!isEmpty() && jumlahDitangani < KUOTA_DPA) {
                Mahasiswa mhs = data[front];
                System.out.print("Memproses: ");
                mhs.tampilkanData();

                front = (front + 1) % max;
                size--;
                jumlahDitangani++;
            }
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("=== Daftar Seluruh Antrian KRS ===");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                System.out.print((i + 1) + ". ");
                data[index].tampilkanData();
            }
        }
    }

    public void lihatDuaTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("=== 2 Mahasiswa Terdepan ===");
            int batas;
            if (size < 2) {
                batas = size;
            } else {
                batas = 2;
            }
            for (int i = 0; i < batas; i++) {
                int index = (front + i) % max;
                System.out.print((i + 1) + ". ");
                data[index].tampilkanData();
            }
        }
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Mahasiswa paling belakang: ");
            data[rear].tampilkanData();
        }
    }

    public void infoJumlah() {
        System.out.println("=== Info Data KRS ===");
        System.out.println("Jumlah mahasiswa mengantri (Belum Proses): " + size);
        System.out.println("Jumlah mahasiswa sudah diproses KRS      : " + jumlahDitangani + " / " + KUOTA_DPA);
    }
}