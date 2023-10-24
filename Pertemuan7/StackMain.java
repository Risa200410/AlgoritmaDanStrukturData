package AlgoritmaDanStrukturData.Pertemuan7;

import java.util.Scanner;

public class StackMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stk = new Stack(5);
        int menu;
        // stk.push(15);
        // stk.push(27);
        // stk.push(13);
        // stk.push(18);
        // stk.push(40);
        // stk.print(); 

        // stk.push(11);
        // stk.push(34);
        // stk.pop();
        // stk.peek();
        // stk.print();

        do {
            System.out.println("Pilih menu");
            System.out.println("1. Operasi push");
            System.out.println("2. Operasi pop");
            System.out.println("3. Operasi peek");
            System.out.println("4. Operasi print");
            System.out.println("5. Keluar");
            menu = sc.nextInt();
                switch(menu) {
                    case 1 :
                        System.out.println("Tambahkan data buku");
                        char pilih;
                        do {
                            System.out.print("Judul: ");
                            String judul = sc.nextLine();
                            sc.nextLine();
                            System.out.print("Nama Pengarang: ");
                            String nama = sc.nextLine();
                            System.out.print("Tahun Terbit: ");
                            int tahun = sc.nextInt();
                            System.out.print("Jumlah Halaman: ");
                            int jml = sc.nextInt();
                            System.out.print("Harga: ");
                            int hrg = sc.nextInt();
    
                            Buku bk = new Buku(judul, nama, tahun, jml, hrg);
                            System.out.print("Apakah Anda akan menambahkan data baru ke stack (y/n)? ");
                            pilih = sc.next().charAt(0);
                            sc.nextLine();
                            stk.push(menu);
                        } while (pilih == 'y');
                        break;
                    
                    case 2: 
                        System.out.println("Mengeluarkan data");
                        stk.pop();
                        break;
                    
                    case 3: 
                        System.out.println("Melihat data teratas");
                        stk.peek();
                        break;
                    
                    case 4: 
                        System.out.println("Menampilkan data");
                        stk.print();
                        break;
    
                    case 5:
                        System.out.println("Akan keluar menu");
                        break;
                    
                    default:
                        System.out.println("Opsi tidak valid");
            }
        } while(menu != 5);
    }
    
}
