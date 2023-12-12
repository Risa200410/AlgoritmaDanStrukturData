package AlgoritmaDanStrukturData.Pertemuan16.Tugas;

import java.util.*;

public class Main {
    Queue<String> queueNIM = new LinkedList<>();
    List<Mahasiswa> mhs = new ArrayList<>();
    List<MataKuliah> mk = new ArrayList<>();
    List<Nilai> nil = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    void setData(){
        mhs.add(new Mahasiswa("12345", "Maritza", "628111"));
        mhs.add(new Mahasiswa("12346", "Ulfa", "628222"));
        mhs.add(new Mahasiswa("12347", "Huriyah", "628333"));
        mhs.add(new Mahasiswa("12348", "Falah", "628444"));

        mk.add(new MataKuliah("1", "Agama", "4"));
        mk.add(new MataKuliah("2", "Basis Data", "3"));
        mk.add(new MataKuliah("3", "Matematika", "2"));
    }

    void inputNilai() {
        System.out.println("Masukkan Data");
        System.out.print("Kode    : ");
        String kode = sc.next();
        System.out.print("Nilai   : ");
        double nilai = sc.nextDouble();
        System.out.println("");
        System.out.println("************************************************");
        System.out.println("DAFTAR MAHASISWA");
        System.out.println("************************************************");
        System.out.printf("%-15s        %-15s   %-14s\n", "NIM", "Nama", "No. Telp");
        for(Mahasiswa mahasiswa : mhs) {
            System.out.printf("%-15s        %-15s   %-14s\n", mahasiswa.nim, mahasiswa.nama, mahasiswa.noHp);
        }
        boolean found = true;
        String pilMhs;
        int confirm = 0;
        do {
            System.out.print("Pilih Mahasiswa berdasarkan NIM : ");
            pilMhs = sc.next();
            for(Mahasiswa mahasiswa : mhs) {
                if(pilMhs.equals(mahasiswa.nim)) {
                    found = false;
                    confirm++;
                }
            }
            if(confirm == 0) {
                System.out.println("Data Kode NIM Tidak Ditemukan");
            }
        } while (found);
        System.out.println("");
        System.out.println("DAFTAR MATA KULIAH");
        System.out.println("************************************************");
        System.out.printf("%-15s        %-40s   %-40s\n", "Kode", "Mata Kuliah", "SKS");
        for(MataKuliah matkul : mk) {
            System.out.printf("%-15s        %-40s   %-40s\n", matkul.kode, matkul.matkul, matkul.sks);
        }
        boolean found1 = true;
        String pilMatkul;
        int confirm2 = 0;
        do {
            System.out.print("Pilih Mata Kuliah Berdasarkan Kode: ");
            pilMatkul = sc.next();
            for (MataKuliah matkul : mk){
                if(pilMatkul.equals(matkul.kode)) {
                    found1 = false;
                    confirm2++;
                }
            }
            if (confirm2 == 0) {
                System.out.println("Data Kode Mata Kuliah Tidak Ditemukan");
            }
        } while (found1);
        nil.add(new Nilai(kode, nilai, pilMatkul, pilMhs));
    }

    void tampilNilai() {
        System.out.println("NIM\tNama Mahasiswa\t\tMata Kuliah\t\tSKS\tNilai");
        nil.forEach(ns -> {
            System.out.print(ns.nimMhs + "\t");
            for(Mahasiswa mahasiswa : mhs) {
                if(mahasiswa.nim.equals(ns.nimMhs)) {
                    System.out.print(mahasiswa.nama + "\t\t");
                }
            }
            for(MataKuliah matkul : mk) {
                if(matkul.kode.equals(ns.kdMatkul)) {
                    System.out.print("\t"+matkul.matkul + "\t\t" + matkul.sks + "\t");
                }
            }
            System.out.println(ns.nilai);
        });
    }

    void cariNilai() {
        tampilNilai();
        System.out.print("Masukkan Data Mahasiswa[nim] : ");
        String searchNIM = sc.next();
        int confirm3 = 0;
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("************************************************");
        System.out.println("NIM\t\tNama\t\tMata Kuliah\t\t\t\tSKS\tNilai");
        for(Nilai searchNilai : nil) {
            if(searchNilai.nimMhs.equals(searchNIM)) {
                System.out.print(searchNilai.nimMhs + "\t\t");
                for(Mahasiswa mahasiswa : mhs) {
                    if(mahasiswa.nim.equals(searchNilai.nimMhs)) {
                        System.out.print(mahasiswa.nama + "\t\t");
                    }
                }
                for(MataKuliah matkul : mk) {
                    if(matkul.kode.equals(searchNilai.kdMatkul)) {
                        System.out.print(matkul.matkul + "\t" + matkul.sks + "\t" + searchNilai.nilai);
                        System.out.println("\nTotal SKS " + matkul.sks + " telah diambil");
                    }
                }
                confirm3++;
            }
        }
        if(confirm3 == 0) {
            System.out.println("Data dengan NIM " + searchNIM + " Tidak Ditemukan");
        }
    }
    
    void urutNilai() {
        for(int i=0; i<nil.size()-1; i++) {
            for(int j=0; j<nil.size()-i-1; j++) {
                if(nil.get(j).nilai > nil.get(j+1).nilai) {
                    double swap = nil.get(j).nilai;
                    nil.get(j).nilai = nil.get(j+1).nilai;
                    nil.get(j+1).nilai = swap;
                }
            }
        }
        tampilNilai();
    }

    //TUGAS NO 2
    void hapusDataMahasiswa() {
        System.out.println("Hapus Data Mahasiswa");
        System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
        String nimHapus = sc.next();
        queueNIM.add(nimHapus);
        nil.removeIf(nilai -> nilai.nimMhs.equals(nimHapus));
        mhs.removeIf(mahasiswa -> mahasiswa.nim.equals(nimHapus));
        System.out.println("Data Mahasiswa dengan NIM " + nimHapus + " berhasil dihapus.");
    }
    

    public static void main(String[] args) {
        Main rs = new Main();
        int mn;
        rs.setData();
        do {
            System.out.println("************************************************");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("************************************************");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Hapus Data Mahasiswa");
            System.out.println("6. Keluar");

            System.out.println("************************************************");
            System.out.print("Pilih   : ");
            mn = sc.nextInt();
            switch (mn) {
                case 1:
                    rs.inputNilai();
                    break;
                case 2:
                    rs.tampilNilai();
                    break;
                case 3:
                    rs.cariNilai();
                    break;
                case 4:
                    rs.urutNilai();
                    break;
                case 5:
                    rs.hapusDataMahasiswa();
                    break;
                case 6:
                    System.out.println("Keluar Program");
                    System.exit(0);
                default:
                    System.out.println("Menu tidak ada!");
                    System.exit(0);
            }
        } while (mn > 0 && mn < 7);
    }
}