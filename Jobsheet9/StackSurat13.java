package Jobsheet9;

public class StackSurat13 {
    Surat13[] stack;
    int top;
    int size;

    public StackSurat13(int size) {
        this.size = size;
        stack = new Surat13[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat13 s) {
        if (!isFull()) {
            top++;
            stack[top] = s;
            System.out.println("Surat berhasil ditambahkan.");
        } else {
            System.out.println("Stack penuh! Tidak bisa menambah surat.");
        }
    }

    public Surat13 pop() {
        if (!isEmpty()) {
            Surat13 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public Surat13 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Belum ada surat.");
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ketemu = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan:");
                stack[i].tampil();
                ketemu = true;
                break;
            }
        }
        if (!ketemu) {
            System.out.println("Surat tidak ditemukan.");
        }
    }
}
