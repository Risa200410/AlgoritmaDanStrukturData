package AlgoritmaDanStrukturData.Kuis1;
import java.util.Scanner;

public class Transaction {
    static Scanner sc = new Scanner(System.in);

    private static int MAX_NAME = 30;
    public static String[] nama_item = new String[MAX_NAME];
    public static int[] jumlah_item = new int[MAX_NAME];
    public static int[] harga_item = new int[MAX_NAME];
    public static int[] total_harga = new int[MAX_NAME];
    public static int jumlah_Nama = 0;

    public static void check_order() {
        int Total = 0;  
    
        System.out.println("Nama Item |   Jumlah  |  Harga Satuan  | Total Harga");
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < jumlah_Nama; i++) {
            total_harga[i] = jumlah_item[i] * harga_item[i];  
            Total += total_harga[i];  
    
            System.out.printf("   %s    | \t%d \t| \t%d\t|\t%d\n", nama_item[i], jumlah_item[i], harga_item[i], total_harga[i]);
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("Total Keseluruhan: " + Total);
    }
    

    public static void add_item() {
        System.out.print("Masukkan jumlah item yang ingin dimasukkan: ");
        int jumlahDataBaru = sc.nextInt();

        int indeksAwal = jumlah_Nama;

        for (int i = 0; i < jumlahDataBaru; i++) {
            System.out.println();
            System.out.println("Masukkan data item ke-" + (i + 1 + indeksAwal));
            boolean validInput = false;

            while (!validInput) {
                    System.out.print("Masukkan nama item: ");
                    sc.nextLine();
                    nama_item[jumlah_Nama] = sc.nextLine();
                    System.out.print("Masukkan jumlah item " + nama_item[jumlah_Nama] + ": ");
                    jumlah_item[jumlah_Nama] = sc.nextInt();
                    System.out.print("Masukkan harga item " + nama_item[jumlah_Nama] + ": ");
                    harga_item[jumlah_Nama] = sc.nextInt();
                    validInput = true;
                    //sc.nextLine();
                }
            }
            jumlah_Nama++;
        }

    public void update_item_name(){
        for (int i = 0; i < jumlah_Nama; i++) {
                System.out.print(nama_item[i] + " ingin diubah menjadi : ");
                sc.nextLine();
                String gantiNama = sc.nextLine();
                nama_item[i] = gantiNama;
            
        }
    }
    public void update_item_qty() {
        for (int i = 0; i < jumlah_Nama; i++) {
            System.out.print(jumlah_item[i] + " ingin diubah menjadi : ");
            int gantiJumlah = sc.nextInt();
            jumlah_item[i] = gantiJumlah;
        }
    }
    

    public int update_item_price(){
          for (int i = 0; i < jumlah_Nama;) {
                System.out.print(jumlah_item[i] + " ingin diubah menjadi : ");
                int gantiHarga = sc. nextInt();
                return gantiHarga;
                }
           
        return 0;
    }
   


    public static void delete_item(){
        System.out.print("Masukkan nama item yang dihapus: ");
        sc.nextLine();
        String hapusNama = sc.nextLine();
            for (int i = 0; i < jumlah_Nama; i++) {
                if (hapusNama.equalsIgnoreCase(nama_item[i])) {
                    System.out.println(nama_item[i] + " sudah dihapus ");
                    nama_item[i] = "item sudah dihapus";
                    jumlah_item[i] = 0;
                    harga_item[i] = 0;
                }
             }                   
    }

    public static void reset_transaction(){
        for (int i = 0; i < jumlah_Nama; i++) {
            nama_item[i] = null;
            jumlah_item[i] = 0;
            harga_item[i] = 0;
        }
            jumlah_Nama = 0;
        
            System.out.println("Semua data telah dihapus.");     
    }

    public static void total_price() {
        int totalSebelumDiskon = 0;
        double totalSetelahDiskon = 0;
        double hargaDiskon=0;
    
        for (int i = 0; i < jumlah_Nama; i++) {
            totalSebelumDiskon += jumlah_item[i] * harga_item[i];
        }
        
        if (totalSebelumDiskon >= 200000 && totalSebelumDiskon<=300000) {
            hargaDiskon = totalSebelumDiskon * 0.05;
            totalSetelahDiskon = totalSebelumDiskon-hargaDiskon;
        } else if (totalSebelumDiskon>=300000 && totalSebelumDiskon<=500000){
            hargaDiskon = totalSebelumDiskon * 0.08;
            totalSetelahDiskon = totalSebelumDiskon-hargaDiskon;
        } else if (totalSebelumDiskon>=500000){
            hargaDiskon = totalSebelumDiskon * 0.10;
            totalSetelahDiskon = totalSebelumDiskon-hargaDiskon;
        }
        else {
            totalSetelahDiskon = totalSebelumDiskon;
        }
    
        System.out.println("Total belanja sebelum diskon: " + totalSebelumDiskon);
        System.out.println("Total belanja setelah diskon: " + totalSetelahDiskon);
    }
    
}
