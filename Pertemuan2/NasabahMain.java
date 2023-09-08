package AlgoritmaDanStrukturData.Pertemuan2;

import java.util.Scanner;

//TUGAS NOMOR 1
// public class NasabahMain {
//         public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         //System.out.print("Masukkan ID: ");
//         int id = sc.nextInt();
        
//         System.out.print("Masukkan nama: ");
//         String nama = sc.nextLine();
        
//         System.out.print("Masukkan alamat: ");
//         String alamat = sc.nextLine();

//         System.out.print("Masukkan no HP: ");
//         int noHP = sc.nextInt();

//         System.out.print("Masukkan no Rekening: ");
//         int noRek = sc.nextInt();

//         Nasabah user = new Nasabah(id, nama, alamat, noHP, noRek);

//         while (true) {
//             System.out.println("Pilih Operasi:");
//             System.out.println("1. Buka Rekening");
//             System.out.println("2. Menabung");
//             System.out.println("3. Tarik Tunai");
//             System.out.println("4. Lihat Saldo");
//             System.out.println("5. Berhutang");
//             System.out.println("6. Tutup Rekening");
//             System.out.println("7. Keluar");
            
//             int pilihan = sc.nextInt();

//             switch (pilihan) {
//                 case 1:
//                     user.bukaRekening();
//                     break;
//                 case 2:
//                     System.out.print("Jumlah uang untuk menabung: ");
//                     int deposit = sc.nextInt();
//                     user.menabung(deposit);
//                     break;
//                 case 3:
//                     System.out.print("Jumlah uang untuk tarik tunai: ");
//                     int tarik = sc.nextInt();
//                     user.tarikTunai(tarik);
//                     break;
//                 case 4:
//                     System.out.println("Saldo Anda: " + user.lihatSaldo());
//                     break;
//                 case 5:
//                     user.berhutang();
//                 break;
//                 case 6:
//                     user.tutupRekening();
//                     break;
//                 case 7:
//                     System.out.println("Terima Kasih!");
//                     sc.close();
//                     return;
//                 default:
//                     System.out.println("Pilihan tidak valid!");
//             }
//         }
//     }

// }



//TUGAS NOMOR 2 
// public class NasabahMain {
//     public static final int MAX_NASABAH = 100;
//     public static Nasabah[] daftarNasabah = new Nasabah[MAX_NASABAH];
//     public static int jumlahNasabah = 0;
//     public static Scanner sc = new Scanner(System.in);

//     public static void main(String[] args) {
//         while (true) {
//             System.out.println("Pilih Operasi:");
//             System.out.println("1. Daftar Nasabah Baru");
//             System.out.println("2. Operasi Nasabah");
//             System.out.println("3. Keluar");
            
//             int pilihan = sc.nextInt();

//             switch (pilihan) {
//                 case 1:
//                     daftarNasabahBaru();
//                     break;
//                 case 2:
//                     operasiNasabah();
//                     break;
//                 case 3:
//                     System.out.println("Terima Kasih!");
//                     sc.close();
//                     return;
//                 default:
//                     System.out.println("Pilihan tidak valid!");
//             }
//         }
//     }

//     public static void daftarNasabahBaru() {
//         if (jumlahNasabah >= MAX_NASABAH) {
//             System.out.println("Kapasitas penuh, tidak dapat menambahkan nasabah baru!");
//             return ;
//         }

//         System.out.print("Masukkan ID: ");
//         int id = sc.nextInt();
//         sc.nextLine();
        
//         System.out.print("Masukkan nama: ");
//         String nama = sc.nextLine();
        
//         System.out.print("Masukkan alamat: ");
//         String alamat = sc.nextLine();

//         System.out.print("Masukkan no HP: ");
//         int noHP = sc.nextInt();

//         System.out.print("Masukkan no Rekening: ");
//         int noRek = sc.nextInt();

//         daftarNasabah[jumlahNasabah++] = new Nasabah(id, nama, alamat, noHP, noRek);
        
//     }

//     public static void operasiNasabah() {
//         System.out.print("Masukkan ID Nasabah: ");
//         int id = sc.nextInt();

//         Nasabah user = null;
//         for (int i = 0; i < jumlahNasabah; i++) {
//             if (daftarNasabah[i].id == id) {
//                 user = daftarNasabah[i];
//                 break;
//             }
//         }

//         if (user == null) {
//             System.out.println("Nasabah dengan ID tersebut tidak ditemukan.");
//             return;
//         } else {System.out.println(user);}

//         while (true) {
//             System.out.println("Pilih Operasi:");
//             System.out.println("1. Menabung");
//             System.out.println("2. Tarik Tunai");
//             System.out.println("3. Lihat Saldo");
//             System.out.println("4. Berhutang");
//             System.out.println("5. Tutup Rekening");
//             System.out.println("6. Kembali ke Menu Utama");
            
//             int pilihan = sc.nextInt();

//             switch (pilihan) {
//                 case 1:
//                     System.out.print("Jumlah uang untuk menabung: ");
//                     int deposit = sc.nextInt();
//                     user.menabung(deposit);
//                     break;
//                 case 2:
//                     System.out.print("Jumlah uang untuk tarik tunai: ");
//                     int tarik = sc.nextInt();
//                     user.tarikTunai(tarik);
//                     break;
//                 case 3:
//                     System.out.println("Saldo Anda: " + user.lihatSaldo());
//                     break;
//                 case 4:
//                     user.berhutang();
//                     break;
//                 case 5:
//                     user.tutupRekening();
//                     break;
//                 case 6:
//                     return;
//                 default:
//                     System.out.println("Pilihan tidak valid!");
//             }
//         }
//     }
// }



//TUGAS NOMOR 3
public class NasabahMain {
    public static final int MAX_NASABAH = 100;
    public static Nasabah[] daftarNasabah = new Nasabah[MAX_NASABAH];
    public static int jumlahNasabah = 0;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Pilih Operasi:");
            System.out.println("1. Daftar Nasabah Baru");
            System.out.println("2. Operasi Nasabah");
            System.out.println("3. Keluar");
            
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    daftarNasabahBaru();
                    break;
                case 2:
                    operasiNasabah();
                    break;
                case 3:
                    System.out.println("Terima Kasih!");
                    sc.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    public static void daftarNasabahBaru() {
        if (jumlahNasabah >= MAX_NASABAH) {
            System.out.println("Kapasitas penuh, tidak dapat menambahkan nasabah baru!");
            return ;
        }

        System.out.print("Masukkan ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();
        
        System.out.print("Masukkan alamat: ");
        String alamat = sc.nextLine();

        System.out.print("Masukkan no HP: ");
        int noHP = sc.nextInt();

        System.out.print("Masukkan no Rekening: ");
        int noRek = sc.nextInt();

        daftarNasabah[jumlahNasabah++] = new Nasabah(id, nama, alamat, noHP, noRek);    
    }

    public static void operasiNasabah() {
        System.out.print("Masukkan ID Nasabah: ");
        int id = sc.nextInt();

        Nasabah user = null;
        for (int i = 0; i < jumlahNasabah; i++) {
            if (daftarNasabah[i].id == id) {
                user = daftarNasabah[i];
                break;
            }
        }

        if (user == null) {
            System.out.println("Nasabah dengan ID tersebut tidak ditemukan.");
            return;
        } else {System.out.println(user);}

        while (true) {
            System.out.println("Pilih Operasi:");
            System.out.println("1. Buka Rekening Lagi");
            System.out.println("2. Menabung");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Lihat Saldo");
            System.out.println("5. Berhutang");
            System.out.println("6. Tutup Rekening");
            System.out.println("7. Kembali ke Menu Utama");
            
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    user.bukaRekening(pilihan);
                    break;
                case 2:
                    System.out.print("Jumlah uang untuk menabung: ");
                    int deposit = sc.nextInt();
                    user.menabung(deposit);
                    break;
                case 3:
                    System.out.print("Jumlah uang untuk tarik tunai: ");
                    int tarik = sc.nextInt();
                    user.tarikTunai(tarik);
                    break;
                case 4:
                    System.out.println("Saldo Anda: " + user.lihatSaldo());
                    break;
                case 5:
                    user.berhutang();
                    break;
                case 6:
                    user.tutupRekening();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}

