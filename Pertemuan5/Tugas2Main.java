package AlgoritmaDanStrukturData.Pertemuan5;

import java.util.Scanner;
public class Tugas2Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tugas2 tgs2 = new Tugas2();
        tgs2.tampilDataMhs();
        System.out.println("Masukkan nama mahasiswa yang dicari: ");
        String nama = sc.nextLine();
        tgs2.cariMhs(nama);
    }
}
