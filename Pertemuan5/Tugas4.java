package AlgoritmaDanStrukturData.Pertemuan5;
import java.util.Scanner;
public class Tugas4 {

    private String NIK;
    private String nama;
    private String alamat;
    private String jenisKelamin;

    public Tugas4(String NIK, String nama, String alamat, String jenisKelamin) {
        this.NIK = NIK;
        this.nama = nama;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }

    public String getNIK() {
        return NIK;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }
}
