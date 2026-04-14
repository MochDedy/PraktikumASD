package Praktikum05;

public class DataDosen13 {
    Dosen13[] dataDosen = new Dosen13[10];
    int idx;

    void tambah(Dosen13 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Dosen13 d : dataDosen) {
            if (d != null) {
                d.tampil();
            }
        }
    }

    // 🔵 Bubble Sort ASC (termuda → tertua)
    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen13 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }

    // 🔴 Selection Sort DSC (tertua → termuda)
    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[idxMax].usia) {
                    idxMax = j;
                }
            }

            Dosen13 temp = dataDosen[idxMax];
            dataDosen[idxMax] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }

    // 🟢 Insertion Sort ASC
    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen13 temp = dataDosen[i];
            int j = i - 1;

            while (j >= 0 && dataDosen[j].usia > temp.usia) {
                dataDosen[j + 1] = dataDosen[j];
                j--;
            }
            dataDosen[j + 1] = temp;
        }
    }
}