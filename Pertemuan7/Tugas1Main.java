package AlgoritmaDanStrukturData.Pertemuan7;

import java.util.Scanner;

public class Tugas1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String klm = sc.nextLine();
        Tugas1 tgs1 = new  Tugas1(klm);
        String rs = tgs1.reverseString();
        
        System.out.println("Hasil :");
        System.out.println(rs);

        sc.close();
    }
}
