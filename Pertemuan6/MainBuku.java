package AlgoritmaDanStrukturData.Pertemuan6;

import java.util.Scanner;

public class MainBuku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PengurutanBuku buku = new PengurutanBuku();
        int jumBuku = 4;

        for (int i = 0; i < jumBuku; i++) {
            System.out.println("================================");
            System.out.println("Buku ke-" + (i+1));
            System.out.println("================================");
            System.out.print("Judul Buku: ");
            String judul = input.next();
            System.out.print("Jumlah Halaman: ");
            int jumlah = input.nextInt();
            System.out.print("Ukuran Buku: ");
            double ukuran = input.nextDouble();
            Buku b = new Buku(judul, jumlah, ukuran);
            buku.tambah(b);
        }

        System.out.println("================================");
        System.out.println("Buku sebelum sorting: ");
        System.out.println("================================");
        buku.tampil();
        System.out.println("Buku setelah sorting ASC berdasarkan ukuran buku: ");
        System.out.println("================================");
        buku.bubbleSort();
        buku.tampil();
        System.out.println("Buku setelah sorting ASC berdasarkan jumlah halaman: ");
        System.out.println("================================");
        buku.selectionSort();
        buku.tampil();
    }
}

