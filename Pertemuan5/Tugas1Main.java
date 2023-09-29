package AlgoritmaDanStrukturData.Pertemuan5;

import java.util.Scanner;
public class Tugas1Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int[] data = {17, 20, 26, 33, 37, 41, 53, 65, 73, 83};
        Tugas1 os = new Tugas1(data);
        System.out.println("Isi elemen array: ");
        os.tampilkan();
        int key = 41;
        int index = os.cari(key);
        if (index!=1){
            System.out.println("Data "+key+" pada index "+ index);
        } else {
            System.out.println("Data "+key+ " tidak ditemukan");
        }
        int k= 50;
        int indeks = os.cari(k);
        if (indeks!=1){
            System.out.println("Data "+k+" pada index "+ indeks);
        } else {
            System.out.println("Data "+k+ " tidak ditemukan");
        }
    }
}
