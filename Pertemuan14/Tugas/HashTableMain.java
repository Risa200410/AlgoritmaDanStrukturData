package AlgoritmaDanStrukturData.Pertemuan14.Tugas;

import java.util.Scanner;

public class HashTableMain {
    public static void main(String[] args) {
        HashTable mahasiswaTable = new HashTable();
        Scanner sc = new Scanner(System.in);

        boolean Menu = true;
        while (Menu) {
            System.out.println("=======================================");
            System.out.println("                 Menu                  ");
            System.out.println("=======================================");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Cari Data Mahasiswa berdasarkan NIM");
            System.out.println("3. Hapus Data Mahasiswa");
            System.out.println("4. Tampilkan Seluruh NIM Mahasiswa");
            System.out.println("5. Keluar");
            System.out.println("=======================================");
            System.out.print("Pilih menu (1-5): ");

            int menuChoice = sc.nextInt();
            sc.nextLine();

            switch (menuChoice) {
                case 1:
                    System.out.println("=====================================");
                    System.out.println("        Tambah Mahasiswa             ");
                    System.out.println("=====================================");
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama Lengkap: ");
                    String namaLengkap = sc.nextLine();
                    System.out.print("Jurusan: ");
                    String jurusan = sc.nextLine();
                    System.out.print("Program Studi: ");
                    String programStudi = sc.nextLine();

                    Mahasiswa newMahasiswa = new Mahasiswa(nim, namaLengkap, jurusan, programStudi);
                    mahasiswaTable.set(newMahasiswa);
                    System.out.println("Mahasiswa ditambahkan.");
                    break;
                case 2:
                    System.out.println("=====================================");
                    System.out.println("   Cari Mahasiswa berdasarkan NIM    ");
                    System.out.println("=====================================");
                    System.out.print("Masukkan NIM mahasiswa yang ingin dicari: ");
                    String searchNim = sc.nextLine();

                    Mahasiswa foundMahasiswa = mahasiswaTable.get(searchNim);
                    if (foundMahasiswa != null) {
                        System.out.println("Data Mahasiswa yang dicari:");
                        System.out.println("NIM: " + foundMahasiswa.nim);
                        System.out.println("Nama Lengkap: " + foundMahasiswa.nama);
                        System.out.println("Jurusan: " + foundMahasiswa.jur);
                        System.out.println("Program Studi: " + foundMahasiswa.prodi);
                    } else {
                        System.out.println("Mahasiswa dengan NIM " + searchNim + " tidak ada");
                    }
                    break;
                case 3:
                    System.out.println("Hapus Data Mahasiswa:");
                    System.out.print("Masukkan NIM mahasiswa yang ingin dihapus: ");
                    String hps = sc.nextLine();
                
                    if (mahasiswaTable.remove(hps)) {
                        System.out.println("Mahasiswa dengan NIM " + hps + " berhasil dihapus");
                    } else {
                        System.out.println("Mahasiswa dengan NIM " + hps + " tidak ada");
                    }
                    break;
                
                case 4:
                    System.out.println("=========================================");
                    System.out.println("\nSeluruh Data Mahasiswa yang Tersimpan  ");
                    System.out.println("=========================================");
                    mahasiswaTable.printTable();
                break;
                case 5:
                    Menu = false;
                    break;
                default:
                    System.out.println("Masukkan pilihan antara 1-5: ");
                    break;
            }
        }
        sc.close();
        System.out.println("Keluar Program");
    }
}