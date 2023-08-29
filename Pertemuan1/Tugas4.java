import java.util.Scanner;

public class Tugas4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Hitung luas segitiga");
            System.out.println("2. Hitung luas persegi panjang");
            System.out.println("3. Hitung luas lingkaran");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu : ");

            int pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    hitungLuasSegitiga();
                    break;
                case 2:
                    hitungLuasPersegi();
                    break;
                case 3:
                    hitungLuasLingkaran();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan sistem ini!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak ada, silakan pilih kembali");
            }
        }
    }

    public static void hitungLuasSegitiga() {
         System.out.println(" ");
        System.out.println("====================================");
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang alas segitiga: ");
        double alas = sc.nextDouble();
        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = sc.nextDouble();

        System.out.println("====================================");
        double luas = 0.5 * alas * tinggi;
        System.out.println("Luas segitiga adalah: " + luas);
        System.out.println("====================================");
        System.out.println(" ");
    }

    public static void hitungLuasPersegi() {
        System.out.println(" ");
        System.out.println("====================================");
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang = sc.nextDouble();
        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = sc.nextDouble();

        System.out.println("====================================");
        double luas = panjang * lebar;
        System.out.println("Luas persegi panjang adalah: " + luas);
        System.out.println("====================================");
        System.out.println(" ");
    }

    public static void hitungLuasLingkaran() {
          System.out.println(" ");
        System.out.println("====================================");
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jari-jari lingkaran: ");
        double radius = sc.nextDouble();

        System.out.println("====================================");
        double luas = Math.PI * radius * radius;
        System.out.println("Luas lingkaran adalah: " + luas);
        System.out.println("====================================");
        System.out.println(" ");
    }
}