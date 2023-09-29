package AlgoritmaDanStrukturData.Pertemuan5;
import java.util.Scanner;
public class Tugas4Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah penduduk: ");
        int jumlahPenduduk = input.nextInt();

        Tugas4[] pendudukArray = new Tugas4[jumlahPenduduk];

        for (int i = 0; i < jumlahPenduduk; i++) {
            input.nextLine(); 
            System.out.println("Penduduk ke-" + (i + 1));
            System.out.print("NIK: ");
            String NIK = input.nextLine();
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("Alamat: ");
            String alamat = input.nextLine();
            System.out.print("Jenis Kelamin: ");
            String jenisKelamin = input.nextLine();

            pendudukArray[i] = new Tugas4(NIK, nama, alamat, jenisKelamin);
        }

        System.out.println("--- DATA PENDUDUK ---");
        System.out.println("| No |      NIK     |       Nama        |   Alamat  |      Jenis Kelamin   |");
        for (int i = 0; i < jumlahPenduduk; i++) {
        System.out.printf("| %2d | %13s  | %12s  | %6s     | %13s  |\n",
                    i + 1, pendudukArray[i].getNIK(), pendudukArray[i].getNama(),
                    pendudukArray[i].getAlamat(), pendudukArray[i].getJenisKelamin());
        }
        System.out.println("---------------------------------------------------------------");

        System.out.println("--- CARI DATA PENDUDUK ----");
        System.out.print("Masukkan NIK yang akan dicari: ");
        String NIKCari = input.next();

        boolean ditemukan = false;
        for (int i = 0; i < jumlahPenduduk; i++) {
            if (pendudukArray[i].getNIK().equals(NIKCari)) {
                System.out.print(" ");
                System.out.print(" " + pendudukArray[i].getNIK());
                System.out.print(" " + pendudukArray[i].getNama());
                System.out.print(" " + pendudukArray[i].getAlamat());
                System.out.print(" " + pendudukArray[i].getJenisKelamin());
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Data dengan NIK " + NIKCari + " tidak ditemukan.");
        }
    }
}
