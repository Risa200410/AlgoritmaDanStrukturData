package AlgoritmaDanStrukturData.Pertemuan9;

import java.util.Scanner;

public class Tugas4Main {
    public static void menu(){
        System.out.println("\tPilih Menu\t");
        System.out.println("----------------------------------------");


       System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian Terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Cek Antrian Paling Belakang");
        System.out.println("6. Cari index Mahasiswa dengan Nim");
        System.out.println("7. Cek data mahasiswa berdasarkan antrian");
        System.out.println("0. Exit");
        System.out.println("----------------------------------------");
   }

   
public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       Scanner sd = new Scanner(System.in);
       Scanner sb = new Scanner(System.in);
       SingleLinkedList4 singLL = new SingleLinkedList4();
       int pilih;
       do{
           menu();
           pilih = sc.nextInt();
           sc.nextLine();

       switch(pilih) {
           case 1:
               System.out.print("Nim Mahasiswa\t: ");
               String nim = sc.nextLine();
               System.out.print("Nama Mahasiswa\t: ");
               String nama = sc.nextLine();
               System.out.print("Absen Mahasiswa\t: ");
               int absen = sd.nextInt();
               System.out.print("IPK Mahasiswa\t: ");
               double ipk = sb.nextDouble();
               singLL.addLast(nim, nim, absen, ipk);
               sc.nextLine();
               break;

           case 2:
               singLL.removeFirst();
               System.out.println("Mahasiswa urutan awal berhasil keluar!");
               System.out.println("Dengan sisa antrian dibawah ini\n");
               singLL.print();
           break;

           case 3:
               System.out.println("Berikut adalah antrian mahasiswa terdepan: ");
               singLL.peek();
           break;
    
           case 4:
               System.out.println("Berikut adalah data semua antrian: ");
               singLL.print();
            break;
            
            case 5:
                System.out.println("Berikut adalah antrian mahasiswa paling belakang: ");
                singLL.peekRear();
            break;
            
            case 6:
                System.out.println("Pencarian Index Mahasiswa Dengan Nim");
                System.out.print("Masukkan Nim mahasiswa : ");
                String nimm = sc.nextLine();
                singLL.cariNim(nimm);
            break;
            
            case 7:
                System.out.println("Pencarian data mahasiswa berdasarkan antrian");
                System.out.print("Masukkan antrian Mahasiswa : ");
                int antrian = sd.nextInt();
                singLL.cariIndex(antrian);
            break;
            
            case 0:
            System.exit(0);
            System.out.println();
            break;
        }
    } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7 || pilih == 8);
    sc.close();
    sd.close();
    sb.close();

    }
}