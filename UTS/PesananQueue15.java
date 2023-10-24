package AlgoritmaDanStrukturData.UTS;

import java.util.Arrays;
import java.util.Comparator;

public class PesananQueue15 {
    Pesanan15[] pesanan;
    int front;
    int rear;
    int size;
    int max;

    public PesananQueue15(int n) {
        max = n;
        pesanan = new Pesanan15 [max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void Enqueue(Pesanan15 pesan) {
        if(IsFull()) {
            System.out.println("Pesanan sudah penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max -1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            pesanan[rear] = pesan;
            size++;
        }
    }

    public Pesanan15 Dequeue() {
        Pesanan15 pesan = new Pesanan15(front, front, null);
        if (IsEmpty()) {
            System.out.println("Pesanan masih kosong");
        } else {
            pesan = pesanan[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max -1) {
                    front = 0;
                } else {
                    front++;
                }
            }
            
        }
        return pesan;
    }

    public void Print() {
        if (IsEmpty()) {
            System.out.println("Pesanan masih kosong");
        } else {
            Pesanan15[] pesananArray = new Pesanan15[size];
            int i = front;
            int index = 0;
            
            while (i != rear) {
                pesananArray[index] = pesanan[i];
                i = (i + 1) % max;
                index++;
            }
            pesananArray[index] = pesanan[i];
            
            Arrays.sort(pesananArray, Comparator.comparing(p -> p.namaPesanan));
            
            System.out.println("Daftar Pesanan (Urut berdasarkan Nama):");
            System.out.println("|Nomor     |Nama     |Harga    |");
            for (Pesanan15 pesanan : pesananArray) {
                System.out.println(pesanan.kodePesanan + "\t" + pesanan.namaPesanan + "\t" + pesanan.harga);
            }
        }
    }
    

    public int totalPesanan() {
        int total = 0;
        if (IsEmpty()) {
            System.out.println("Pesanan masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                total += pesanan[i].harga;
                i = (i + 1) % max;
            }
            total += pesanan[i].harga;
        }
        return total;
    }
}
