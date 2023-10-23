package AlgoritmaDanStrukturData.Pertemuan6;

import java.util.Scanner;

public class PaskibrakaMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DaftarAnggotaPaskibraka daftar = new DaftarAnggotaPaskibraka();
        int jumData = 2;
        
        for (int i = 0; i < jumData; i++) {
            System.out.println("==============================");
            System.out.println("Data ke-" + (i+1));
            int x;
            do{
                System.out.println("==============================");
                System.out.print("Nama: ");
                String nama = input.next();
                System.out.print("Kelas: ");
                String kelas = input.next();
                System.out.print("Tinggi: ");
                int tinggi = input.nextInt();
                if(tinggi >= 170){
                    Paskibraka paski = new Paskibraka(nama, kelas, tinggi);
                    daftar.tambah(paski);
                }else{
                    System.out.println("Tinggi badan minimal: 170");
                }
                x = tinggi;
            }while(x < 170);
        }
    
        System.out.println("==============================");
        System.out.println("Data sebelum sorting: ");
        System.out.println("==============================");
        daftar.tampil();
        System.out.println("Data setelah sorting: ");
        System.out.println("==============================");
        daftar.sorting();
        daftar.tampil();
        
    }
}


