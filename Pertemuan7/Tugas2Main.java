package AlgoritmaDanStrukturData.Pertemuan7;
import java.util.Scanner;
public class Tugas2Main {
     public static void main(String[] args) {
         Scanner sc = new Scanner (System.in); 
         Scanner input = new Scanner (System.in); 
         
         System.out.print("Masukkan banyak struk: ");
         int struk = sc.nextInt(); 
         StackTugas2 sd = new StackTugas2(struk);
         
         int totalHarga = 0;
         int jmlh, harga;
         for (int i = 0; i < struk; i++) {
             System.out.println();
             System.out.print("Id Transaksi: ");
             int it = sc.nextInt();
             System.out.print("Tanggal Pembelian: ");
             String tgl = input.nextLine();
             System.out.print("Nama Barang: ");
             String b = input.nextLine();
             System.out.print("Jumlah Barang: ");
             jmlh = sc.nextInt();
             System.out.print("Harga Barang: ");
             harga = sc.nextInt();
             
             totalHarga = jmlh * harga;
             
             Tugas2 s = new Tugas2 (it, tgl, b, jmlh, harga);
             sd.push(s);;
             System.out.print("Total harga: " + totalHarga);
             System.out.println();
         }
         
         char pilih;
         do{
             System.out.println("PILIH MENU");
             System.out.println("1. Tampilkan Struk Teratas");
             System.out.println("2. 5 Struk Untuk Voucher");
             System.out.println("3. Sisa Struk");
             System.out.print("Pilih menu (1-3): ");
             int menu = sc.nextInt();
             if (menu == 1) {
                 sd.peek();
                 sd.print();
             }
             else if (menu == 2) {
                 sd.pop();
                 sd.pop();
                 sd.pop();
                 sd.pop();
                 sd.pop();
             }
            else if (menu == 3) {
                 sd.print();
             }
             System.out.print("Kembali ke menu utama? (y/n): ");
             pilih = sc.next().charAt(0);
         }
         while (pilih == 'y');
     }
}


