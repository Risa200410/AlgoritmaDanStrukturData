package AlgoritmaDanStrukturData.Pertemuan2;

    import java.util.Scanner;

public class Nasabah {
    
    public String nama, alamat;
    public int id,noHP, noRek, saldo;
    public float jmlHutang;
    public boolean statusAktif;
    public int[] rekening;
    public int jumlahRekening;
    public static final int MAX_REKENING = 3;
    public Scanner sc=new Scanner (System.in);

    
    // TUGAS NO 1 DAN 2
    // public Nasabah(int Id, String nama, String alamat, int noHP, int noRek) {
    //     this.id = Id;
    //     this.nama = nama;
    //     this.alamat = alamat;
    //     this.noHP = noHP;
    //     this.noRek = noRek;
    //     this.saldo = 0;
    //     this.jmlHutang = 0.0f;
    //     this.statusAktif = false;   
    // }  
    //
    // public int lihatSaldo() {
    //     if (!statusAktif) {
    //         System.out.println("Anda belum memiliki rekening aktif.");
    //         return 0;
    //     }
    //     return saldo;
    // }
    //
    // public int menabung(int deposit) {
    //     if (!statusAktif) {
    //         System.out.println("Anda belum memiliki rekening aktif.");
    //         return 0;
    //     }
    //     saldo += deposit;
    //     return saldo;
    // }
    // 
    // public int tarikTunai(int jmlTarik) {
    //     if (!statusAktif) {
    //         System.out.println("Anda belum memiliki rekening aktif.");
    //         return 0;
    //     }
    //     if(jmlTarik <= saldo) {
    //         saldo -= jmlTarik;
    //     } else {
    //         System.out.println("Saldo tidak mencukupi!");
    //     }
    //     return saldo;
    // }
    //
    // public void bukaRekening() {
    //     statusAktif = true;
    //     System.out.println("Rekening telah dibuka. Anda sekarang memiliki rekening aktif.");
    // }
    //
    // public void tutupRekening() {
    //     statusAktif = !statusAktif;
    //     System.out.println("Rekening Anda sekarang " + (statusAktif ? "aktif" : "tidak aktif"));
    // }
    //
    // public void berhutang(){
    //     System.out.println("Masukkan nominal yang dipinjam: ");
    //     jmlHutang=sc.nextFloat();
    //     if (jmlHutang>= saldo){
    //         System.out.println("Maaf ajuan peminjaman ditolak");
    //     } else {
    //         System.out.println("Ajuan pinjaman diterima, jumlah pinjaman: "+jmlHutang);
    //         float cicilan=(int) jmlHutang/6;
    //         System.out.println("Cicilan tiap bulan selama 6 bulan : " +cicilan);
    //     }
    // }



    //TUGAS NOMOR 3
     public Nasabah(int Id, String nama, String alamat, int noHP, int noRek) {
        this.id = Id;
        this.nama = nama;
        this.alamat = alamat;
        this.noHP = noHP;
        this.noRek = noRek;
        this.saldo = 0;
        this.jmlHutang = 0.0f;
        this.statusAktif = false;
        rekening = new int[MAX_REKENING];
        jumlahRekening = 0;
    }  

    public int lihatSaldo() {
        if (!statusAktif) {
            System.out.println("Anda belum memiliki rekening aktif.");
            return 0;
        }
        return saldo;
    }
    
    public int menabung(int deposit) {
        if (!statusAktif) {
            System.out.println("Anda belum memiliki rekening aktif.");
            return 0;
        }
        saldo += deposit;
        return saldo;
    }
    
    public int tarikTunai(int jmlTarik) {
        if (!statusAktif) {
            System.out.println("Anda belum memiliki rekening aktif.");
            return 0;
        }
        if(jmlTarik <= saldo) {
            saldo -= jmlTarik;
        } else {
            System.out.println("Saldo tidak mencukupi!");
        }
        return saldo;
    }
    
    public void bukaRekening(int noRekBaru) {
        if (jumlahRekening < MAX_REKENING) {
            System.out.print("Masukkan nomor rekening baru: ");
            noRekBaru=sc.nextInt();
            rekening[jumlahRekening++] = noRekBaru;
            System.out.println("Rekening dengan nomor " + noRekBaru + " berhasil dibuka.");
        } else {
            System.out.println("Anda telah mencapai batas maksimal jumlah rekening!");
        }
    }
    
    public void tutupRekening() {
        statusAktif = !statusAktif;
        System.out.println("Rekening Anda sekarang " + (statusAktif ? "aktif" : "tidak aktif"));
    }

    public void berhutang(){
        System.out.println("Masukkan nominal yang dipinjam: ");
        jmlHutang=sc.nextFloat();
        if (jmlHutang>= saldo){
            System.out.println("Maaf ajuan peminjaman ditolak");
        } else {
            System.out.println("Ajuan pinjaman diterima, jumlah pinjaman: "+jmlHutang);
            float cicilan=(int) jmlHutang/6;
            System.out.println("Cicilan tiap bulan selama 6 bulan : " +cicilan);
        }
    }

}