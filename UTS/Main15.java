package AlgoritmaDanStrukturData.UTS;

import java.util.Scanner;

import AlgoritmaDanStrukturData.Pertemuan8.Praktikum2.Penumpang;

public class Main15 {
    public static void menu(){
        System.out.println("Masukkan operasi yang diinginkan: ");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Cetak Antrian" );
        System.out.println("3. Hapus Antrian");
        System.out.println("4. Laporan Pengurutan pesanan by nama");
        System.out.println("5. Hitung total pendapatan");
        System.out.println("6. Keluar");
        System.out.println("--------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sn = new Scanner(System.in);


        System.out.print("Dibuat oleh : ");
        String nama=sc.nextLine();
        System.out.print("NIM : ");
        String NIM = sc.nextLine();
        System.out.print("Absen : ");
        int absen = sc.nextInt();
        System.out.println("==================================");
        System.out.println("Sistem Antrian Resto Royal Delish");
        System.out.println("==================================");

        System.out.println("Masukkan kapasitas queue: ");
        int jumlah = sc.nextInt();

        PembeliQueue15 data = new PembeliQueue15(jumlah);
        PesananQueue15 pesan = new PesananQueue15(jumlah);
        int pilih;
        
        do{
            menu();
            pilih=sn.nextInt();
            sc.nextLine();
            switch(pilih){
                case 1:
                    System.out.println("----------------------");
                    System.out.println("Masukkan Data Pembeli");
                    System.out.println("----------------------");
                    System.out.print("Nomor Antrian: ");
                    int a=sn.nextInt();
                    System.out.print("Nama Pembeli: ");
                    String b=sc.nextLine();
                    System.out.print("Nomor HP: ");
                    String c=sc.nextLine();
                    Pembeli15 beli = new Pembeli15(a, b, c);
                    data.Enqueue(beli);
                    break;
                case 2:
                    data.Print();;
                    break;   
                case 3:
                    data.Dequeue();
                    break;
                case 4:
                    System.out.println("---------------------------------");
                    System.out.println("     Masukkan Data Pesanan      ");
                    System.out.println("---------------------------------");
                    System.out.print("Nomor Pesanan\t: ");
                    int d = sn.nextInt();
                    System.out.print("Nama Pesanan\t: ");
                    String f = sc.nextLine();
                    sc.nextLine();
                    System.out.print("harga\t\t: ");
                    int e = sc.nextInt();
                    Pesanan15 pesen = new Pesanan15(d, e, f);
                    pesan.Enqueue(pesen);
                    break;
                case 5:
                    pesan.Print();
                    break;
                case 6:
                    int totalPendapatan = pesan.totalPesanan();
                    System.out.println("Total Pendapatan: " + totalPendapatan);
                    break;
                case 7:
                    System.out.println("Keluar program");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi!");
            }
        } while (pilih==1||pilih==2||pilih==3||pilih==4||pilih==5||pilih==6);
    }
}
