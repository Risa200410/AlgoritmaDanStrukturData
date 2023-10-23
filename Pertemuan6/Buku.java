package AlgoritmaDanStrukturData.Pertemuan6;
public class Buku {
    String judul;
    int jmlHal; 
    double ukuranBuku;

    Buku(String j, int jml, double ukuran){
        judul = j;
        jmlHal = jml;
        ukuranBuku = ukuran;
    }

    public void tampil(){
        String ukuran = " ";
        if(ukuranBuku == 33){
            ukuran = "B5";
        }else if(ukuranBuku == 25){
            ukuran = "A4";
        }else if(ukuranBuku == 7){
            ukuran = "A6";
        }else if(ukuranBuku == 30){
            ukuran = "B3";
        }else if(ukuranBuku == 22.5){
            ukuran = "B4";
        }else if(ukuranBuku == 34){
            ukuran = "B5";
        }else if(ukuranBuku == 88.9){
            ukuran = "B2";
        }else if(ukuranBuku == 67){
            ukuran = "F4";
        }
        System.out.println("Judul Buku: " + judul);
        System.out.println("Jumlah Buku: " + jmlHal);
        System.out.println("Ukuran Buku: " + ukuran);
    }
}
