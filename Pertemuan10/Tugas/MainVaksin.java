package AlgoritmaDanStrukturData.Pertemuan10.Tugas;

import java.util.Scanner;

public class MainVaksin {
    Scanner sc = new Scanner (System.in);
    public static void menu(){
        System.out.println(" ");
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println("1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");
    }

    public static int userPilih() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan pilihan Anda: ");
        return sc.nextInt();
    }

    public static String namaPengguna() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama penerima vaksin: ");
        return sc.next();
    }

    public static int nomorAntri() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nomor antrian: ");
        return sc.nextInt();
    }


    public static void main(String[] args) {
        DoublyLinkedList1 dll = new DoublyLinkedList1();
        boolean vaksin = true;

        while (vaksin) {
            menu();
            int pilih = userPilih();

            switch (pilih) {
                case 1:
                    String nama = namaPengguna();
                    int queueNumber = nomorAntri();
                    dll.addFirst(nama, queueNumber);
                    System.out.println(nama + " telah ditambahkan ke antrian dengan nomor " + queueNumber + ".");
                    break;
                case 2:
                    String removedName = dll.remove();
                    if (removedName != null) {
                        System.out.println(removedName + " telah selesai divaksinasi.");
                    } else {
                        System.out.println("Antrian sudah kosong.");
                    }
                    break;
                case 3:
                    dll.print();
                    break;
                case 4:
                    vaksin = false;
                    break;
                default:
                    System.out.println("Format ketikan salah, silahkan ketik ulang.");
            }
        }
    }
}
