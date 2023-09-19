package AlgoritmaDanStrukturData.Kuis1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Transaction trnsct_123 = new Transaction();
        Scanner sc = new Scanner(System.in);

        int menu;
        do {
            System.out.println("=====================");
            System.out.println("1. Tambah Data Item");
            System.out.println("2. Update Nama Item");
            System.out.println("3. Update Jumlah Item");
            System.out.println("4. Update Harga Item");
            System.out.println("5. Hapus Data Item");
            System.out.println("6. Reset Data Item");
            System.out.println("7. Check Data Item");
            System.out.println("8. Total Harga");
            System.out.println("9. Exit");

            System.out.print("Masukkan pilihan Anda (1-8) : ");
                menu = sc.nextInt();
                sc.nextLine();

                switch (menu) {
                    case 1:
                        trnsct_123.add_item();
                        break;
                    case 2:
                        trnsct_123.update_item_name();
                        break;
                    case 3:
                        trnsct_123.update_item_qty();
                        break;
                    case 4:
                        trnsct_123.update_item_price();
                        break;
                    case 5:
                        trnsct_123.delete_item();
                        break;
                    case 6:
                        trnsct_123.reset_transaction();
                        break;
                    case 7:
                        trnsct_123.check_order();
                        break;
                    case 8:
                        trnsct_123.total_price();
                        break;
                    case 9:
                        break;
                    default:
                        System.out.println("Pilihan menu tidak ada, silahkan masukkan menu kembali!");
                        break;
                }
            
        } while (menu != 9);

        sc.close();
    }
}
