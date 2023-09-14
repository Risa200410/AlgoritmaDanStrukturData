import java.util.Scanner;
public class MainPangkat {
    public static void main(String[] args) { 
        Scanner sc=new Scanner (System.in);
        // System.out.println("============================================");
        // System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        // int elemen = sc.nextInt();

        Pangkat[]png=new Pangkat[5];
        png[0]=new Pangkat(5, 2);
        png[1]=new Pangkat(10, 2);
        png[2]=new Pangkat(15, 4);
        png[3]=new Pangkat(20, 2);
        png[4]=new Pangkat(25, 2);

 System.out.println("============================================");
            System.out.println("Hasil pangkat dengan Brute force ");     
            for(int i=0; i<png.length; i++){
                System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah "+png[i].PangkatBF(png[i].nilai,png[i].pangkat));
            }
               System.out.println("============================================");
            System.out.println("Hasil pangkat dengan Devide Conquer ");
            for(int i=0; i<png.length; i++){
                System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah "+png[i].PangkatDC(png[i].nilai,png[i].pangkat));
            }
        
           // KODE NOMOR 5
        System.out.println("===========================================");
        System.out.println("                Menu Pangkat               ");
        System.out.println("========================================== ");
        System.out.println("1. Menggunakan Brute Force ");
        System.out.println("2. Menggunakan Devide Conquer ");
        System.out.println("3. exit ");
        System.out.print("Silahkan Pilih Metode Perhitungan : ");
        int pilih = sc.nextInt();

        switch(pilih){
            case 1 :
            System.out.println("============================================");
            System.out.println("Hasil pangkat dengan Brute force ");     
            for(int i=0; i<png.length; i++){
                System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah "+png[i].PangkatBF(png[i].nilai,png[i].pangkat));
            }
            break;
            case 2 :
            System.out.println("============================================");
            System.out.println("Hasil pangkat dengan Devide Conquer ");
            for(int i=0; i<png.length; i++){
                System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah "+png[i].PangkatDC(png[i].nilai,png[i].pangkat));
            }
            break;
            case 3 :
            System.out.println("------------Terima Kasih---------");
            break;
            default :
            System.out.println("------ input yang anda masukkan salah -------");
        }        
        
       

    //     for(int i=0;i<elemen;i++){
    //         png[i]=new Pangkat();
    //         System.out.print("Masukkan nilai yang akan dipangkatkan ke-"+(i+1)+" : ");
    //         png[i].nilai=sc.nextInt();
    //         System.out.print("Masukkan nilai pemangkat ke-"+(i+1)+" : ");
    //         png[i].pangkat=sc.nextInt();
    //     }

    //     System.out.println("============================================");
    //     System.out.println("Hasil Pangkat dengan Brute Force");
    //     for (int i=0;i<elemen;i++){
    //         System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah "+png[i].PangkatBF(png[i].nilai,png[i].pangkat));
    //     }
    //     System.out.println("============================================");
    //     System.out.println("Hasil Pangkat dengan Divide and Conquer");
    //     for (int i=0;i<elemen;i++){
    //         System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah "+png[i].PangkatDC(png[i].nilai,png[i].pangkat));
    //     }
    //     System.out.println("============================================");

    // }
}
}